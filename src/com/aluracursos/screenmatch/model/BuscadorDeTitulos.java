package com.aluracursos.screenmatch.model;

import com.aluracursos.screenmatch.excepcion.ErrorDuracionException;
import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;
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

public class BuscadorDeTitulos {

    private  final LoggerBase logger;

    public BuscadorDeTitulos(){
        this.logger = new LoggerBaseImpl(Titulo.class.getName());
    }

    // Modificación: El método ahora devuelve la lista de títulos
    public List<Titulo> buscarTitulos() throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (true) {
            logger.logInfo(String.format("%nEscriba el nombre de una pelicula o serie: "));
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            // Codifica la búsqueda para que sea compatible con la URL
            var busquedaFormateada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8.toString());

            var direccion = String.format("https://www.omdbapi.com/?t=%s&apikey=4db4373a", busquedaFormateada);

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                logger.logInfo(json);

                TituloOmdb miTituloOmbd = gson.fromJson(json, TituloOmdb.class);

                Titulo miTitulo = new Titulo(miTituloOmbd);
                logger.logInfo(miTitulo);

                titulos.add(miTitulo); // Agregamos el título a la lista

            } catch (NumberFormatException e) {
                logger.logInfo("Ocurrió un error:");
                logger.logInfo(e.getMessage());
            } catch (ErrorDuracionException e) {
                logger.logInfo(e.getMessage());
            } catch (NullPointerException e) {
                logger.logInfo(e.getMessage());
            }
        }
        return titulos; // Retornamos la lista de títulos
    }

    // Método para imprimir los títulos
    public void imprimirTitulos(List<?> titulos){
        logger.logInfo(titulos);
    }

    // Método para guardar los títulos en un archivo JSON
    public void guardarTitulosEnArchivo(List<?> titulos, Gson gson) throws IOException {
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        logger.logInfo("%nFinalizó!");
    }
}
