package br.com.casa.codigo.casa_do_codigo.livro;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;
import br.com.casa.codigo.casa_do_codigo.validador.UniqueValue;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class LivroForm {
    @NotNull
    @NotEmpty
    @UniqueValue(domainClass = LivroModel.class, fieldName = "titulo")
    private String titulo;
    @NotNull
    @NotEmpty
    @Size(max = 500)
    private String resumo;
    private String sumario;
    @NotNull
    @NotEmpty
    @Min(value = 20)
    private double preco;
    @NotNull
    @NotEmpty
    @Min(100)
    private int numero_paginas;
    @NotNull
    @NotEmpty
    @UniqueValue(domainClass = LivroModel.class, fieldName = "isbn")
    private String isbn;
    @Future
    private LocalDate publicacao;
    @NotNull
    @ManyToOne
    private CategoriaModel categoria;
    @NotNull
    @ManyToOne
    private AutorModel autor;

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

    public int getNumero_paginas() {
        return numero_paginas;
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
