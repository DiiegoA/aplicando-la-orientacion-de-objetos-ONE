# ScreenMatch Media Management Application

## Overview
The **ScreenMatch Media Management Application** is a comprehensive Java-based system designed to efficiently manage, organize, and recommend multimedia content. The application includes functionality for handling movies, series, music, and podcasts, providing users with tools for categorizing and analyzing their media collections. Additionally, ScreenMatch integrates with external APIs, including the Star Wars API, to offer enriched content and a more dynamic user experience.

One of the main goals of the application is to offer a complete media solution that includes the ability to track viewing times, filter recommendations, manage audio playlists, and even handle user purchases. With a strong focus on usability, it also incorporates extensive error handling and logging capabilities to ensure smooth operation.

This application is ideal for users who want to:
- Manage a large library of media content (movies, series, music, podcasts).
- Track viewing times and receive personalized content recommendations.
- Fetch data from APIs such as the Star Wars API for additional content.
- Manage purchases and expenses associated with media.
- View media collections in a structured and organized way.

## Key Features
The ScreenMatch application comes equipped with the following key features:

### **1. Media Management**
- Allows users to store and organize movies, series, music, and podcasts.
- Displays important metadata for each title, including:
  - Title name
  - Duration
  - Release year
  - Director (for movies and series)
  - Genre (for music and podcasts)

### **2. Audio Management**
- Users can create and manage playlists for their favorite music and podcasts.
- Features include:
  - Adding tracks and episodes to playlists.
  - Playing audio from the playlist with integrated logging.
  - Calculating the total time of all items in a playlist.

### **3. Star Wars API Integration**
- The app fetches information directly from the [Star Wars API](https://swapi.dev/), providing users with access to data on Star Wars movies, planets, and characters.
- Includes rich metadata such as:
  - Movie titles, episode numbers, and descriptions.
  - Planets and their characteristics (climate, terrain, population).
  - Directors and producers of Star Wars movies.

### **4. Purchase Management**
- Tracks user purchases related to media, such as buying movies or subscribing to podcast services.
- Features include:
  - Adding new purchases (with details such as product name, price, and quantity).
  - Viewing a complete list of purchases.
  - Sorting purchases and calculating the total cost.
  - Displaying the remaining balance after expenses.

### **5. Time Calculation**
- Provides a tool to sum the total viewing time of selected movies and series.
- This feature is useful for users who want to track how much time they spend watching content.

### **6. Content Recommendation**
- Filters media based on criteria such as:
  - Popularity
  - Total views
  - User ratings
- Delivers personalized recommendations to help users discover new content based on their viewing habits.

### **7. Error Handling and Logging**
- **Robust error handling**: Catches and manages various types of errors, including invalid input, network errors, and file-related exceptions.
- **Extensive logging**: Every user interaction and system event is logged using the `LoggerBase` class and its implementation, `LoggerBaseImpl`, providing detailed records for debugging and tracking purposes.

## System Requirements
To run the ScreenMatch application, ensure your system meets the following requirements:
- **Java SDK 8 or higher**: The application relies on Java for its core functionalities.
- **Internet connection**: Required for API calls, particularly for fetching data from the Star Wars API.

## How to Run

### Step 1: Clone the Repository
Begin by cloning the project repository to your local machine using the following command:
```bash
git clone https://github.com/DiiegoA/aplicando-la-orientacion-de-objetos-ONE.git
