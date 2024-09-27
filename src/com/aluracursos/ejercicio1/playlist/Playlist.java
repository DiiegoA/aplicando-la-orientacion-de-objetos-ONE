package com.aluracursos.ejercicio1.playlist;

import com.aluracursos.ejercicio1.model.Audio;
import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Playlist {

    private Audio audio; // Solo un audio a la vez
    private final LoggerBase logger;

    public Playlist() {
        this.logger = new LoggerBaseImpl(Playlist.class.getName());
    }

    // Método para incluir un Audio (Musica o Podcast)
    public void incluye(Audio nuevoAudio) {
        if (nuevoAudio != null) {
            this.audio = nuevoAudio;
            logger.logInfo(audio.getTitulo() + " ha sido añadido a la playlist.");
        }
    }

    // Método para reproducir el audio solo una vez
    public void reproducirAudio() {
        if (audio != null) {
            audio.reproducir(); // Reproducimos el audio
            // Después de reproducir, puedes hacer que el audio sea "null" si no quieres que se repita.
            audio = null; // Para evitar que se vuelva a reproducir
        } else {
            logger.logInfo("No hay audio en la playlist para reproducir.");
        }
    }

    // Método para calcular la duración del audio (puedes hacerlo solo una vez)
    public void calcularDuracion() {
        if (audio != null) {
            logger.logInfo("\nDuración total de la playlist: " + audio.getDuracion() + " minutos");
            // Para evitar repeticiones, podrías "deshabilitar" el audio después de calcular su duración.
        }
    }
}
