package com.aluracursos.screenmatch.model;


import com.aluracursos.screenmatch.calculos.Puntuacion;
import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Pelicula extends Titulo implements Puntuacion {

    private final String director;
    private final LoggerBase logger;

    public Pelicula(String tipo, String nombre, int fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan, String director) {
        super(tipo, nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan);
        this.director = director;
        this.logger = new LoggerBaseImpl(Pelicula.class.getName());
    }

    public void imprimirDirector(){
        logger.logInfo("Director: " + director);
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getPuntuacion() { return (int) (calculamedia() / 2); }

    @Override
    public String toString() {
        return String.format("Pelicula: %s, año (%d)", getNombre(), getFechaDeLanzamiento());
    }
}
