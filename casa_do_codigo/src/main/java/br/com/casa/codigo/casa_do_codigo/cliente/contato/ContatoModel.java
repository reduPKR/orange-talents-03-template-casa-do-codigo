package br.com.casa.codigo.casa_do_codigo.cliente.contato;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contatos")
public class ContatoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Email
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    private String telefone;

    public ContatoModel() {
    }

    public ContatoModel(@Email @NotNull String email, @NotNull String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
