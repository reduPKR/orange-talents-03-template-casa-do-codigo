package br.com.casa.codigo.casa_do_codigo.autor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "autores")
public class AutorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String nome;
    @NotNull
    @Size(max = 400)
    private String descricao;
    @NotNull
    @Email
    private String email;
    @NotNull
    private LocalDateTime instanteCriacao;

    public AutorModel() {
    }

    public AutorModel(@NotNull String nome, @NotNull @Size(max = 400) String descricao, @NotNull @Email String email) {
        this.id = 0;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.instanteCriacao = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getInstanteCriacao() {
        return instanteCriacao;
    }
}
