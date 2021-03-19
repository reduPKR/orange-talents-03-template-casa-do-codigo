package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CpfGroup;
import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.ArrayList;
import java.util.List;

public class ClienteSequenceProvider implements DefaultGroupSequenceProvider<ClienteForm> {
    @Override
    public List<Class<?>> getValidationGroups(ClienteForm cliente) {
        List<Class<?>> groups = new ArrayList<>();
        groups.add(ClienteForm.class);

        if(isTipo(cliente)){
            groups.add(cliente.getTipo().getGroup());
        }else{
            groups.add(CpfGroup.class);
        }

        return groups;
    }

    private boolean isTipo(ClienteForm cliente) {
        return cliente != null && cliente.getTipo() != null;
    }
}
