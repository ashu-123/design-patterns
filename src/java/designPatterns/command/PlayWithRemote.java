package command;

import java.util.List;
import java.util.Stack;

public class PlayWithRemote {

    public static void main(String[] args) {

        ElectronicDevice electronicDevice = TvRemote.getDevice();

        Stack<Command> commands = new Stack<>();
        TurnOn turnOn = new TurnOn(electronicDevice);
        DeviceButton deviceButton = new DeviceButton(turnOn);
        deviceButton.press();
        commands.add(turnOn);

        TurnOff turnTvOff = new TurnOff(electronicDevice);
        deviceButton = new DeviceButton(turnTvOff);
        deviceButton.press();
        commands.add(turnTvOff);

        VolumeUp volumeUp = new VolumeUp(electronicDevice);
        deviceButton = new DeviceButton(volumeUp);
        deviceButton.press();
        commands.add(volumeUp);

        VolumeDown volumeDown = new VolumeDown(electronicDevice);
        deviceButton = new DeviceButton(volumeDown);
        deviceButton.press();
        commands.add(volumeDown);

        ElectronicDevice secondTV = new Television();
        ElectronicDevice radio = new Radio();

        Command turnAllOff = new TurnItAllOff(List.of(secondTV, radio));
        DeviceButton turnAllOffDevice = new DeviceButton(turnAllOff);
        turnAllOffDevice.press();
        commands.add(turnAllOff);

        while (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }
}
