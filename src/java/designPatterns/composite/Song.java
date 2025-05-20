package composite;

public class Song extends SongComponent{

    private String songName;
    private String bandName;
    private int releaseYear;

    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySongInfo() {
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());
    }
}
