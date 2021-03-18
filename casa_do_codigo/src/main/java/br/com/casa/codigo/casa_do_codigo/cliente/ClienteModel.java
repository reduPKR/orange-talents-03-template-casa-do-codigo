package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.cliente.contato.ContatoModel;
import br.com.casa.codigo.casa_do_codigo.cliente.endereco.EnderecoModel;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;

@Entity
@Table(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String nome;
    @NotNull
    private String sobrenome;
    @NotNull
    @Column(unique = true)
    @CPF(CpfGroup.class)
    @CNPJ(CnpjGroup.class)
    private String documento;
    @OneToOne
    private ContatoModel contato;
    @OneToOne
    private EnderecoModel endereco;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public ContatoModel getContato() {
        return contato;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }
}
