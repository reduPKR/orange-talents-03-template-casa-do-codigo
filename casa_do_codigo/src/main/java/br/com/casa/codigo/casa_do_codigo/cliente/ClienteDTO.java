package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.cliente.contato.ContatoModel;
import br.com.casa.codigo.casa_do_codigo.cliente.endereco.EnderecoModel;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class ClienteDTO {
    private long id;
    private String nome;
    private String sobrenome;
    private String documento;
    private ContatoModel contato;
    private EnderecoModel endereco;

    public ClienteDTO(ClienteModel cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.sobrenome = cliente.getSobrenome();
        this.documento = cliente.getDocumento();
        this.contato = cliente.getContato();
        this.endereco = cliente.getEndereco();
    }

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
