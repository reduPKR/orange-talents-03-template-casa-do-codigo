package br.com.casa.codigo.casa_do_codigo.livro.dto;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;

import java.time.LocalDate;

public class ListaLivroDTO {
    private String id;
    private String titulo;

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
}
