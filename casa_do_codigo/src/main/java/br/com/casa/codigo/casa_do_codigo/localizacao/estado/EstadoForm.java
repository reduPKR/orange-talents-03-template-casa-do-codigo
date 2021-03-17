package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisModel;
import br.com.casa.codigo.casa_do_codigo.validador.UniqueValue;

import javax.validation.constraints.NotNull;

public class EstadoForm {
    @NotNull
    @UniqueValue(domainClass = EstadoModel.class, fieldName = "nome")
    private String nome;
    @NotNull
    private PaisModel pais;

    public EstadoForm() {
    }

    public String getNome() {
        return nome;
    }

    public PaisModel getPais() {
        return pais;
    }
}
