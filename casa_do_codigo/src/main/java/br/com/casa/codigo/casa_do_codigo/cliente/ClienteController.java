package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.autor.AutorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<ClienteDTO> cadastrar(@Valid @RequestBody ClienteForm clienteForm){
        ClienteModel cliente = clienteForm.toModel();

        if(cliente.getId() != 0)
            return ResponseEntity.ok(new ClienteDTO(cliente));
        return ResponseEntity.badRequest().build();

    }
}
