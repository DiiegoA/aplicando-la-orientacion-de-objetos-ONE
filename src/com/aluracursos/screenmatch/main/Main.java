package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.ejercicio1.model.Episodio;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) {
        
        Pelicula deadPool = new Pelicula("Pelicula","Deadpool", "2016", 108, true, "Tim Miller");

        deadPool.muestraFichaTecnica();
        deadPool.imprimirDirector();
        deadPool.evalua(10);


        Serie toLoveRu = new Serie("Serie","To Love Ru", "2006", 24, true, 1, 26, "Takahiro Kawakami");

        toLoveRu.muestraFichaTecnica();


        CalculadoraDeTiempo miCalculadoraDeTiempo = new CalculadoraDeTiempo();

        miCalculadoraDeTiempo.incluye(deadPool);
        miCalculadoraDeTiempo.incluye(toLoveRu);
        miCalculadoraDeTiempo.tiempoVacaciones();


        FiltroRecomendacion miFiltroRecomendacion = new FiltroRecomendacion();

        miFiltroRecomendacion.filtra(deadPool);


        Episodio miEpisodio = new Episodio();

        miEpisodio.setNumero(1);
        miEpisodio.setNombre("La chica que descendió");
        miEpisodio.setSerie(toLoveRu);
        miEpisodio.setTotalVisualizaciones(300);

        miFiltroRecomendacion.filtra(miEpisodio);


        Pelicula theWolverine = new Pelicula("Pelicula", "theWolverine", "2013", 126, true, "James Mangold");

        theWolverine.muestraFichaTecnica();
        theWolverine.imprimirDirector();
        theWolverine.evalua(10);


        var matrix = new Pelicula("Pelicula", "Matrix", "1999", 136, false, "Wachowski");

        matrix.muestraFichaTecnica();
        matrix.imprimirDirector();
        matrix.evalua(10);
    }
}
