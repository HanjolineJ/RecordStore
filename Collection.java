import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collection {
   ArrayList<Album> albums = new ArrayList<>();
    HashMap<String, Integer> collection = new HashMap<>();
    int id = 0;
    public int addAlbum(String title, String artist) {
        Album album = new Album(title, artist, id);
        albums.add(album);
        id++;
        return album.getId();
    }
    public ArrayList<Album> findAlbum(String name){
        ArrayList<Album> foundAlbums = new ArrayList<>();
        for (Album album : albums) {
            if (album.getTitle().contains(name) || album.getArtist().contains(name)) {
                foundAlbums.add(album);
            }
        }
        return foundAlbums;
    }
    public int getId(String name){
        for (Map.Entry<String, Integer> entry : collection.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return 0;
    }


}