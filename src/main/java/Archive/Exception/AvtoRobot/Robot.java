package Archive.Exception.AvtoRobot;

import Archive.Exception.AvtoRobot.ConnectManager.IRobotConnectionManager;
import Archive.Exception.AvtoRobot.ConnectManager.RobotConnectionManager;
import Archive.Exception.AvtoRobot.Connection.IRobotConnection;

public class Robot {
    public static void main(String[] args) {
        IRobotConnectionManager robotCM = new RobotConnectionManager();
        moveRobot(robotCM, 10,5 );

    }
    public static void moveRobot(IRobotConnectionManager robotConnectionManager, int toX, int toY) {
        IRobotConnection robotConnection = null;
        for (int i = 0; i < 3; i++) {
            robotConnection = null;
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                    e.printStackTrace();
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException e) {
                        System.out.println("Done - �� �������� ���� � ���� ����� �� ����� ����������");
                    }
                }
            }
        }
    }
}
/*    �������� ������ ������� ��������� ������. ������ �� ����� ������ ������ ������� ��������, ����������� � ����
�� ������������� ������ �����.

        ����������� � ������ �������������� � ��������� ����������� RobotConnection:
        ��, ����� � ��� ��� ������� � ���� �������� ������� �� ����������� � �������� ����� (����� moveRobotTo). �
        �� ������ �� ����� ��������� ����������.

        RobotConnection - ��� �������� ��������������� ����������, ������� ���� ���������, ����� ��� ������ �� �����.
        ��� �������� ���������� � ���������� ���� ����� close().

        �� ��������� ���������� �������� RobotConnectionManager:
        ����� getConnection() ������ ������� ����������� � ������� � ���������� ������������� ����������, �����
        ������� ����� �������� ������ �������.

        ��������� ���������� ����� ����������� ���������, � ����� ��� ������������� ���������� �����
        �������� �����������. ������ ������. ������� ����� ����� RobotConnectionManager � RobotConnection ����� �������
        ������������� ���������� RobotConnectionException:
        ���� ������ - ����������� ����� ������� ������������� ���������� � �������, ������ ��� ������� �� �����������
        � �������� ����� � ����� ��������� ����������, �������� ��� ������������� ������ ���� ������������������ �� ���� ���.

        ��� ����:

        ������� ������ ������� ������ ��������� ��������, ���� ������� ���������� ���������� � ���������
        ����� RobotConnection.moveRobotTo() ��� ����������. ������ �������� ���������� �� ����� � ������ ��������������.

        ���� ������ ������� ������������ � ������ ������� ��������� ����������, �� ��������� ���������� � ���������
        ������ �������. ���� ������ ���� �� �������, �� ����������� ������. ����� ������� ������� ����� ������
        ������� ���������� RobotConnectionException.

        ����� �������� �� �������� � �������� ����������. ���� ���������� ������� ����������, �� ��� �����������
        ������ ���� ������� �������� �� ��������� ����������, ����������� � ���������� �� ����� ������ ������.

        ���� �� ����� ������ ������ ��������� ���������� ������ ����, ��������� �� RobotConnectionException,
        ����� ������ ����������� � ��������� ��� ����������, �� �������� ��������� ������� ���������� � �������.
        ������������, ��� ����� ������ ������� ����� �������� ����� ���������� � ������� �������� ���������� RobotConnection.

        � ������� ������ �������������� ������������ try-catch.*/
