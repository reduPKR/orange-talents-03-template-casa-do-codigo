package br.com.casa.codigo.casa_do_codigo.cliente;

import org.springframework.beans.factory.annotation.Autowired;
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
    public void cadastrar(@Valid @RequestBody ClienteForm clienteForm){
        System.out.println("\n\n\nteste");
        System.out.println(clienteForm.getNome());
        System.out.println(clienteForm.getSobrenome());
        System.out.println(clienteForm.getTipo());
        System.out.println(clienteForm.getDocumento());
        System.out.println(clienteForm.getContato().getEmail());
        System.out.println(clienteForm.getContato().getTelefone());
        System.out.println(clienteForm.getEndereco().getEndereco());
        System.out.println(clienteForm.getEndereco().getCep());
        System.out.println(clienteForm.getEndereco().getCidade());
        System.out.println(clienteForm.getEndereco().getComplemento());
        System.out.println(clienteForm.getEndereco().getEstado().getId());
    }
}
