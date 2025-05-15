package command;

public class VolumeUp implements Command{

    private final ElectronicDevice electronicDevice;

    public VolumeUp(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.volumeUp();
    }

    @Override
    public void undo() { this.electronicDevice.volumeDown(); }
}
