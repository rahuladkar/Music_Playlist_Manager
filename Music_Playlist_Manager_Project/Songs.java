package Music_Playlist_Manager_Project;

// This is the Utility Class

import Music_Playlist_Manager_Project.Sorting_Songs_Based_On_Categories.Sorting_Songs_By_Album;
import Music_Playlist_Manager_Project.Sorting_Songs_Based_On_Categories.Sorting_Songs_By_Artist;
import Music_Playlist_Manager_Project.Sorting_Songs_Based_On_Categories.Sorting_Songs_By_Duration;
import Music_Playlist_Manager_Project.Sorting_Songs_Based_On_Categories.Sorting_Songs_By_Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Songs {

    //Add Song: Add a new song with details such as title, artist, album, and duration.
    public static void addSong(ArrayList<Song> songs){

        Scanner input = new Scanner(System.in);

        System.out.println("\nAdd Song Details : \n");

        System.out.print("Enter the Song Title : ");
        String title = input.nextLine();

        System.out.print("Enter the Artist Name : ");
        String artist = input.nextLine();

        System.out.print("Enter the Album Name : ");
        String album = input.nextLine();

        System.out.print("Enter the Song Duration : ");
        double duration = input.nextDouble();

        songs.add(new Song(title,artist,album,duration));

        System.out.println("\nSong Added Successfully...!\n");

    }

    //Remove Song: Remove an existing song by title.
    public static void removeSong(ArrayList<Song> songs){

        Scanner input = new Scanner(System.in);

        if (!songs.isEmpty()){

            System.out.println("\nFor Removing Song From Playlist");
            System.out.print("Please Enter the title of Song : ");
            String title = input.nextLine();

            Song temp = null;
            boolean flag = false;
            for (Song elem : songs){
                if (elem.getTitle().equalsIgnoreCase(title)){
                    temp = elem;
                    flag = true;
                }
            }
            if (flag){
                songs.remove(temp);
                System.out.println("\nSong removed Successfully...!");
            }else {
                System.out.println("Song not found...!");
                System.out.println("Please Try Again...!");
                removeSong(songs);
            }

        }
        else {
            System.out.println("The Song PlayList is empty...!");
            System.out.println("First insert some Songs...!");
        }
    }

    //Update Song: Update the details of an existing song.
    public static void updateSong(ArrayList<Song> songs){

        Scanner input = new Scanner(System.in);

        if (!songs.isEmpty()){

            System.out.println("\nUpdate the Song : ");
            System.out.println("1. Update Title \t2. Update Artist Name");
            System.out.println("3. Update Duration \t4. Update Album Name");
            System.out.print("\nEnter the option : ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){

                case 1 : {

                    System.out.print("Enter the Name : ");
                    String name = input.nextLine();
                    System.out.print("Enter the New Name : ");
                    String newName = input.nextLine();

                    boolean flag = false;
                    for(Song elem : songs){
                        if (elem.getTitle().equalsIgnoreCase(name)){
                            elem.setTitle(newName);
                            flag = true;
                        }
                    }

                    if (flag){
                        System.out.println("\nName Changed Successfully...!");
                    }
                    else {
                        System.out.println("Wrong Input...!");
                        System.out.println("Please Try Again...!");
                        updateSong(songs);
                    }

                }break;

                case 2 : {

                    System.out.print("Enter the Artist Name : ");
                    String artist = input.nextLine();
                    System.out.print("Enter the New Artist Name : ");
                    String newArtist = input.nextLine();

                    boolean flag = false;
                    for(Song elem : songs){
                        if (elem.getArtist().equalsIgnoreCase(artist)){
                            elem.setArtist(newArtist);
                            flag = true;
                        }
                    }

                    if (flag){
                        System.out.println("\nArtist Name Changed Successfully...!");
                    }
                    else {
                        System.out.println("Wrong Input...!");
                        System.out.println("Please Try Again...!");
                        updateSong(songs);
                    }

                }break;

                case 3 : {

                    System.out.print("Enter the Song Duration : ");
                    double duration = input.nextDouble();
                    System.out.print("Enter the New Song Duration Name : ");
                    double newDuration = input.nextDouble();

                    boolean flag = false;
                    for(Song elem : songs){
                        if (elem.getDuration() == duration){
                            elem.setDuration(newDuration);
                            flag = true;
                        }
                    }

                    if (flag){
                        System.out.println("\nName Changed Successfully...!");
                    }
                    else {
                        System.out.println("Wrong Input...!");
                        System.out.println("Please Try Again...!");
                        updateSong(songs);
                    }

                }break;

                case 4 : {

                    System.out.print("Enter the Album Name : ");
                    String album = input.nextLine();
                    System.out.print("Enter the New Album Name : ");
                    String newAlbum = input.nextLine();

                    boolean flag = false;
                    for(Song elem : songs){
                        if (elem.getAlbum().equalsIgnoreCase(album)){
                            elem.setAlbum(newAlbum);
                            flag = true;
                        }
                    }

                    if (flag){
                        System.out.println("\nAlbum Name Changed Successfully...!");
                    }
                    else {
                        System.out.println("Wrong Input...!");
                        System.out.println("Please Try Again...!");
                        updateSong(songs);
                    }

                }break;

                default:{
                    System.out.println("Wrong Input...!");
                }
            }
        }
        else {
            System.out.println("The Song PlayList is empty...!");
            System.out.println("First insert some Songs...!");
        }
    }

    //Search Song: Search for a song by title or artist and display its details.
    public static void searchSong(ArrayList<Song> songs){

        Scanner input = new Scanner(System.in);

        if (!songs.isEmpty()){

            System.out.println("\nSearching the Song:");
            System.out.println("1. Searching By Title");
            System.out.println("2. Searching By Artist Name");
            System.out.println("3. Searching By Album Name");
            System.out.println("4. Searching By Song Duration");
            System.out.print("\nSelect Option : ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1 : {

                    System.out.print("Enter Title : ");
                    String title = input.nextLine();

                    boolean flag = false;
                    for (Song elem : songs){
                        if (elem.getTitle().equalsIgnoreCase(title)){
                            System.out.println(elem);
                            flag = true;
                        }
                    }
                    if (flag){
                        System.out.println("\nSonge Searched Successfully..!");
                    }else {
                        System.out.println("The Song Not Found..!");
                    }

                }break;

                case 2 : {

                    System.out.print("Enter Artist Name : ");
                    String artist = input.nextLine();

                    boolean flag = false;
                    for (Song elem : songs){
                        if (elem.getArtist().equalsIgnoreCase(artist)){
                            System.out.println(elem);
                            flag = true;
                        }
                    }
                    if (flag){
                        System.out.println("\nSonge Searched Successfully..!");
                    }else {
                        System.out.println("The Song Not Found..!");
                    }

                }break;

                case 3 : {

                    System.out.print("Enter Album Name : ");
                    String album = input.nextLine();

                    boolean flag = false;
                    for (Song elem : songs){
                        if (elem.getAlbum().equalsIgnoreCase(album)){
                            System.out.println(elem);
                            flag = true;
                        }
                    }
                    if (flag){
                        System.out.println("\nSonge Searched Successfully..!");
                    }else {
                        System.out.println("The Song Not Found..!");
                    }

                }break;

                case 4 : {

                    System.out.print("Enter Song Duration : ");
                    double duration = input.nextDouble();

                    boolean flag = false;
                    for (Song elem : songs){
                        if (elem.getDuration() == duration){
                            System.out.println(elem);
                            flag = true;
                        }
                    }
                    if (flag){
                        System.out.println("\nSonge Searched Successfully..!");
                    }else {
                        System.out.println("The Song Not Found..!");
                    }

                }break;
            }

        }
        else {
            System.out.println("The Song PlayList is empty...!");
            System.out.println("First insert some Songs...!");
        }
    }

    //Display Playlist: Display all songs in the playlist.
    public static void displayPlaylist(ArrayList<Song> songs){

        Scanner input = new Scanner(System.in);

        if (!songs.isEmpty()){

            System.out.println("\n=================== Songs PlayList ==================\n");
            for (Song elem : songs){
                System.out.println(elem);
            }

        }
        else {
            System.out.println("The Song PlayList is empty...!");
            System.out.println("Please insert some Songs...!");
        }
    }

    //Sort Playlist: Sort songs by title, artist, or duration.
    public static void sortPlaylist(ArrayList<Song> songs){

        Scanner input = new Scanner(System.in);

        if (!songs.isEmpty()){

            System.out.println("\nSort The Songs:");
            System.out.println("1. Based on Title");
            System.out.println("2. Based on Artist");
            System.out.println("3. Based on Album");
            System.out.println("4. Based on Duration");
            System.out.print("\nSelect option : ");
            int choice = input.nextInt();

            switch (choice){
                case 1 : {
                    songs.sort(new Sorting_Songs_By_Title());
                    System.out.println("After Sorting The Song Playlist By Title :\n");
                    for (Song elem : songs){
                        System.out.println(elem);
                    }
                }break;

                case 2 : {
                    songs.sort(new Sorting_Songs_By_Artist());
                    System.out.println("After Sorting The Song Playlist By Artist :\n");
                    for (Song elem : songs){
                        System.out.println(elem);
                    }
                }break;

                case 3 : {
                    songs.sort(new Sorting_Songs_By_Album());
                    System.out.println("After Sorting The Song Playlist By Album :\n");
                    for (Song elem : songs){
                        System.out.println(elem);
                    }
                }break;

                case 4 : {
                    songs.sort(new Sorting_Songs_By_Duration());
                    System.out.println("After Sorting The Song Playlist By Song Duration :\n");
                    for (Song elem : songs){
                        System.out.println(elem);
                    }
                }break;
            }

        }
        else {
            System.out.println("The Song PlayList is empty...!");
            System.out.println("First insert some Songs...!");
        }
    }

}
