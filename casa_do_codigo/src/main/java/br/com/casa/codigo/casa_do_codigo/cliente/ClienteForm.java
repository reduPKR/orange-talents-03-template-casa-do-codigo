package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.cliente.ClienteModel;
import br.com.casa.codigo.casa_do_codigo.cliente.ClienteSequenceProvider;
import br.com.casa.codigo.casa_do_codigo.cliente.TipoPessoa;
import br.com.casa.codigo.casa_do_codigo.cliente.contato.ContatoForm;
import br.com.casa.codigo.casa_do_codigo.cliente.contato.ContatoModel;
import br.com.casa.codigo.casa_do_codigo.cliente.endereco.EnderecoForm;
import br.com.casa.codigo.casa_do_codigo.cliente.endereco.EnderecoModel;
import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CnpjGroup;
import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CpfGroup;
import br.com.casa.codigo.casa_do_codigo.validador.unique.UniqueValue;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.group.GroupSequenceProvider;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@GroupSequenceProvider(ClienteSequenceProvider.class)
public class ClienteForm {
    @NotNull
    private String nome;
    @NotNull
    private String sobrenome;

    private TipoPessoa tipo;//FISICA/JURICA
    @NotNull
    @UniqueValue(domainClass = ClienteModel.class, fieldName = "documento")
    @CPF(groups = CpfGroup.class)
    @CNPJ(groups = CnpjGroup.class)
    private String documento;

    @OneToOne
    private ContatoForm contato;
    @OneToOne
    private EnderecoForm endereco;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public ContatoForm getContato() {
        return contato;
    }

    public EnderecoForm getEndereco() {
        return endereco;
    }

    public ClienteModel toModel() {
        return new ClienteModel(this.nome,
                this.sobrenome,
                this.documento,
                this.contato.toModel(),
                this.endereco.toModel());
    }
}
