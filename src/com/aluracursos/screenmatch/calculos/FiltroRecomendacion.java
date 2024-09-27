package com.aluracursos.screenmatch.calculos;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class FiltroRecomendacion {

    private final LoggerBase logger;

    public FiltroRecomendacion() {
        this.logger = new LoggerBaseImpl(FiltroRecomendacion.class.getName());
    }

    public void filtra(Puntuacion puntuacion){

        if (puntuacion.getPuntuacion() >= 4){
            logger.logInfo("Muy bien evaluado en el momento");
        } else if (puntuacion.getPuntuacion() >= 2) {
            logger.logInfo("Popular en el momento");
        } else {
            logger.logInfo("Colocado en tu lista para verlo despues");
        }
    }
}
