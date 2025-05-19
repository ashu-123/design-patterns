package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SongOf80 implements SongIterator{

    SongInfo[] bestSongsOf80;

    int arrIndex = 0;

    public SongOf80() {
        this.bestSongsOf80 = new SongInfo[3];
        addSong("Mooqabla", "AR Rehman", 1980);
        addSong("Rozaana", "AR Rehman", 1984);
        addSong("Rangeela", "AR Rehman", 1987);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongsOf80[arrIndex++] = songInfo;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.stream(bestSongsOf80).iterator();
    }
}
