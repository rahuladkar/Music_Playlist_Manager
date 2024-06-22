# Playlist Manager
Author : Rahul Adkar

## Overview

The Playlist Manager is a simple application designed to help users manage their music playlists. It allows users to add songs, remove songs, update song details, search for specific songs, and display the entire playlist.

## Features

- **Add Song:** Add a new song with details such as title, artist, album, and duration.
- **Remove Song:** Remove an existing song by title.
- **Update Song:** Update the details of an existing song.
- **Search Song:** Search for a song by title or artist and display its details.
- **Display Playlist:** Display all songs in the playlist.
- **Sort Playlist:** Sort songs by title, artist, or duration.

## Class Design

### Song Class

The `Song` class represents a song in the playlist. It has the following attributes:

- `title` (String): The title of the song.
- `artist` (String): The artist who performed the song.
- `album` (String): The album in which the song is included.
- `duration` (double): The duration of the song in minutes.

### PlaylistManager Class

The `PlaylistManager` class manages a list of songs using an `ArrayList<Song>`. It includes methods for adding, removing, updating, searching, sorting, and displaying songs.

## Functionality

### Add Song

- **Input:** User enters the song's title, artist, album, and duration.
- **Process:** Create a new `Song` object and add it to the `ArrayList<Song>`.
- **Output:** Confirmation message that the song has been added.

### Remove Song

- **Input:** User enters the title of the song to be removed.
- **Process:** Search the `ArrayList<Song>` for a song with the given title. If found, remove it.
- **Output:** Confirmation message if the song is removed, or an error message if the song is not found.

### Update Song

- **Input:** User enters the title of the song to be updated, along with the new artist, album, and duration.
- **Process:** Search the `ArrayList<Song>` for a song with the given title. If found, update the artist, album, and duration.
- **Output:** Confirmation message if the song is updated, or an error message if the song is not found.

### Search Song

- **Input:** User enters the title or artist of the song to search for.
- **Process:** Search the `ArrayList<Song>` for songs with the given title or artist.
- **Output:** Display the song details if found, or an error message if the song is not found.

### Display Playlist

- **Process:** Iterate through the `ArrayList<Song>` and display the details of each song.
- **Output:** List of all songs with their details.

### Sort Playlist

- **Input:** User selects the criterion for sorting (title, artist, or duration).
- **Process:** Sort the `ArrayList<Song>` based on the selected criterion.
- **Output:** Display the sorted list of songs.

## User Interface

The application provides a menu-driven interface for users to interact with the system. The menu options are:

1. Add Song
2. Remove Song
3. Update Song
4. Search Song
5. Display Playlist
6. Sort Playlist
7. Exit

### Example Workflow

1. **Start Application:**
   - Display the main menu with options: Add Song, Remove Song, Update Song, Search Song, Display Playlist, Sort Playlist, Exit.

2. **Add a Song:**
   - User selects "Add Song".
   - User is prompted to enter the title, artist, album, and duration.
   - The song is added to the playlist, and a confirmation message is displayed.

3. **Remove a Song:**
   - User selects "Remove Song".
   - User is prompted to enter the title of the song to be removed.
   - The song is removed from the playlist if found, and a confirmation message is displayed.

4. **Update a Song:**
   - User selects "Update Song".
   - User is prompted to enter the title of the song to be updated, and the new artist, album, and duration.
   - The song details are updated if the song is found, and a confirmation message is displayed.

5. **Search for a Song:**
   - User selects "Search Song".
   - User is prompted to enter the title or artist of the song to search for.
   - The song details are displayed if found, or an error message if not found.

6. **Display Playlist:**
   - User selects "Display Playlist".
   - All songs in the playlist are displayed.

7. **Sort Playlist:**
   - User selects "Sort Playlist".
   - User is prompted to select the criterion for sorting (title, artist, or duration).
   - The playlist is sorted and displayed based on the selected criterion.

8. **Exit Application:**
   - User selects "Exit".
   - The application terminates.

## Data Validation and Error Handling

- **Validation:**
  - Ensure that the duration is a positive number.
  - Prevent adding duplicate songs (based on title and artist).

- **Error Handling:**
  - Handle cases where the song to be removed or updated does not exist.
  - Ensure the playlist is not empty when displaying or sorting songs.

## How to Run

To run the Playlist Manager application, follow these steps:

1. Compile the Java files:
   ```sh
   javac Song.java PlaylistManager.java Main.java
