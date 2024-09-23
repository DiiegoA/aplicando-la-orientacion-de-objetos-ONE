package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.model.Audio;

public class Playlist {

    private Audio audio;

    // Método para incluir un Audio (Musica o Podcast)
    public void incluye(Audio audio) {
        this.audio = audio;
        System.out.println(audio.getTitulo() + " ha sido añadido a la playlist.");
    }

    // Método para calcular la duración del audio
    public int calcularDuracionTotal() {
        if (audio != null) {
            return audio.getDuracion();
        }
        return 0;  // Si no hay audio, la duración es 0
    }

    // Método para reproducir el audio
    public void reproducirAudio() {
        if (audio != null) {
            audio.reproducir();
        } else {
            System.out.println("No hay audio en la playlist para reproducir.");
        }
    }

    // Calcular la duración total del audio
    public void calcularDuracion() {
        System.out.println("\nDuración total de la playlist: " + calcularDuracionTotal() + " minutos");
    }
}
