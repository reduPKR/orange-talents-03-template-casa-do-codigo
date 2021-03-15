package br.com.casa.codigo.casa_do_codigo.autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class AutorDTO {
    private long id;
    private String nome;
    private String descricao;
    private String email;
    private LocalDateTime instanteCriacao;

    public AutorDTO(AutorModel autor) {
        this.id = autor.getId();
        this.nome = autor.getNome();
        this.descricao = autor.getDescricao();
        this.email = autor.getEmail();
        this.instanteCriacao = autor.getInstanteCriacao();
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
