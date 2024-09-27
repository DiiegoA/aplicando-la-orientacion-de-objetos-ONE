package com.aluracursos.screenmatch.model;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Titulo implements Comparable<Titulo> {

    private final String tipo;
    private final String nombre;
    private final int fechaDeLanzamiento;
    private final int duracionEnMinutos;
    private final boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;
    private final LoggerBase logger;

    public Titulo(String tipo, String nombre, int fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.incluidoEnElPlan = incluidoEnElPlan;
        this.logger = new LoggerBaseImpl(Titulo.class.getName());
    }

    public void muestraFichaTecnica() {
        logger.logInfo(String.format("""
                %nTipo: %s
                Titulo: %s
                Fecha de lanzamiento: %d
                Duración: %d minutos
                Incluido en el plan: %b
                """,
                getTipo(),
                getNombre(),
                getFechaDeLanzamiento(),
                getDuracionEnMinutos(),
                isIncluidoEnElPlan()));
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
    
    public int getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }
    
    public int getDuracionEnMinutos(){
        return duracionEnMinutos;
    }
    
    public boolean isIncluidoEnElPlan(){
        return incluidoEnElPlan;
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
