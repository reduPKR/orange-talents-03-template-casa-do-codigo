package br.com.casa.codigo.casa_do_codigo.cliente.endereco;

import br.com.casa.codigo.casa_do_codigo.localizacao.estado.EstadoModel;
import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "enderecos")
public class EnderecoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String endereco;
    @NotNull
    private String complemento;
    @NotNull
    private String cidade;
    @NotNull
    private EstadoModel estadoModel;
    @NotNull
    private String cep;

    public long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public EstadoModel getEstadoModel() {
        return estadoModel;
    }

    public String getCep() {
        return cep;
    }
}
