package command;

import command.command.Command;
import command.command.DoorCloseCommand;
import command.command.DoorOpenCommand;
import command.command.LightOnCommand;
import command.command.QuickInvoker;
import command.receiver.Door;
import command.receiver.Light;

public class Client {
    void quickCommand() {
        Door door = new Door();
        Light light = new Light();

        // 回家模式
        QuickInvoker backHomeInvoker = new QuickInvoker(new Command[]{new DoorOpenCommand(door), new LightOnCommand(light)});
        // 离家模式(不关灯)
        QuickInvoker leaveHomeInvoker = new QuickInvoker(new Command[]{new DoorCloseCommand(door)});
        // invoker调用者 批量执行execute
        backHomeInvoker.call();
        leaveHomeInvoker.call();
    }
}
