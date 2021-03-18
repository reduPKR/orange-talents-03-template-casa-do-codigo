package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisModel;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class EstadoDTO {
    private long id;
    private String nome;
    private PaisModel pais;

    public EstadoDTO(EstadoModel estado) {
        this.id = estado.getId();
        this.nome = estado.getNome();
        this.pais = estado.getPais();
    }

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
