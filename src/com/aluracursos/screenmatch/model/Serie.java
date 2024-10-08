package com.aluracursos.screenmatch.model;

import com.aluracursos.screenmatch.calculos.Puntuacion;

public class Serie extends Titulo implements Puntuacion {
    private final int temporadas;
    private final int episodiosPorTemporada;

    public Serie(String tipo, String nombre, String fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan, int temporadas, int episodiosPorTemporada, String director) {
        super(tipo, nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan, director);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // Getters and Setters
    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    @Override
    public int getDuracionEnMinutos(){
        return getTemporadas() * getEpisodiosPorTemporada() * getDuracionEnMinutos();

    }

    @Override
    public String toString() {
        return String.format("Serie: %s, año (%s)", getNombre(), getFechaDeLanzamiento());
    }

    @Override
    public int getPuntuacion() { return (int) (calculamedia() / 2); }
}
