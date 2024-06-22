package Music_Playlist_Manager_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_Management {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();

        System.out.println("\n================================= Song Playlist Manager =================================");

        while (true){

            System.out.println("\n1. Add Song \t\t2. Remove Song");
            System.out.println("3. Update Song \t\t4. Search Song");
            System.out.println("5. Sort Playlist \t6. Display Playlist");
            System.out.println("0. Exit");
            System.out.print("\nSelect the option : ");
            int choice = ip.nextInt();
            ip.nextLine();

            switch (choice){

                case 1 : {
                    Songs.addSong(songs);
                }break;

                case 2 : {
                    Songs.removeSong(songs);
                }break;

                case 3 : {
                    Songs.updateSong(songs);
                }break;

                case 4 : {
                    Songs.searchSong(songs);
                }break;

                case 5 : {
                    Songs.sortPlaylist(songs);
                }break;

                case 6 : {
                    Songs.displayPlaylist(songs);
                }break;

                case 0 : {
                    ip.close();
                    System.out.println("\nThank You...!");
                    System.exit(1);
                }break;

                default: {
                    System.out.println("\nWrong Input...!");
                    System.out.println("Try Again...!");
                }

            }// end of switch

        }// end of while loop

    }

}
