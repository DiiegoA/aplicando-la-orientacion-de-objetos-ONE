package com.aluracursos.screenmatch.model;

public class Podcast extends Audio {

    // Constructo
    public Podcast(String titulo, String autor, int duracion, int fechaDeLanzamiento, int numeroDeReproducciones, int numeroDeMeGusta, String genero, Boolean incluidoEnElPlan, String idioma) {
        super(titulo, autor, duracion, fechaDeLanzamiento, numeroDeReproducciones, numeroDeMeGusta, genero, incluidoEnElPlan, idioma); // Llamada al constructor del padre
        }

    // Método específico de la clase Podcast
    public void mostrarTema() {
        System.out.println("El tema del podcast es: " + getGenero());
    }

    @Override
    public int getCalificacion() {
        if (getNumeroDeReproducciones() >= 2000){
            return 5;
        } else {
            return 2;
        }
    }

    public String getTemaDelPodcast() {
        return getGenero();
    }

    public void setTemaDelPodcast(String temaDelPodcast) {
        setGenero(temaDelPodcast);
    }
}
