package com.aluracursos.screenmatch.model;


import com.aluracursos.screenmatch.calculos.Puntuacion;
import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;
import com.google.gson.annotations.SerializedName;

public class Pelicula extends Titulo implements Puntuacion {

    private final LoggerBase logger;

    public Pelicula(String tipo, String nombre, String fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan, String director) {
        super(tipo, nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan, director);
        this.logger = new LoggerBaseImpl(Pelicula.class.getName());
    }

    @Override
    public int getPuntuacion() { return (int) (calculamedia() / 2); }

    @Override
    public String toString() {
        return String.format("Pelicula: %s, año (%s)", getNombre(), getFechaDeLanzamiento());
    }
}
