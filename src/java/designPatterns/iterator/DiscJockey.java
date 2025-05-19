package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DiscJockey {

    private SongIterator songOf70;

    private SongIterator songOf80;

    private SongIterator songOf90;

    public DiscJockey(SongOf70 songOf70, SongOf80 songOf80, SongOf90 songOf90) {
        this.songOf70 = songOf70;
        this.songOf80 = songOf80;
        this.songOf90 = songOf90;
    }

    public void showTheSongs() {
        Iterator<SongInfo> songOf70Iterator = songOf70.createIterator();
        Iterator<SongInfo> songOf80Iterator = songOf80.createIterator();
        Iterator<SongInfo> songOf90Iterator = songOf90.createIterator();

        System.out.println("Songs of the 70s");
        printTheSongs(songOf70Iterator);

        System.out.println("------");

        System.out.println("Songs of the 80s");
        printTheSongs(songOf80Iterator);

        System.out.println("-------");

        System.out.println("Songs of the 90s");
        printTheSongs(songOf90Iterator);
    }

    private void printTheSongs(Iterator<SongInfo> songInfoIterator) {

        while (songInfoIterator.hasNext()) {
            SongInfo songInfo = songInfoIterator.next();
            System.out.println("Name of the song : " + songInfo.getSongName());
            System.out.println("Name of the band : " + songInfo.getBandName());
            System.out.println("Release year of the song : " + songInfo.getYearReleased());
        }
    }
}
