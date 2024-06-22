package Music_Playlist_Manager_Project;

public class Song {

    private String title; // title (String): The title of the song.
    private String artist; // artist (String): The artist who performed the song.
    private String album; // album (String): The album in which the song is included.
    private double duration; // duration (double): The duration of the song in minutes.

    // getter() and setter()
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }

    // constructor to initialize the attributes
    public Song(String title, String artist, String album, double duration) {
        setTitle(title);
        setArtist(artist);
        setAlbum(album);
        setDuration(duration);
    }

    // overridden toString()
    @Override
    public String toString() {
        return "Song " + " { " +
                "title = '" + title + '\'' +
                " , artist = '" + artist + '\'' +
                " , album = '" + album + '\'' +
                " , duration = " + duration + " }";
    }
}

