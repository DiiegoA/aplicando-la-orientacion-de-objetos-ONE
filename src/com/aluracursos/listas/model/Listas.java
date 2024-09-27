package com.aluracursos.listas.model;


import java.util.List;

import com.aluracursos.ejercicio2.model.Compra;
import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;
import com.aluracursos.screenmatch.model.Titulo;

public class Listas {

    private final LoggerBase logger;

    public Listas(){
        this.logger = new LoggerBaseImpl(Compra.class.getName());
    }

    public void procesarTitulos(List<Titulo> listaTitulos){
        for (Titulo titulo : listaTitulos) {
            if (titulo instanceof Pelicula pelicula && pelicula.getPuntuacion() >= 3) {
                logger.logInfo(String.format("Pelicula: %s, Clasificacion: %d%n", titulo.getNombre(), pelicula.getPuntuacion()));
            } else if (titulo instanceof Serie serie && serie.getPuntuacion() >= 3) {
                logger.logInfo(String.format("Serie: %s, Clasificacion: %d%n", titulo.getNombre(), serie.getPuntuacion()));
            }
        }
    }

    public void artistasNoOrdenada(List<String> listaDeArtistas){
        logger.logInfo("Lista de artistas no ordenada: " + listaDeArtistas);
    }


    public void artistasOrdenada(List<String> listaDeArtistas){
        logger.logInfo("Lista de artistas ordenada: " + listaDeArtistas);
    }

    public void titulosOrdenada(List<Titulo> listaTitulos) {
        logger.logInfo("Lista de titulos ordenada: " + listaTitulos);
    }

    public void fechasOrdenada(List<Titulo> listaTitulos) {
        logger.logInfo("Lista de fechas ordenada: " + listaTitulos);
    }
}
