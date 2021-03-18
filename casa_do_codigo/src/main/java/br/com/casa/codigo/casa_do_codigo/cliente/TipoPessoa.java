package br.com.casa.codigo.casa_do_codigo.cliente;

import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CnpjGroup;
import br.com.casa.codigo.casa_do_codigo.validador.cpfCnpj.CpfGroup;

public enum TipoPessoa {
    FISICA("CPF", "000.000.000-00", CpfGroup.class),
    JURIDICA("CNPJ", "00.000.000/0000-00", CnpjGroup.class);

    private final String tipo;
    private final String mascara;
    private final Class<?> group;

    TipoPessoa(String tipo, String mascara, Class<?> group) {
        this.tipo = tipo;
        this.mascara = mascara;
        this.group = group;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMascara() {
        return mascara;
    }

    public Class<?> getGroup() {
        return group;
    }
}
