package designpattern.command;

/**
 * 命令模式
 */
public class CommandPattern {

    public static void main(String[] args) {

        // 电灯
        LightReceiver receiver = new LightReceiver();
        // 电灯命令
        LightOnCommand onCommand = new LightOnCommand(receiver);
        LightOffCommand offCommand = new LightOffCommand(receiver);

        // 遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, onCommand, offCommand);

        remoteController.pushOnButton(0);
        remoteController.pushOffButton(0);
        remoteController.undo();
    }
}
