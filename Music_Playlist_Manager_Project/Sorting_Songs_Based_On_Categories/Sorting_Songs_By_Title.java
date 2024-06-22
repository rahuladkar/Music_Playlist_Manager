package Music_Playlist_Manager_Project.Sorting_Songs_Based_On_Categories;

import Music_Playlist_Manager_Project.Song;

import java.util.Comparator;

public class Sorting_Songs_By_Title implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
