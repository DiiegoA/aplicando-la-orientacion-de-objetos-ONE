import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Pelicula miPelicula = new Pelicula();

        miPelicula.setTipo("Pelicula");
        miPelicula.setNombre("Deadpool");
        miPelicula.setFechaDeLanzamiento(2016);
        miPelicula.setDuracionEnMinutos(108);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.setDirector("Tim Miller");

        miPelicula.muestraFichaTecnica();
        miPelicula.imprimirDirector();
        miPelicula.evalua(10);


        Serie toLoveRu = new Serie();

        toLoveRu.setNombre("To Love Ru");
        toLoveRu.setFechaDeLanzamiento(2006);
        toLoveRu.setTipo("Serie");
        toLoveRu.setMinutosPorEpisodio(24);
        toLoveRu.setIncluidoEnElPlan(true);
        toLoveRu.setTemporadas(1);
        toLoveRu.setEpisodiosPorTemporada(26);

        toLoveRu.muestraFichaTecnica();


        CalculadoraDeTiempo miCalculadoraDeTiempo = new CalculadoraDeTiempo();

        miCalculadoraDeTiempo.incluye(miPelicula);
        miCalculadoraDeTiempo.incluye(toLoveRu);
        miCalculadoraDeTiempo.tiempoVacaciones();


        FiltroRecomendacion miFiltroRecomendacion = new FiltroRecomendacion();

        miFiltroRecomendacion.filtra(miPelicula);


        Episodio miEpisodio = new Episodio();

        miEpisodio.setNumero(1);
        miEpisodio.setNombre("La chica que descendió");
        miEpisodio.setSerie(toLoveRu);
        miEpisodio.setTotalVisualizaciones(300);

        miFiltroRecomendacion.filtra(miEpisodio);
        
        // Pelicula miPelicula1 = new Pelicula();        

        // miPelicula1.nombre = "Matrix";
        // miPelicula1.fechaDeLanzamiento = 1999;
        // miPelicula1.duracionEnMinutos = 136;
        // miPelicula1.incluidoEnElPlan = false;
        
        // miPelicula1.muestraFichaTecnica();
        // miPelicula.evalua(10);
        // miPelicula.evalua(10);
        // System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        // System.out.println(miPelicula.calculamedia());

        // System.out.println("************************************");
        // //Modificar atributos
        // miPelicula.sumaDeLasEvaluaciones = 2;
        // miPelicula.totalDeLasEvaluaciones = 1;
        // System.out.println(miPelicula.calculamedia());
    }
}
