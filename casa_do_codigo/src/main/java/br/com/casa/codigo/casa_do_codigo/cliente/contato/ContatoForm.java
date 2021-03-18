package br.com.casa.codigo.casa_do_codigo.cliente.contato;

import br.com.casa.codigo.casa_do_codigo.validador.unique.UniqueValue;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class ContatoForm {
    @Email
    @NotNull
    @UniqueValue(domainClass = ContatoModel.class, fieldName = "email")
    private String email;
    @NotNull
    private String telefone;

}
