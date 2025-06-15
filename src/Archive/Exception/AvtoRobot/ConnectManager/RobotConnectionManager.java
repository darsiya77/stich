package Archive.Exception.AvtoRobot.ConnectManager;

import Archive.Exception.AvtoRobot.Connection.RobotConnection;
import Archive.Exception.AvtoRobot.RobotConnectionException;

import java.util.Random;

public class RobotConnectionManager implements IRobotConnectionManager {

    @Override
    public RobotConnection getConnection() {
        int n = new Random().nextInt(2);
        if (n > 0) {
            //System.err.println("connection OFF");
            throw new RobotConnectionException("connection failed");

        }else {
            return new RobotConnection();
        }
    }
}
   /* �� ��������� ���������� �������� RobotConnectionManager:

����� getConnection() ������ ������� ����������� � ������� � ���������� ������������� ����������,
����� ������� ����� �������� ������ �������.

��������� ���������� ����� ����������� ���������, � ����� ��� ������������� ���������� ����� �������� �����������.
������ ������. ������� ����� ����� RobotConnectionManager � RobotConnection ����� ������� ������������� ���������� RobotConnectionException:
   */