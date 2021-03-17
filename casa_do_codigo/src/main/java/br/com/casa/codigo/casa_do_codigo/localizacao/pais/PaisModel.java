package br.com.casa.codigo.casa_do_codigo.localizacao.pais;

import br.com.casa.codigo.casa_do_codigo.validador.UniqueValue;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pais")
public class PaisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique = true)
    private String nome;

    public PaisModel() {
    }

    public PaisModel(String nome) {
        this.id = 0;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
