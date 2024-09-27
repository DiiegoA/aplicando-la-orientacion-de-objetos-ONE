package com.aluracursos.ejercicio1.model;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Musica extends Audio {

    private final LoggerBase logger;

    // Constructor con los primeros 5 parámetros
    public Musica(String titulo, String autor, int duracion, int fechaDeLanzamiento, int numeroDeReproducciones) {
        super(titulo, autor, duracion, fechaDeLanzamiento, numeroDeReproducciones); // Llamada al constructor del padre
        this.logger = new LoggerBaseImpl(Musica.class.getName()); // Corregido para usar Musica.class
    }

    // Constructor con los otros parámetros
    public Musica(int numeroDeMeGusta, String genero, Boolean incluidoEnElPlan, String idioma) {
        super(numeroDeMeGusta,genero, incluidoEnElPlan, idioma); // Llamada al constructor del padre
        this.logger = new LoggerBaseImpl(Musica.class.getName()); // Corregido para usar Musica.class
    }

    // Método específico de la clase Musica
    public void mostrarTipoDeMusica() {
        logger.logInfo("El tipo de música es: " + getGenero()); // Acceso mediante el getter
    }

    @Override
    public int getCalificacion() {
        if (getNumeroDeMeGusta() > 5000){
            return 5;
        } else {
            return 2;
        }
    }

    @Override
    public void reproducir() {
        // Sobrescribir el comportamiento para Musica
        logger.logInfo("Reproduciendo la música: " + getTitulo() + " por " + getAutor());
    }

    public String getTipoDeMusica() {
        return getGenero(); // Acceso mediante el getter
    }

    public void setTipoDeMusica(String tipoDeMusica) {
        setGenero(tipoDeMusica); // Acceso mediante el setter
    }
}

