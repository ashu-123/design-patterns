package composite;

public class SongListGenerator {

    public static void main(String[] args) {

        SongComponent industrial = new SongGroup("Industrial", "great");
        SongComponent heavyMetal = new SongGroup("Heavy Metal", "good");
        SongComponent dubstep = new SongGroup("DubStep", "fine");
        SongComponent everySong = new SongGroup("Song List", "Every Song available");

        everySong.add(industrial);
        industrial.add(new Song("Hey ram", "Agni", 1990));
        industrial.add(dubstep);

        dubstep.add(new Song("Super", "Vishal", 2010));

        everySong.add(heavyMetal);
        heavyMetal.add(new Song("Believer", "Imagine dragons", 2020));

        DiscJockey discJockey = new DiscJockey(everySong);
        discJockey.getSongList();
    }
}
