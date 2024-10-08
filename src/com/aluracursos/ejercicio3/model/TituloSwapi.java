package com.aluracursos.ejercicio3.model;

import java.util.List;

public record TituloSwapi(String title, int episode_id, String director, String producer, List<String> planets,String opening_crawl) {
}
