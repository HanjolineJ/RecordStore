import java.util.ArrayList;
import java.util.HashMap;

public class Album {
    String title;
    String artist;
    int id;
    public Album(String title, String artist, int id) {
        this.title = title;
        this.artist = artist;
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getId() {
        return id;
    }

    }