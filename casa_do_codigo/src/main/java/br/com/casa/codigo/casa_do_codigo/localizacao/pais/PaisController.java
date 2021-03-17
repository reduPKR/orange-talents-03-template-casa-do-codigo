package br.com.casa.codigo.casa_do_codigo.localizacao.pais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisRepository paisRepository;

    
}
