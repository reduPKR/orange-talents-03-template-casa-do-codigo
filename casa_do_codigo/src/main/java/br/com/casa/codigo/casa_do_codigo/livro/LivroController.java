package br.com.casa.codigo.casa_do_codigo.livro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar(){
        return null;
    }
}
