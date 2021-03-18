package br.com.casa.codigo.casa_do_codigo.categoria;

import br.com.casa.codigo.casa_do_codigo.validador.unique.UniqueValue;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class CategoriaForm {
    @NotNull
    @NotEmpty
    @UniqueValue(domainClass = CategoriaModel.class, fieldName = "nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public CategoriaModel toModel(){
        return new CategoriaModel(this.nome);
    }
}
