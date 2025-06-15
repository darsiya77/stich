package Archive.Exception.Robot;

import Archive.Exception.AvtoRobot.Connection.RobotConnection;

import java.io.IOException;

public class Main {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        RobotConnection robotConnection = null;
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(5, 5);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
                e.printStackTrace();
            }
//            finally {
//                if (robotConnection != null) {
//                    try {
//                        robotConnection.close();
//                    } catch (Exception e) {
//                    }
//                }
//            }
        }

        //���� ��� �����
    }

    //    ����������� � ������ �������������� � ��������� ����������� RobotConnection:
    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();

//    RobotConnection - ��� �������� ��������������� ����������, ������� ���� ���������, ����� ��� ������ �� �����.
//    ��� �������� ���������� � ���������� ���� ����� close().
    }

    //    �� ��������� ���������� �������� RobotConnectionManager:
    public interface RobotConnectionManager {

        RobotConnection getConnection();
//        ����� getConnection() ������ ������� ����������� � ������� � ���������� ������������� ����������,
//        ����� ������� ����� �������� ������ �������.
    }

    //    ��������� ���������� ����� ����������� ���������, � ����� ��� ������������� ���������� ����� �������� �����������.
//    ������ ������. ������� ����� ����� RobotConnectionManager � RobotConnection ����� �������
//    ������������� ���������� RobotConnectionException:
    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

//        ���� ������ - ����������� �����, ������� ������������� ���������� � �������, ������ ��� ������� �� �����������
//        � �������� ����� � ����� ��������� ����������, �������� ��� ������������� ������ ���� ������������������ �� ���� ���.
//        ��� ����:
//        ������� ������ ������� ������ ��������� ��������, ���� ������� ���������� ���������� � ��������� �����
//        RobotConnection.moveRobotTo() ��� ����������. ������ �������� ���������� �� ����� � ������ ��������������.
//
//        ���� ������ ������� ������������ � ������ ������� ��������� ����������, �� ��������� ���������� � ���������
//        ������ �������. ���� ������ ���� �� �������, �� ����������� ������. ����� ������� ������� ����� ������
//        ������� ���������� RobotConnectionException.
//
//        ����� �������� �� �������� � �������� ����������. ���� ���������� ������� ����������, �� ��� �����������
//        ������ ���� ������� �������� �� ��������� ����������, ����������� � ���������� �� ����� ������ ������.
//
//        ���� �� ����� ������ ������ ��������� ���������� ������ ����, ��������� �� RobotConnectionException,
//        ����� ������ ����������� � ��������� ��� ����������, �� �������� ��������� ������� ���������� � �������.
//        ������������, ��� ����� ������ ������� ����� �������� ����� ���������� � ������� �������� ���������� RobotConnection.
//        � ������� ������ �������������� ������������ try-catch.