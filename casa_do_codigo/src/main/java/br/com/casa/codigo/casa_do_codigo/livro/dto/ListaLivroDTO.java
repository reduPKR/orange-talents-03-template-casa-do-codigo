package br.com.casa.codigo.casa_do_codigo.livro.dto;

import br.com.casa.codigo.casa_do_codigo.livro.LivroModel;

import java.util.List;
import java.util.stream.Collectors;

public class ListaLivroDTO {
    private Long id;
    private String titulo;

    public ListaLivroDTO(LivroModel livroModel){
        this.id = livroModel.getId();
        this.titulo = livroModel.getTitulo();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public static List<ListaLivroDTO> converter(List<LivroModel> lista) {
        return lista.stream().map(ListaLivroDTO::new).collect(Collectors.toList());
    }
}
