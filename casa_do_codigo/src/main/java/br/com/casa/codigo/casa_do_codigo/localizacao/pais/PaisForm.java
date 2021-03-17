package br.com.casa.codigo.casa_do_codigo.localizacao.pais;

import br.com.casa.codigo.casa_do_codigo.validador.UniqueValue;

import javax.validation.constraints.NotNull;

public class PaisForm {
    @NotNull
    @UniqueValue(domainClass = PaisModel.class, fieldName = "nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public PaisModel converter() {
        return new PaisModel(this.nome);
    }
}
