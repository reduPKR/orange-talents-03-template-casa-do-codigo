package br.com.casa.codigo.casa_do_codigo.autor.forms;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
