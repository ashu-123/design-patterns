package iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class SongOf90 implements SongIterator{

    Hashtable<Integer, SongInfo> bestSongsOf90 = new Hashtable<>();

    int hashKey = 0;

    public SongOf90() {
        addSong("Hamma Hamma", "AR Rehman", 1990);
        addSong("Ramta Jogi", "Sukhi", 1994);
        addSong("Sapne", "AR Rehman", 1996);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongsOf90.put(hashKey, songInfo);
        hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongsOf90.values().iterator();
    }
}
