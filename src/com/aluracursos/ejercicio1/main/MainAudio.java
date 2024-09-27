package com.aluracursos.ejercicio1.main;

import com.aluracursos.ejercicio1.playlist.Playlist;
import com.aluracursos.ejercicio1.model.Musica;
import com.aluracursos.ejercicio1.model.Podcast;

public class MainAudio {

    public static void main(String[] args) {

        // Crear un objeto de Musica y un Podcast
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 6,  1975, 5000000);
        musica.setNumeroDeMeGusta(100);
        musica.setGenero("Rock");
        musica.setIncluidoEnElPlan(true);
        musica.setIdioma("Inglés");

        Podcast podcast = new Podcast("Aprendiendo Java", "Juan Pérez", 30, 2023, 200);
        podcast.setNumeroDeMeGusta(50000);
        podcast.setGenero("Educación");
        podcast.setIncluidoEnElPlan(true);
        podcast.setIdioma("Español");

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

        // Incluir solo un audio en la playlist (el podcast)
        playlist.incluye(podcast); // Añadir un podcast

        // Reproducir el podcast
        playlist.reproducirAudio();

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
