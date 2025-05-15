package command;

public class VolumeDown implements Command{

    private final ElectronicDevice electronicDevice;

    public VolumeDown(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.volumeDown();
    }

    @Override
    public void undo() { this.electronicDevice.volumeUp(); }
}
