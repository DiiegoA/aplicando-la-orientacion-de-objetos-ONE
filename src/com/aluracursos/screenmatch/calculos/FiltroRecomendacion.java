package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Puntuacion puntuacion){

        if (puntuacion.getPuntuacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (puntuacion.getPuntuacion() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocado en tu lista para verlo despues");
        }
    }
}
