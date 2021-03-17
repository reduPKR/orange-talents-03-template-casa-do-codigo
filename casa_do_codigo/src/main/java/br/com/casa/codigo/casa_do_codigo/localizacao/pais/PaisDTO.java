package br.com.casa.codigo.casa_do_codigo.localizacao.pais;

public class PaisDTO {
    private long id;
    private String nome;

    public PaisDTO() {
    }

    public PaisDTO(PaisModel pais) {
        this.id = pais.getId();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
