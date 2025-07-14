package Archive.Exception.AvtoRobot.Connection;

import Archive.Exception.AvtoRobot.RobotConnectionException;

import java.util.Random;

public class RobotConnection implements  IRobotConnection {

    public RobotConnection() {
        String message = "connection ON";
        System.err.println(message);
    }

    @Override
    public void moveRobotTo(int x, int y) {
        int n = new Random().nextInt(2);
        if (n > 0) {
            throw new RobotConnectionException("connection lost, try to connect again!") ;

        }else {
            System.err.printf("I go to the coordinates x = %s, y = %s. I reached the point! \n", x, y);
        }
    }

    @Override
    public void close() {
        System.err.println("Close");
    }
}
