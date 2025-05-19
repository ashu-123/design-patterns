package bridge;

public class TestTheRemote {

    public static void main(String[] args) {
        RemoteButton tvMutBRemote = new TvMuteRemote(new TvDevice(1, 300));
        RemoteButton tvPauseButton = new TvPauseRemote(new TvDevice(1, 300));

        System.out.println("Test TV with mute");
        tvMutBRemote.buttonFivePressed();
        tvMutBRemote.buttonSixPressed();
        tvMutBRemote.buttonNinePressed();

        System.out.println("Test TV with Pause");
        tvPauseButton.buttonFivePressed();
        tvPauseButton.buttonSixPressed();
        tvPauseButton.buttonSixPressed();
        tvPauseButton.buttonSixPressed();
        tvPauseButton.buttonSixPressed();
        tvPauseButton.buttonNinePressed();
        tvPauseButton.deviceFeedback();

    }
}
