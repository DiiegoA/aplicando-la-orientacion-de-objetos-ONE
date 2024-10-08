package com.aluracursos.screenmatch.model;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Titulo implements Comparable<Titulo> {

    //@SerializedName("Type")
    private final String tipo;
    //@SerializedName("Title")
    private String nombre;
    //@SerializedName("Year")
    private final String fechaDeLanzamiento;
    //@SerializedName("Runtime")
    private final int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    //@SerializedName("Director")
    private final String director;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;
    private transient  final LoggerBase logger;

    public Titulo(String tipo, String nombre, String fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan, String director) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.incluidoEnElPlan = incluidoEnElPlan;
        this.director = director;
        this.logger = new LoggerBaseImpl(Titulo.class.getName());
    }

    public Titulo(TituloOmdb miTituloOmbd) {
        this.tipo = miTituloOmbd.type();
        this.nombre = miTituloOmbd.title();
        this.fechaDeLanzamiento = miTituloOmbd.year();

        /*if (miTituloOmbd.runtime().contains("N/A")){
            throw new ErrorDuracionException("No se puedo convertir el dato ('N/A') a (Int)");
        }
        // Limpiar caracteres no numéricos y luego convertir a int
        this.duracionEnMinutos = Integer.valueOf(miTituloOmbd.runtime().replaceAll("[^\\d]", "")); // Elimina todo lo que no sea un número*/

        // Limpiar caracteres no numéricos y manejar el caso de "N/A"
        String duracionStr = miTituloOmbd.runtime().replaceAll("[^\\d]", "");// Elimina todo lo que no sea un número
        // Si después de limpiar la cadena no hay números, asignar valor por defecto
        this.duracionEnMinutos = duracionStr.isEmpty() ? 1 : Integer.valueOf(duracionStr);

        this.director = miTituloOmbd.director();
        this.logger = new LoggerBaseImpl(Titulo.class.getName());
    }

    public void muestraFichaTecnica() {
        logger.logInfo(String.format("""
                %nTipo: %s
                Titulo: %s
                Fecha de lanzamiento: %s
                Duración: %d minutos
                Incluido en el plan: %b
                Director: %s
                """,
                getTipo(),
                getNombre(),
                getFechaDeLanzamiento(),
                getDuracionEnMinutos(),
                isIncluidoEnElPlan(),
                getDirector()));
    }


    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculamedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }
    
    public int getDuracionEnMinutos(){ return duracionEnMinutos; }
    
    public boolean isIncluidoEnElPlan(){
        return incluidoEnElPlan;
    }

    public String getTipo(){
        return tipo;
    }

    public String getDirector() {
        return director;
    }

    public void imprimirDirector(){
        logger.logInfo("Director: " + getDirector());
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return String.format("(Tipo: %s, Titulo: %s, año (%s), Duracíon: %d min, Director: %s)",
                getTipo(), getNombre(), getFechaDeLanzamiento(), getDuracionEnMinutos(),getDirector());
    }
}
