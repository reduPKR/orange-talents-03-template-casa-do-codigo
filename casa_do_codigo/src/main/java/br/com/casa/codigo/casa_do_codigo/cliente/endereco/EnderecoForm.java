package br.com.casa.codigo.casa_do_codigo.cliente.endereco;

import br.com.casa.codigo.casa_do_codigo.localizacao.estado.EstadoModel;

import javax.validation.constraints.NotNull;

public class EnderecoForm {
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
