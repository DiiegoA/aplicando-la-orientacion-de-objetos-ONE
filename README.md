
## Getting Started

Welcome to the **ScreenMatch**. This project is a Java-based system for managing and recommending movies, series, audio content (music, podcasts, and episodes), and purchases. It includes classes to handle titles, ratings, recommendations, and filters, with additional logging and purchase management functionalities.

This project is designed to work seamlessly with **IntelliJ IDEA**.

## Folder Structure

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

1. **Clone the Repository**: Use `git clone  https://github.com/DiiegoA/aplicando-la-orientacion-de-objetos-ONE.git` or download the source code.
2. **Open IntelliJ IDEA**: Import the project as a Maven/Gradle project if needed.
3. **Build the Project**: Go to `Build > Build Project` or press `Ctrl + F9`.
4. **Run the Application**: Navigate to the relevant `Main.java` or `MainAudio.java` classes depending on the functionality you want to test, right-click, and select `Run` or use the green play button in the toolbar.

## Dependency Management

Dependencies are handled via **IntelliJ's build tools**, which might include Maven or Gradle. If your project includes external libraries, they should be added to the `lib` folder or managed via IntelliJ’s project settings.
