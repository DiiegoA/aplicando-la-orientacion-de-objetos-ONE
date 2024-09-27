package com.aluracursos.screenmatch.calculos;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;
import com.aluracursos.screenmatch.model.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;
    private final LoggerBase logger;

    public CalculadoraDeTiempo() {
        this.logger = new LoggerBaseImpl(CalculadoraDeTiempo.class.getName());
    }

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public void tiempoVacaciones() {
        logger.logInfo(String.format("Tiempo necesario para ver tus títulos favoritos en vacaciones: %d minutos", tiempoTotal));
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setReinicia(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
}
