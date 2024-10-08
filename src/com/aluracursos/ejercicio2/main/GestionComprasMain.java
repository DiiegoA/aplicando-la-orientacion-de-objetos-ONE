package com.aluracursos.ejercicio2.main;

import com.aluracursos.ejercicio2.model.Compra;

import java.util.*;

public class GestionComprasMain {
    public static void main(String[] args) {

        // Crear una instancia de Compra (solo para invocar métodos)
        Compra compra = new Compra("", 0);

        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Llamar al método para solicitar el límite de la tarjeta
        double saldo = compra.limiteTarjeta(scanner);

        // Lista para almacenar las compras realizadas
        List<Compra> listaCompras = new ArrayList<>();

        // Llamar al método realizarCompras de la clase Compra
        saldo = compra.realizarCompras(scanner, listaCompras, saldo);

        //Llamar al método ordenarCompras de la clase Compra
        compra.ordenarCompras(listaCompras);

        // Llamar al método para imprimir las compras realizadas
        compra.imprimirCompras(listaCompras);

        // Llamar al método para imprimir el saldo restante
        compra.imprimirSaldo(saldo);
    }
}
