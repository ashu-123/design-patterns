package iterator;

public class SongInfo {

    private String songName;

    private String bandName;

    private int yearReleased;

    public SongInfo(String songName, String bandName, int yearReleased) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearReleased = yearReleased;
    }

    public String getSongName() {
        return songName;
    }

    public SongInfo setSongName(String songName) {
        this.songName = songName;
        return this;
    }

    public String getBandName() {
        return bandName;
    }

    public SongInfo setBandName(String bandName) {
        this.bandName = bandName;
        return this;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public SongInfo setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
        return this;
    }
}
