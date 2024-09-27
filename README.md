<<<<<<< HEAD
=======
# Screenmatch Application

This Java project is designed to manage and recommend various media titles, including movies, series, and audio content like music and podcasts, based on their ratings. It employs object-oriented programming principles such as inheritance and polymorphism, making the project scalable and easy to maintain.

## Table of Contents
- [Getting Started](#getting-started)
- [Classes Overview](#classes-overview)
- [Dependencies](#dependencies)
- [Usage](#usage)
- [Contributing](#contributing)
>>>>>>> 3a9710ca0cca45b044b416be767863e382ec0420

## Getting Started
To run the application, you need to ensure that you have the following dependencies installed:
- JDK 11 or higher

<<<<<<< HEAD
Welcome to the **[Nombre del Proyecto]**. This project is a Java-based system for managing and recommending movies, series, audio content (music, podcasts, and episodes), and purchases. It includes classes to handle titles, ratings, recommendations, and filters, with additional logging and purchase management functionalities.

This project is designed to work seamlessly with **IntelliJ IDEA**.
=======
### Installation
1. Clone the repository.
2. ```bash
   https://github.com/DiiegoA/aplicando-la-orientacion-de-objetos-ONE.git
   ```
3. Compile the Java files using a Java compiler.
4. Run the `Main` or `MainAudio` classes to execute the application.
>>>>>>> 3a9710ca0cca45b044b416be767863e382ec0420

## Classes Overview

<<<<<<< HEAD
The project follows a structured format with the following key files and directories:

- `src/main`: Contains the main application classes.
- `src/main/java`:
  - **Movies and Series Management**:
    - `Pelicula.java`: Represents a movie and its attributes.
    - `Serie.java`: Represents a TV series and its attributes.
    - `Titulo.java`: A parent class for `Pelicula` and `Serie` to share common attributes.
    - `Main.java`: The entry point for the application, which initiates the program execution.
    - `CalculadoraDeTiempo.java`: A utility class to calculate time-based data for movies and series.
    - `FiltroRecomendacion.java`: Provides functionality to filter movies and series based on user preferences.
    - `Puntuacion.java`: Manages the rating system for movies and series.

  - **Audio Management**:
    - `MainAudio.java`: The main class for managing audio-related content.
    - `Audio.java`: Represents a general audio item, serving as the base class for music and podcast.
    - `Musica.java`: Represents a music item with specific attributes for music-related content.
    - `Podcast.java`: Represents a podcast with episodes.
    - `Episodio.java`: Represents an individual episode within a podcast.
    - `Playlist.java`: Manages playlists that can include various audio items like music and podcasts.

  - **Purchase Management**:
    - `GestionCompras.java`: Manages the process of purchases within the system.
    - `Compra.java`: Represents an individual purchase made by a user.
  
  - **Utility Classes**:
    - `MainArrays.java`: Demonstrates the use of arrays in the system for managing lists.
    - `Listas.java`: Implements additional list management utilities for the system.
  
  - **Logger and Utilities**:
    - `LoggerBase.java`: Defines a base logging interface.
    - `LoggerBaseImpl.java`: Implements the logging interface to handle log operations for the project.

The compiled output files are generated in the `bin` folder by default.

## Running the Project in IntelliJ IDEA

To run this project in IntelliJ IDEA:

1. **Clone the Repository**: Use `git clone` or download the source code.
2. **Open IntelliJ IDEA**: Import the project as a Maven/Gradle project if needed.
3. **Build the Project**: Go to `Build > Build Project` or press `Ctrl + F9`.
4. **Run the Application**: Navigate to the relevant `Main.java` or `MainAudio.java` classes depending on the functionality you want to test, right-click, and select `Run` or use the green play button in the toolbar.
=======
### Main.java
The main class that integrates different modules like `CalculadoraDeTiempo`, `FiltroRecomendacion`, `Episodio`, and `Pelicula` to provide a complete application for managing media titles.

### MainAudio.java
This class integrates audio-related features, using `Playlist`, `Musica`, and `Podcast` to manage different types of audio content.

### Episodio.java
Represents a single episode of a series. It implements the `Puntuacion` interface and includes attributes like episode number and name.

### Pelicula.java
Represents a movie and extends from the `Titulo` class, inheriting common attributes while adding a specific attribute for the director.
>>>>>>> 3a9710ca0cca45b044b416be767863e382ec0420

### Serie.java
Represents a TV series and extends from the `Titulo` class. It includes attributes such as the number of seasons, episodes per season, and minutes per episode.

<<<<<<< HEAD
Dependencies are handled via **IntelliJ's build tools**, which might include Maven or Gradle. If your project includes external libraries, they should be added to the `lib` folder or managed via IntelliJ’s project settings.
=======
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
>>>>>>> 3a9710ca0cca45b044b416be767863e382ec0420
