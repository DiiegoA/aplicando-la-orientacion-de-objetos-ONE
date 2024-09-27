package com.aluracursos.ejercicio2.model;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.aluracursos.logger.loggerbase.LoggerBase;
import com.aluracursos.logger.loggerbase.LoggerBaseImpl;

public class Compra implements Comparable<Compra> {

    private final String descripcion;
    private final double valor;
    private final LoggerBase logger;

    // Constructor
    public Compra(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.logger = new LoggerBaseImpl(Compra.class.getName());
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return this.getDescripcion().compareTo(otraCompra.getDescripcion());
    }

    // Método para solicitar el límite de la tarjeta
    public double limiteTarjeta(Scanner scanner) {
        logger.logInfo("Escriba el límite de la tarjeta:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer
        return saldo;
    }

    // Método que contiene el ciclo para agregar compras y devuelve el saldo restante
    public double realizarCompras(Scanner scanner, List<Compra> listaCompras, double saldo) {
        while (true) {

            // Solicitar la descripción de la compra
            logger.logInfo("Escriba la descripción de la compra:");
            String descripcion = scanner.nextLine();

            // Solicitar el valor de la compra
            logger.logInfo("Escriba el valor de la compra:");
            double valorCompra = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer

            // Verificar si la compra excede el saldo disponible
            if (valorCompra <= saldo) {
                listaCompras.add(new Compra(descripcion, valorCompra));
                saldo -= valorCompra;  // Restar el valor del saldo
                logger.logInfo("Compra realizada!");
                logger.logInfo("Su saldo restante es de: " + saldo);  // Mostrar el saldo restante

                // Verificar si el saldo es menor a 50
                if (saldo < 50) {
                    logger.logInfo("Saldo insuficiente para realizar compras menores a 50.");
                    break;  // Salir del ciclo automáticamente
                }

            } else {
                logger.logInfo("Saldo insuficiente!");
                imprimirCompras(listaCompras);
                logger.logInfo("Saldo restante: " + saldo);

                // Preguntar si se quiere continuar o salir
                logger.logInfo("Escriba 0 para salir o 1 para continuar");
                int continuar = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer

                if (continuar == 0) {
                    break;  // Salir del ciclo si el usuario lo decide
                } else {
                    continue; // Volver a la solicitud de compra si el usuario elige continuar
                }
            }

            // Preguntar si se quiere continuar con más compras
            logger.logInfo("Escriba 0 para salir o 1 para continuar");
            int continuar = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            if (continuar == 0) {
                break;  // Salir del ciclo si el usuario lo decide
            }
        }
        return saldo;  // Devolver el saldo restante
    }

    // Ordenar las compras de menor a mayor por valor usando Comparator.comparing()
    public static void ordenarCompras(List<Compra> listaCompras){
        listaCompras.sort(Comparator.comparing(Compra::getValor));
    }

    // Método para imprimir las compras realizadas
    public void imprimirCompras(List<Compra> listaCompras) {
        logger.logInfo("""
                ***********************
                COMPRAS REALIZADAS:
                """);
        for (Compra compra : listaCompras) {
            logger.logInfo(compra.getDescripcion() + " - " + compra.getValor());
        }
    }

    // Método para imprimir el saldo restante
    public void imprimirSaldo(double saldo){
        logger.logInfo(String.format("""
                ***********************
                Saldo de la tarjeta : %.2f
                """, saldo));
    }
}

