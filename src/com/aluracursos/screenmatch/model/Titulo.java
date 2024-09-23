package com.aluracursos.screenmatch.model;

public class Titulo {

    private String tipo;
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones; 
    public void muestraFichaTecnica() {
        System.out.printf("""
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
                isIncluidoEnElPlan());
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

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan){
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
