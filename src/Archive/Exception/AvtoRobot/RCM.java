package Archive.Exception.AvtoRobot;

import Archive.Exception.AvtoRobot.ConnectManager.IRobotConnectionManager;
import Archive.Exception.AvtoRobot.ConnectManager.RobotConnectionManager;
import Archive.Exception.AvtoRobot.Connection.IRobotConnection;
import Archive.Exception.AvtoRobot.Connection.RobotConnection;

public class RCM {
    public static void main(String[] args) {
        IRobotConnectionManager robotCM = new RobotConnectionManager();
        moveRobot(robotCM, 10,5 );
        /*RCM rcm = new RCM() {

            public IRobotConnection getConnection() {
                return new IRobotConnection() {
                    @Override
                    public void moveRobotTo(int x, int y) {
                        System.out.println(x + ":" + y);
                        if (new Random().nextInt(50) > 25) throw new RobotConnectionException("connection failed");
                    }

                    @Override
                    public void close() {
                    }
                };
            }
        };*/
        //moveRobot(rcm, 51, 39);
    }

    public static void moveRobot(IRobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (IRobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                e.printStackTrace();
            }
        }
    }
}
