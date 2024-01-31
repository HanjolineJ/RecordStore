//create a program that keeps track of a record collection (music)
//classes:
//Collection
//Album
//Collection methods:
// add album to collection - returns an album id (can be sequential)
//get album object - using album id
//find an album with a title or artist name (substring) - list all

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       Collection collection = new Collection();
         collection.addAlbum("The Dark Side of the Moon", "Pink Floyd");
            ArrayList<Album> foundAlbums = collection.findAlbum("Pink");
            for (Album foundAlbum : foundAlbums) {
                System.out.println(foundAlbum.getTitle() + " " + foundAlbum.getArtist() + " " + foundAlbum.getId());
                if (collection.getId(foundAlbum.getTitle()) > 0) {
                    System.out.println("You have " + collection.getId(foundAlbum.getTitle()) + " " + foundAlbum.getTitle());
                }
            }
    }
}
