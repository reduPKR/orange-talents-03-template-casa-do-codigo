package br.com.casa.codigo.casa_do_codigo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RessourceExceptionHandler {

    @ExceptionHandler(ErroNoCadastroException.class)
    public ResponseEntity<RespostaPersonalizadaException> respostaEmail(ErroNoCadastroException erro, HttpServletRequest request){
        RespostaPersonalizadaException emailException =
                new RespostaPersonalizadaException(400, "Email duplicado", erro.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(emailException);
    }
}
