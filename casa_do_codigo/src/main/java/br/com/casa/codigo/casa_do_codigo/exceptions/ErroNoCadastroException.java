package br.com.casa.codigo.casa_do_codigo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErroNoCadastroException extends RuntimeException{
    public ErroNoCadastroException(String message) {
        super(message);
    }
}
