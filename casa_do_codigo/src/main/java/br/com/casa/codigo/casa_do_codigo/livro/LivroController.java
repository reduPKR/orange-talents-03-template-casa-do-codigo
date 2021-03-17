package br.com.casa.codigo.casa_do_codigo.livro;

import br.com.casa.codigo.casa_do_codigo.livro.dto.ListaLivroDTO;
import br.com.casa.codigo.casa_do_codigo.livro.dto.LivroDTO;
import br.com.casa.codigo.casa_do_codigo.livro.dto.LivroDetalheDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<LivroDTO> cadastrar(@Valid @RequestBody LivroForm livroForm){
        LivroModel livro = livroForm.toModel();
        livroRepository.save(livro);

        if(livro.getId() != 0)
            return ResponseEntity.ok(new LivroDTO(livro));
        return ResponseEntity.badRequest().build();
    }

    @GetMapping
    public List<ListaLivroDTO> listar(){
        return ListaLivroDTO.converter(livroRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroDetalheDTO> exibir(@PathVariable Long id){
        Optional<LivroModel> optional = livroRepository.findById(id);

        if(optional.isPresent()) {
            LivroDetalheDTO livroDetalhe = new LivroDetalheDTO(optional.get());
            return ResponseEntity.ok(livroDetalhe);
        }
        return ResponseEntity.notFound().build();
    }
}
