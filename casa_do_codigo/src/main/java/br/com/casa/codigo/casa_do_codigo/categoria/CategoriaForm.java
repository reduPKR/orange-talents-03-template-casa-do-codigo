package br.com.casa.codigo.casa_do_codigo.categoria;

import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaRepository;
import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;
import br.com.casa.codigo.casa_do_codigo.validador.UniqueValue;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Optional;


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
