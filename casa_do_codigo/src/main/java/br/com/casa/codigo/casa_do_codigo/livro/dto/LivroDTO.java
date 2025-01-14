package br.com.casa.codigo.casa_do_codigo.livro.dto;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;
import br.com.casa.codigo.casa_do_codigo.livro.LivroModel;

import java.time.LocalDate;

public class LivroDTO {
    private String titulo;
    private String resumo;
    private String sumario;
    private double preco;
    private int numeroPaginas;
    private String isbn;
    private LocalDate publicacao;
    private CategoriaModel categoria;
    private AutorModel autor;

    public LivroDTO(LivroModel livro) {
        this.titulo = livro.getTitulo();
        this.resumo = livro.getResumo();
        this.sumario = livro.getSumario();
        this.preco = livro.getPreco();
        this.numeroPaginas = livro.getNumeroPaginas();
        this.isbn = livro.getIsbn();
        this.publicacao = livro.getPublicacao();
        this.categoria = livro.getCategoria();
        this.autor = livro.getAutor();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String getSumario() {
        return sumario;
    }

    public double getPreco() {
        return preco;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicacao() {
        return publicacao;
    }

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public AutorModel getAutor() {
        return autor;
    }
}
