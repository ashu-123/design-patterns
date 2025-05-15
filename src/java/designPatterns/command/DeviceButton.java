package command;

public class DeviceButton {

    Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }

    public void pressUndo() {
        this.command.undo();
    }
}
