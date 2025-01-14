package br.com.casa.codigo.casa_do_codigo.localizacao.pais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisRepository paisRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<PaisDTO> cadastrar(@Valid @RequestBody PaisForm paisForm){
        PaisModel pais = paisForm.converter();
        paisRepository.save(pais);

        if(pais.getId() != 0)
            return ResponseEntity.ok(new PaisDTO(pais));
        return ResponseEntity.badRequest().build();
    }
}
