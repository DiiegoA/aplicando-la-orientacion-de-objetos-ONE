package com.aluracursos.ejercicio3.model;

public class Planeta {

    private final String name;
    private final String climate;
    private final String terrain;
    private final String population; // Cambiar a String para manejar "unknown"

    public Planeta(String name, String climate, String terrain, String population) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getClimate() {
        return climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        // Manejar el caso en que la población sea "unknown"
        String populationDisplay = "Desconocida";
        if (!"unknown".equals(population)) {
            populationDisplay = population;
        }

        return String.format("Nombre: %s, Clima: %s, Terreno: %s, Población: %s", name, climate, terrain, populationDisplay);
    }
}
