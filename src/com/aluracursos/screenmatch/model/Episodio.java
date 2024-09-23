package com.aluracursos.screenmatch.model;

import com.aluracursos.screenmatch.calculos.Puntuacion;

public class Episodio implements Puntuacion {

    private int numero;

    private String nombre;

    private Serie serie;

    private int totalVisualizaciones;

    // Getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie(Serie toLoveRu) {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones(int i) { return totalVisualizaciones; }

    public void setTotalVisualizaciones(int totalVisualizaciones) { this.totalVisualizaciones = totalVisualizaciones; }

    @Override
    public int getPuntuacion() {
        if (totalVisualizaciones > 100) {
            return 4;
        }else {
            return 2;
        }
    }
}
