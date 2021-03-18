package br.com.casa.codigo.casa_do_codigo.cliente.contato;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "contatos")
public class ContatoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Email
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telefone;

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
