package designpattern.command;

/**
 * 遥控器
 */
public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;
    // 撤销按钮
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     * @param no
     */
    public void pushOnButton(int no) {
        onCommands[no].execute();
        // 记录上一次按下的按钮
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void pushOffButton(int no) {
        offCommands[no].execute();
        // 记录上一次按下的按钮
        undoCommand = offCommands[no];
    }

    public void undo() {
        undoCommand.undo();
    }
}
