package com.aluracursos.ejercicio3.model;

import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;
import com.aluracursos.screenmatch.model.Titulo;
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
import java.util.*;

public class BuscadorDePeliculasSwApi {

    private  final LoggerBase logger;

    public BuscadorDePeliculasSwApi(){
        this.logger = new LoggerBaseImpl(Titulo.class.getName());
    }

    // Modificación: El método ahora devuelve la lista de títulos
    public List<StarWarsApi> buscarPeliculas() throws IOException {
        Scanner lectura = new Scanner(System.in);
        List<StarWarsApi> starWars = new ArrayList<>();
        Set<Integer> peliculasIngresadas = new HashSet<>(); // Para rastrear las películas ingresadas
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();

        while (true) {
            logger.logInfo(String.format("%nEscriba el numero de la pelicula de StarWars que quiere ver (1 al 6) o escriba 'salir' para finalizar: "));
            var busqueda = lectura.nextLine();

            // Verificar si el usuario quiere salir
            if (busqueda.equalsIgnoreCase("salir")) {
                logger.logInfo("Has decidido salir del programa.");
                break;
            }

            // Verificar si el usuario ingresó un número válido entre 1 y 6
            int numeroPelicula;
            try {
                numeroPelicula = Integer.parseInt(busqueda); // Intentar convertir la entrada a un número
            } catch (NumberFormatException e) {
                logger.logInfo("Por favor, ingrese un número válido entre 1 y 6, o escriba 'salir' para terminar.");
                continue;
            }

            // Verificar que esté dentro del rango
            if (numeroPelicula < 1 || numeroPelicula > 6) {
                logger.logInfo("Por favor, ingrese un número válido entre 1 y 6.");
                continue;
            }

            // Añadir el número de la película ingresada al conjunto
            peliculasIngresadas.add(numeroPelicula);

            // Codifica la búsqueda para que sea compatible con la URL
            var busquedaFormateada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8.toString());
            var direccion = String.format("https://swapi.dev/api/films/%s/", busquedaFormateada);

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                logger.logInfo(json);

                TituloSwapi miTituloSwapi = gson.fromJson(json, TituloSwapi.class);

                // Crear StarWarsApi usando el método estático fromJson
                StarWarsApi miStarWars = StarWarsApi.fromJson(miTituloSwapi, gson);

                starWars.add(miStarWars); // Agregar el título con planetas a la lista

            } catch (Exception e) {
                logger.logInfo("Ocurrió un error: ");
                logger.logInfo(e.getMessage());
            }

            // Verificar si ya se ingresaron todas las 6 películas después de agregar la película
            if (peliculasIngresadas.size() == 6) {
                logger.logInfo("¡Has ingresado las 6 películas! El programa se cerrará.");
                break;
            }
        }
        return starWars; // Retornar la lista de películas
    }



    // Método para guardar las peliculas de StarWars en un archivo JSON
    public void guardarPeliculasEnArchivo(List<?> starWars, Gson gson) throws IOException {
        try (FileWriter escritura = new FileWriter("StarWars.json")) {
            escritura.write(gson.toJson(starWars));
            logger.logInfo("Se han guardado todas las películas correctamente en el archivo StarWars.json!");
        } catch (IOException e) {
            logger.logInfo("Error al escribir en el archivo: " + e.getMessage());
        }

    }
}
