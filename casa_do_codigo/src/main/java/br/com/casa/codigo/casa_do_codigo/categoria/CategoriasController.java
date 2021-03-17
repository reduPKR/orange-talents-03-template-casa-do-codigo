package br.com.casa.codigo.casa_do_codigo.categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;


@RestController
@RequestMapping("/categorias")
public class CategoriasController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<CategoriaDTO> cadastrar(@Valid @RequestBody CategoriaForm categoriaForm){
        CategoriaModel categoria = categoriaForm.toModel();
        categoriaRepository.save(categoria);

        if(categoria.getId() != 0)
            return ResponseEntity.ok(new CategoriaDTO(categoria));
        return ResponseEntity.badRequest().build();
    }
}
