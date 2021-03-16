package br.com.casa.codigo.casa_do_codigo.exceptions;

import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;
import br.com.casa.codigo.casa_do_codigo.exceptions.RespostaPersonalizadaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ErroNoCadastroException.class)
    public ResponseEntity<RespostaPersonalizadaException> resposta(ErroNoCadastroException erro, HttpServletRequest request){
        RespostaPersonalizadaException exception =
                new RespostaPersonalizadaException(400, erro.getErro(), erro.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception);
    }
}
