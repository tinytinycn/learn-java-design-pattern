package command.command;

import command.receiver.Door;

public class DoorCloseCommand implements Command {
    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.close();
    }
}
