package command;

import java.util.List;

public class TurnItAllOff implements Command{

    private final List<ElectronicDevice> electronicDevices;

    public TurnItAllOff(List<ElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    @Override
    public void execute() {
        for(var electronicDevice : this.electronicDevices) electronicDevice.off();
    }

    @Override
    public void undo() {
        for(var electronicDevice : electronicDevices) electronicDevice.on();
    }
}
