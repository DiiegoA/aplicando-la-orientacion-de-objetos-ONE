package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.model.BuscadorDeTitulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.List;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        // Instanciar la clase BuscadorDeTitulos
        BuscadorDeTitulos buscador = new BuscadorDeTitulos();

        // Llamar al método que contiene el bucle while y recibir la lista de títulos
        List titulos = buscador.buscarTitulos();

        // Imprimir los títulos
        buscador.imprimirTitulos(titulos);

        // Guardar los títulos en un archivo JSON
        buscador.guardarTitulosEnArchivo(titulos, gson);
    }
}
