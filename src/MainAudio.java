import com.aluracursos.screenmatch.calculos.Playlist;
import com.aluracursos.screenmatch.model.Musica;
import com.aluracursos.screenmatch.model.Podcast;

public class MainAudio {

    public static void main(String[] args) {

        // Crear un objeto de Musica y un Podcast
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 6,  1975, 5000000, 100, "Rock", true, "Inglés");
        Podcast podcast = new Podcast("Aprendiendo Java", "Juan Pérez", 30, 2023, 200, 50000, "Educación", true, "Español");

        musica.setDescripcion("Una de las canciones más icónicas de Queen, mezcla de rock y ópera.");

        podcast.setDescripcion("Podcast educativo sobre los fundamentos del lenguaje de programación Java.");

        // Crear una playlist simplificada
        Playlist playlist = new Playlist();

        // Incluir solo un audio en la playlist (la música)
        playlist.incluye(musica);  // Añadir una canción

        // Reproducir la musica
        playlist.reproducirAudio();

        // Calcular la duración total del audio
        playlist.calcularDuracion();

        // Incluir solo un audio en la playlist (la música)
        playlist.incluye(podcast);

        // Reproducir el podcast
        playlist.reproducirAudio();

        // Calcular la duración total del audio
        playlist.calcularDuracion();

        musica.mostrarTipoDeMusica();

        podcast.mostrarTema();

        musica.meGusta();

        podcast.meGusta();

        musica.reproducir();

        podcast.reproducir();

        musica.calificar(musica.getCalificacion());

        podcast.calificar(podcast.getCalificacion());

        musica.mostrarInformacion();

        podcast.mostrarInformacion();

        musica.incluirEnElPlan();

        podcast.incluirEnElPlan();


    }
}
