package br.com.casa.codigo.casa_do_codigo.autor;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;
import br.com.casa.codigo.casa_do_codigo.autor.AutorRepository;
import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;
import br.com.casa.codigo.casa_do_codigo.validador.UniqueValue;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Optional;

public class AutorForm {
    @NotNull
    @NotEmpty
    private String nome;
    @NotNull
    @NotEmpty
    @Size(max = 400)
    private String descricao;
    @NotNull
    @NotEmpty
    @Email
    @UniqueValue(domainClass = AutorModel.class, fieldName = "email")
    private String email;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEmail() {
        return email;
    }

    public AutorModel toModel(){
        return new AutorModel(this.nome, this.descricao, this.email);
    }
}
