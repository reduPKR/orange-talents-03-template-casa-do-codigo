package br.com.casa.codigo.casa_do_codigo.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class RespostaPersonalizadaException implements Serializable {
    private Instant timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public RespostaPersonalizadaException(int status, String error, String message, String path) {
        this.timestamp = Instant.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
}
