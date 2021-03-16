package br.com.casa.codigo.casa_do_codigo.categoria;

public class CategoriaDTO {
    private String nome;

    public CategoriaDTO(CategoriaModel categoria) {
        this.nome = categoria.getNome();
    }

    public String getNome() {
        return nome;
    }
}
