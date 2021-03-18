package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private PaisRepository paisRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<EstadoDTO> cadastrar(EstadoForm estadoForm){
        estadoForm.validar(estadoRepository, paisRepository);
        EstadoModel estado = estadoForm.converter();
        estadoRepository.save(estado);

        if(estado.getId() != 0)
            return ResponseEntity.ok(new EstadoDTO(estado));
        return ResponseEntity.badRequest().build();
    }
}
