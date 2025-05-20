package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{

    private String groupName;
    private String groupDescription;

    ArrayList songComponents = new ArrayList<>();

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent songComponent) { songComponents.add(songComponent); }

    public void remove(int songComponentIndex) { songComponents.remove(songComponentIndex); }

    public SongComponent getSongComponent(int componentIndex) {
        return (SongComponent) songComponents.get(componentIndex);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName());
        System.out.println(getGroupDescription());

        Iterator songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
