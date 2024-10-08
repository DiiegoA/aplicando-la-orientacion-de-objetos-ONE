package com.aluracursos.listas.main;

import com.aluracursos.listas.model.Listas;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;
import com.aluracursos.screenmatch.model.Titulo;

import java.util.*;

public class MainArrays {

    public static void main(String[] args) {

        /*// Array de numeros
        int[] numeros = new int[5];

        // Llenar el array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Imprimir los valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        Pelicula[] peliculas= new Pelicula[2];

        Pelicula pelicula1 = new Pelicula("Avatar", 2009);
        Pelicula pelicula2 = new Pelicula("El señor de los anillos", 2001);

        peliculas[0] = pelicula1;
        peliculas[1] = pelicula2;*/

        Listas listas = new Listas();

        Pelicula deadPool = new Pelicula("Pelicula","Deadpool", "2016", 108, true, "Tim Miller");
        deadPool.evalua(9);

        Pelicula theWolverine = new Pelicula("Pelicula", "theWolverine", "2013", 126, true, "James Mangold");
        theWolverine.evalua(5);

        var matrix = new Pelicula("Pelicula", "Matrix", "1999", 136, false, "Wachowski");
        matrix.evalua(10);

        Serie toLoveRu = new Serie("Serie","To Love Ru", "2006", 24, true, 1, 25, "Takahiro Kawakami");
        toLoveRu.evalua(5);

        Serie swordArtOnline = new Serie("Serie","swordArtOnline", "2012", 24, true, 1, 26, "Tomohiko Itou");
        swordArtOnline.evalua(10);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(deadPool);
        listaTitulos.add(theWolverine);
        listaTitulos.add(matrix);
        listaTitulos.add(toLoveRu);
        listaTitulos.add(swordArtOnline);

        /*System.out.println("Tamaño de la lista = " + listaTitulos.size());
        System.out.println("La primera pelicula es = " + listaTitulos.get(0).getNombre());
        System.out.println(listaTitulos);
        System.out.println("La primera pelicula es = " + listaTitulos.get(0).toString());*/

        // Usando un bucle for-each
        listas.procesarTitulos(listaTitulos);


        /*listaTitulos.forEach(pelicula -> System.out.println(pelicula.getNombre()));
        listaTitulos.forEach(System.out::println);  // Imprime el metodo modificado toString()*/

        List<String> listaDeArtistas = new LinkedList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        listas.artistasNoOrdenada(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        listas.artistasOrdenada(listaDeArtistas);

        Collections.sort(listaTitulos);
        listas.titulosOrdenada(listaTitulos);

        listaTitulos.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        listas.fechasOrdenada(listaTitulos);
    }
}
