package com.aluracursos.screenmatch.model;

public class Musica extends Audio {

    // Constructor
    public Musica(String titulo, String autor, int duracion, int fechaDeLanzamiento, int numeroDeReproducciones, int numeroDeMeGusta, String genero, Boolean incluidoEnElPlan, String idioma) {
        super(titulo, autor, duracion, fechaDeLanzamiento, numeroDeReproducciones, numeroDeMeGusta, genero, incluidoEnElPlan, idioma); // Llamada al constructor del padre
    }

    // Método específico de la clase Musica
    public void mostrarTipoDeMusica() {
        System.out.println("El tipo de música es: " + getGenero()); // Acceso mediante el getter
    }

    @Override
    public int getCalificacion() {
        if (getNumeroDeMeGusta() > 5000){
            return 5;
        } else {
            return 2;
        }
    }

    public String getTipoDeMusica() {
        return getGenero(); // Acceso mediante el getter
    }

    public void setTipoDeMusica(String tipoDeMusica) {
        setGenero(tipoDeMusica); // Acceso mediante el setter
    }
}

