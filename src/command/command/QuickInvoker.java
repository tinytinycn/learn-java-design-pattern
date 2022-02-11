package command.command;

/**
 * Invoker调用者，可以执行多个command
 */
public class QuickInvoker {

    private Command[] commands;

    public QuickInvoker(Command[] commands) {
        this.commands = commands;
    }

    public void call() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
