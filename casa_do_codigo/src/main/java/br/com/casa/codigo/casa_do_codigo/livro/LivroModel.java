package br.com.casa.codigo.casa_do_codigo.livro;

import br.com.casa.codigo.casa_do_codigo.autor.AutorModel;
import br.com.casa.codigo.casa_do_codigo.categoria.CategoriaModel;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "livros")
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique = true)
    private String titulo;
    @NotNull
    @Size(max = 500)
    private String resumo;
    private String sumario;
    @NotNull
    @Min(value = 20)
    private double preco;
    @NotNull
    @Min(100)
    private int numeroPaginas;
    @NotNull
    @Column(unique = true)
    private String isbn;
    @Future
    private LocalDate publicacao;
    @NotNull
    @ManyToOne
    private CategoriaModel categoria;
    @NotNull
    @ManyToOne
    private AutorModel autor;

    public LivroModel() {
    }

    public LivroModel(String titulo, String resumo, String sumario, double preco, int numeroPaginas, String isbn, LocalDate publicacao, CategoriaModel categoria, AutorModel autor) {
        this.id = 0;
        this.titulo = titulo;
        this.resumo = resumo;
        this.sumario = sumario;
        this.preco = preco;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.publicacao = publicacao;
        this.categoria = categoria;
        this.autor = autor;

    }

    public long getId() {
        return id;
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
