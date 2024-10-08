package com.aluracursos.ejercicio3.main;

import com.aluracursos.ejercicio3.model.BuscadorDePeliculasSwApi;
import com.aluracursos.ejercicio3.model.StarWarsApi;
import com.aluracursos.ejercicio3.model.TituloSwapi;
import com.aluracursos.screenmatch.model.BuscadorDeTitulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarWarsMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();

        // Instanciar la clase BuscadorDePeliculasSwApi
        BuscadorDePeliculasSwApi buscador = new BuscadorDePeliculasSwApi();

        // Llamar al método que contiene el bucle while y recibir la lista de peliculas
        List starWars = buscador.buscarPeliculas();

        // Guardar la lista completa de películas en StarWars.json
        buscador.guardarPeliculasEnArchivo(starWars,gson);
    }
}
