package br.com.casa.codigo.casa_do_codigo.categoria;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categorias")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique = true)
    private String nome;

    public CategoriaModel(@NotNull String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
