package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisModel;

import javax.validation.constraints.NotNull;

public class EstadoForm {
    @NotNull
    private String nome;
    @NotNull
    private PaisModel pais;

    public String getNome() {
        return nome;
    }

    public PaisModel getPais() {
        return pais;
    }
}
