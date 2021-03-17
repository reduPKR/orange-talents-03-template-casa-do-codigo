package br.com.casa.codigo.casa_do_codigo.livro;

import br.com.casa.codigo.casa_do_codigo.livro.dto.LivroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

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
}
