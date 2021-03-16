package br.com.casa.codigo.casa_do_codigo.categoria.forms;

import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaRepository;
import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Optional;

public class CategoriaForm {
    @NotNull
    @NotEmpty
    private String nome;

    public String getNome() {
        return nome;
    }

    public CategoriaModel toModel(){
        return new CategoriaModel(this.nome);
    }

    public boolean validarNome(CategoriaRepository categoriaRepository) {
        Optional<CategoriaModel> categoria = categoriaRepository.findByNome(this.nome);
        System.out.println(categoria.get().getNome());

        if(categoria.isEmpty())
            return true;
        throw new ErroNoCadastroException("Categoria com nome: "+this.nome+" já está cadastrado", "Nome da categoria duplicado");
    }
}
