# Screenmatch Application

This Java project is designed to manage and recommend various media titles, including movies, series, and audio content like music and podcasts, based on their ratings. It employs object-oriented programming principles such as inheritance and polymorphism, making the project scalable and easy to maintain.

## Table of Contents
- [Getting Started](#getting-started)
- [Classes Overview](#classes-overview)
- [Dependencies](#dependencies)
- [Usage](#usage)
- [Contributing](#contributing)

## Getting Started
To run the application, you need to ensure that you have the following dependencies installed:
- JDK 11 or higher

### Installation
1. Clone the repository.
2. ```bash
   https://github.com/DiiegoA/aplicando-la-orientacion-de-objetos-ONE.git
   ```
3. Compile the Java files using a Java compiler.
4. Run the `Main` or `MainAudio` classes to execute the application.

## Classes Overview

### Main.java
The main class that integrates different modules like `CalculadoraDeTiempo`, `FiltroRecomendacion`, `Episodio`, and `Pelicula` to provide a complete application for managing media titles.

### MainAudio.java
This class integrates audio-related features, using `Playlist`, `Musica`, and `Podcast` to manage different types of audio content.

### Episodio.java
Represents a single episode of a series. It implements the `Puntuacion` interface and includes attributes like episode number and name.

### Pelicula.java
Represents a movie and extends from the `Titulo` class, inheriting common attributes while adding a specific attribute for the director.

### Serie.java
Represents a TV series and extends from the `Titulo` class. It includes attributes such as the number of seasons, episodes per season, and minutes per episode.

### Titulo.java
This is the parent class for both `Pelicula` and `Serie`, containing common attributes like title type, name, release date, and duration.

### CalculadoraDeTiempo.java
A utility class that calculates the total time for a list of titles, demonstrating the use of polymorphism by accepting different types of `Titulo`.

### FiltroRecomendacion.java
Filters media titles based on their ratings, recommending those with a score of 4 or higher.

### Puntuacion.java
An interface that defines the `getPuntuacion()` method, which is implemented by media titles to return their rating.

### Audio.java
This is the base class for managing audio content, with attributes like title, duration, author, and release date.

### Musica.java
Represents a music track and extends from the `Audio` class. This class inherits attributes from `Audio` while providing the potential to add additional music-specific properties.

### Podcast.java
Represents a podcast episode and extends from the `Audio` class. Like `Musica`, it inherits from `Audio` and allows for more specific functionality related to podcasts.

### Playlist.java
Manages a list of audio content, whether it's music or podcasts, allowing users to create and manage playlists.

## Usage
You can modify the `Main.java` or `MainAudio.java` classes to create and manage different media titles, including both visual media and audio content. Use the `FiltroRecomendacion`, `CalculadoraDeTiempo`, and `Playlist` classes to filter recommendations, calculate total time, or manage playlists.
