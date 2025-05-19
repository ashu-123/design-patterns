package bridge;

public abstract class RemoteButton {

    private EntertainmentDevice entertainmentDevice;

    public RemoteButton(EntertainmentDevice entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }

    public void buttonFivePressed() {
        this.entertainmentDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        this.entertainmentDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        this.entertainmentDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
