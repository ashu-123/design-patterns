package bridge;

public class TvMuteRemote extends RemoteButton {

    public TvMuteRemote(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }
}
