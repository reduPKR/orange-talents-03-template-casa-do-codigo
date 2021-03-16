package br.com.casa.codigo.casa_do_codigo.autor;

import br.com.casa.codigo.casa_do_codigo.autor.forms.AutorForm;
import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    @Transactional
    private ResponseEntity<AutorDTO> cadastrar(@Valid @RequestBody AutorForm autorForm){
        AutorModel autor = autorForm.toModel();
        autorRepository.save(autor);

        if(autor.getId() != 0)
            return ResponseEntity.ok(new AutorDTO(autor));
        return ResponseEntity.badRequest().build();
    }
}
