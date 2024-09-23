package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.model.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    // Polimorfismo, un Titulo puede ser una Pelicula y una Serie
    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public void tiempoVacaciones(){
        System.out.printf("%nTiempo necesario para ver tus titulos favotitos en vacaciones: %d minutos%n",getTiempoTotal());
    }
    
    public int getTiempoTotal() {
        return tiempoTotal;
    }
    
    public void setReinicia(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
}
