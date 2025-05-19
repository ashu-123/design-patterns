package bridge;

public class TvPauseRemote extends RemoteButton{

    public TvPauseRemote(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}
