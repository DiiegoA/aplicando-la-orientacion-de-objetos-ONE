package com.aluracursos.ejercicio3.model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class StarWarsApi {

    private final String titulo;
    private final int episodio;
    private final String director;
    private final String productor;
    private final List<Planeta> planetas; // Lista de planetas
    private final String descripcion;


    // Constructor privado, se usará desde el método estático
    private StarWarsApi(String titulo, int episodio, String director, String productor, List<Planeta> planetas, String descripcion) {
        this.titulo = titulo;
        this.episodio = episodio;
        this.director = director;
        this.productor = productor;
        this.planetas = planetas;
        this.descripcion = descripcion;

    }

    // Método estático para crear una instancia de StarWarsApi desde JSON
    public static StarWarsApi fromJson(TituloSwapi miTituloSwapi, Gson gson) throws IOException, InterruptedException {
        List<String> planetasUrls = miTituloSwapi.planets(); // Obtener las URLs de planetas
        List<Planeta> planetas = obtenerPlanetas(planetasUrls, gson); // Obtener los planetas

        // Crear una instancia de StarWarsApi con los datos de la película y los planetas
        return new StarWarsApi(
                miTituloSwapi.title(),
                miTituloSwapi.episode_id(),
                miTituloSwapi.director(),
                miTituloSwapi.producer(),
                planetas,
                miTituloSwapi.opening_crawl()

        );
    }

    // Método para obtener los planetas a partir de sus URLs
    private static List<Planeta> obtenerPlanetas(List<String> planetasUrls, Gson gson) throws IOException, InterruptedException {
        List<Planeta> planetas = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();

        for (String planetaUrl : planetasUrls) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(planetaUrl))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Planeta planeta = gson.fromJson(response.body(), Planeta.class);
            planetas.add(planeta); // Agregar el planeta a la lista
        }
        return planetas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public String getDirector() {
        return director;
    }

    public String getProductor() {
        return productor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Planeta> getPlanetas() {
        return planetas;
    }

    @Override
    public String toString() {
        String planetasString = (getPlanetas() != null) ? getPlanetas().toString() : "No hay planetas"; // Maneja caso de null
        return String.format("(Titulo: %s, Episodio: %d, Director: %s, Productor: %s, Planetas: %s Descripción: %s)",
                getTitulo(), getEpisodio(), getDirector(), getProductor(), planetasString, getDescripcion());
    }
}
