package com.aluracursos.screenmatch.model;

public class Audio {

    private String titulo;
    private int duracion;
    private String autor;
    private int fechaDeLanzamiento;
    private int numeroDeReproducciones;
    private int numeroDeMeGusta;
    private int calificacion;
    private String genero;
    private String descripcion;
    private Boolean incluidoEnElPlan;
    private String idioma;

    // Constructor
    public Audio(String titulo, String autor, int duracion, int fechaDeLanzamiento, int numeroDeReproducciones, int numeroDeMeGusta, String genero, Boolean incluidoEnElPlan, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.numeroDeReproducciones = numeroDeReproducciones;
        this.numeroDeMeGusta = numeroDeMeGusta;
        this.genero = genero;
        this.incluidoEnElPlan = incluidoEnElPlan;
        this.idioma = idioma;
    }

    // Método para aumentar el contador de "Me gusta"
    public void meGusta() {
        numeroDeMeGusta++;
        System.out.println("¡A alguien le gustó este contenido!");
    }

    // Método para simular la reproducción del contenido
    public void reproducir() {
        numeroDeReproducciones++;
        System.out.println("Reproduciendo: " + titulo + " por " + autor);
    }

    // Método para calificar el contenido
    public void calificar(int calificacion) {
        this.calificacion = calificacion;
        System.out.println("Calificación recibida: " + calificacion + "/5");
    }

    // Método para mostrar toda la información del contenido
    public void mostrarInformacion() {
        System.out.printf("""
                Título: %s
                Autor: %s
                Duración: %d minutos
                Fecha de lanzamiento: %d
                Género: %s
                Descripción: %s
                Idioma: %s
                Incluido en el plan: %b
                Reproducciones: %d
                Me gusta: %d
                Calificación: %d/5
                """, titulo, autor, duracion, fechaDeLanzamiento, genero, descripcion, idioma, incluidoEnElPlan, numeroDeReproducciones, numeroDeMeGusta, calificacion);
    }

    // Método para incluir el contenido en un plan de suscripción
    public void incluirEnElPlan() {
        incluidoEnElPlan = true;
        System.out.println(titulo + " ha sido incluido en el plan.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getNumeroDeMeGusta() {
        return numeroDeMeGusta;
    }

    public void setNumeroDeMeGusta(int numeroDeMeGusta) {
        this.numeroDeMeGusta = numeroDeMeGusta;
    }

    public int getNumeroDeReproducciones() {
        return numeroDeReproducciones;
    }

    public void setNumeroDeReproducciones(int numeroDeReproducciones) {
        this.numeroDeReproducciones = numeroDeReproducciones;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(Boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
