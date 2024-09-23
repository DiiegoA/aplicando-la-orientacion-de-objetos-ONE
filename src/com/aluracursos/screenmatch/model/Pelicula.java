package com.aluracursos.screenmatch.model;

import com.aluracursos.screenmatch.calculos.Puntuacion;

public class Pelicula extends Titulo implements Puntuacion {

    private String director;

    public void imprimirDirector(){
        System.out.println("Director: " + director);
    }

    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getPuntuacion() { return (int) (calculamedia() / 2); }
}
