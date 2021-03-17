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
    @UniqueValue(domainClass = PaisModel.class, fieldName = "nome")
    private String nome;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
