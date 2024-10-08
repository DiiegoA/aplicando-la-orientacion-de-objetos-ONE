package com.aluracursos.screenmatch.excepcion;

public class ErrorDuracionException extends RuntimeException {

    private final String mensaje;

    public ErrorDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String getMessage() {
        return this.getMensaje();
    }
}
