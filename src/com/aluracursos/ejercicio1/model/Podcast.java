package com.aluracursos.ejercicio1.model;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Podcast extends Audio {

    private final LoggerBase logger;

    // Constructo
    public Podcast(String titulo, String autor, int duracion, int fechaDeLanzamiento, int numeroDeReproducciones) {
        super(titulo, autor, duracion, fechaDeLanzamiento, numeroDeReproducciones); // Llamada al constructor del padre
        this.logger = new LoggerBaseImpl(Podcast.class.getName());
        }

    public Podcast(int numeroDeMeGusta, String genero, Boolean incluidoEnElPlan, String idioma) {
        super(numeroDeMeGusta, genero, incluidoEnElPlan, idioma); // Llamada al constructor del padre
        this.logger = new LoggerBaseImpl(Podcast.class.getName());
    }


    // Método específico de la clase Podcast
    public void mostrarTema() {
        logger.logInfo("El tema del podcast es: " + getGenero());
    }

    @Override
    public int getCalificacion() {
        if (getNumeroDeReproducciones() >= 2000){
            return 5;
        } else {
            return 2;
        }
    }

    @Override
    public void reproducir() {
        // Sobrescribir el comportamiento para Podcast
        logger.logInfo("Reproduciendo el podcast: " + getTitulo() + " por " + getAutor());
    }

    public String getTemaDelPodcast() {
        return getGenero();
    }

    public void setTemaDelPodcast(String temaDelPodcast) {
        setGenero(temaDelPodcast);
    }
}
