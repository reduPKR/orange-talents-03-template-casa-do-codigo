package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "estados")
public class EstadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String nome;
    @ManyToOne
    private PaisModel pais;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public PaisModel getPais() {
        return pais;
    }
}
