package br.com.casa.codigo.casa_do_codigo.livro;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;
import br.com.casa.codigo.casa_do_codigo.validador.unique.UniqueValue;
import com.fasterxml.jackson.annotation.JsonFormat;

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
    @Min(value = 20)
    private double preco;
    @Min(100)
    private int numeroPaginas;
    @NotNull
    @NotEmpty
    @UniqueValue(domainClass = LivroModel.class, fieldName = "isbn")
    private String isbn;
    @Future
    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
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

    public LivroModel toModel() {
        return new LivroModel(
            this.titulo,
            this.resumo,
            this.sumario,
            this.preco,
            this.numeroPaginas,
            this.isbn,
            this.publicacao,
            this.categoria,
            this.autor
        );
    }
}
