package iterator;

public class RadioStation {

    public static void main(String[] args) {

        SongOf70 songOf70 = new SongOf70();

        SongOf90 songOf90 = new SongOf90();

        SongOf80 songOf80 = new SongOf80();

        DiscJockey discJockey = new DiscJockey(songOf70, songOf80, songOf90);

        discJockey.showTheSongs();

    }

}
