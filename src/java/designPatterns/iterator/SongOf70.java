package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongOf70 implements SongIterator{

    ArrayList<SongInfo> bestSongsOf70;

    public SongOf70() {
        this.bestSongsOf70 = new ArrayList<SongInfo>();
        addSong("Hamma Hamma", "AR Rehman", 1970);
        addSong("Roza", "AR Rehman", 1974);
        addSong("Rangeela", "AR Rehman", 1977);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongsOf70.add(songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongsOf70.iterator();
    }
}
