package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CnpjGroup;
import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CpfGroup;

public enum TipoPessoa {
    CPF(CpfGroup.class),
    CNPJ(CnpjGroup.class);

    private final Class<?> group;

    TipoPessoa(Class<?> group) {
        this.group = group;
    }

    public Class<?> getGroup() {
        return group;
    }
}
