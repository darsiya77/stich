package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class RobotTest3313 {//---___---___---___---___---___---___---ROBOT_TEST___---___---___---___---___---___---___---

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.x = -5;
        robot.y = -8;
        robot.direction = Direction.LEFT;
        int X = 2, Y = 4;
        System.out.println("����������� ����������: (x = " + robot.x + ", y = " + robot.y + "), �����������: " + robot.direction); // ����������� ����������: (X=3, Y=3), �����������: UP
        System.out.println("���� ���� - ��� � ���: (X = " + X + ", Y = " + Y + ")");                    //���� ���� - ��� � ���:  (X=3, Y=3)
        moveRobot (robot,X,Y);
        if (X == robot.x && Y == robot.y){
            System.out.println("���� ����������");
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {//================MOVE_ROBOT===========================
        if (robot.x != toX && robot.y != toY) ;{
            if (robot.x < toX) {  // _________________________________________���� �� ��� � ������ ���� ��������� ������
                //if (robot.direction != Direction.RIGHT) {
                    while (robot.direction != Direction.RIGHT) robot.turnRight();
                //}
                while (robot.x != toX) robot.stepForward();
            }
            if (robot.x > toX) {  // _________________________________________���� �� ��� � ������ ���� ��������� �����
                //if (robot.direction != Direction.LEFT) {
                    while (robot.direction != Direction.LEFT) robot.turnLeft();
                //}
                while (robot.x != toX) robot.stepForward();
            }
            if (robot.y < toY) {  // __________________________________________���� �� ��� Y ������ ���� ��������� �����
                //if (robot.direction != Direction.UP) {
                    while (robot.direction != Direction.UP) robot.turnRight();
                //}
                while (robot.y != toY) robot.stepForward();
            }
            if (robot.y > toY) {  // ___________________________________________���� �� ��� Y ������ ���� ��������� ����
                //if (robot.direction != Direction.DOWN) {
                    while (robot.direction != Direction.DOWN) robot.turnLeft();
                //}
                while (robot.y != toY) robot.stepForward();
            }
            System.out.println("� �� ����� �� �����������  � � Y!");
        }//=============================================================================================================
      /*
        ����������� ��������� ������:
        robot.getX() == 0, robot.getY() == 0;  -   ��������� ��������� ������

        ����� �������� ������ � ��������� ����� (3, 0), ����� ������ ������� � ������ ��������� ������:
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();

        � ����� ��������: toX == 3, toY == 0; ��������� ��������� ������ �����: robot.getX() == 0, robot.getY() == 0,
robot.getDirection() == Direction.UP
        */
    }
    public static class Robot {//===================================CLASS_ROBOT=========================================
        int x;
        int y;
        Direction direction;

        public Direction getDirection() {    //   enum Direction
            return direction;
            // ������� ����������� �������
        }

        public int getX() {            // ����� getX (����������)
            return x;
            // ������� ���������� X
        }

        public int getY() {            // ����� getY (����������)
            return y;
            // ������� ���������� Y
        }

        public void turnLeft() {            // ����� turnLeft
            System.out.println("������� ������.");
            if (direction == Direction.LEFT) {
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.UP;
            } else if (direction == Direction.UP) {
                direction = Direction.LEFT;
            }
            // ����������� �� 90 �������� ������ ������� �������
        }

        public void turnRight() {            // ����� turnLeft
            System.out.println("������� �������.");
            if (direction == Direction.LEFT){
                direction = Direction.UP;
            } else if (direction == Direction.UP){
                direction = Direction.RIGHT;
            } else if (direction == Direction.RIGHT){
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN){
                direction = Direction.LEFT;
            }
            // ����������� �� 90 �������� �� ������� �������
        }

        public void stepForward() {          // ����� turnLeft
            System.out.printf("�������� %s (%s, %s) ", direction.translate, x, y); // �������� UP: (3, 3)
            if (direction == Direction.RIGHT) {
                x++;
            }
            if (direction == Direction.LEFT) {
                x--;
            }
            if (direction == Direction.UP) {
                y++;
            }
            if (direction == Direction.DOWN) {
                y--;
            }
            System.out.printf("-> (%s, %s)\n", x, y); //  -> (3, 3)
            // �����:   �������� UP: (3, 3) -> (3, 3)
        }
            // ��� � ����������� �������
            // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
    }//================================================================================================================
}//---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---
/* �� ������� ���� ��������� �����. ������� ������ �� ���� ����������� ����� ������������� ������������: X � Y. ��� X
������� ����� �������, ��� Y - ����� �����. (�������, ��� �������� ������� ������� � �����?)
� ��������� ������ ����� ��������� � ��������� ������� �� ����. ����� ��������, ���� ����� �������: �����, ����, �������
��� ������. ���� ������ � �������� ������ � �������� ����� �������� ����.

����� ����������� ������� Robot. �� ������ ������������ ���������� ��� �������� (���������� ��� ����������):

public class Robot {

    public Direction getDirection() {
        // ������� ����������� �������
    }

    public int getX() {
        // ������� ���������� X
    }

    public int getY() {
        // ������� ���������� Y
    }

    public void turnLeft() {
        // ����������� �� 90 �������� ������ ������� �������
    }

    public void turnRight() {
        // ����������� �� 90 �������� �� ������� �������
    }

    public void stepForward() {
        // ��� � ����������� �������
        // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
    }
}

������
� ����� ��������: toX == 3, toY == 0; ��������� ��������� ������ �����: robot.getX() == 0, robot.getY() == 0,
robot.getDirection() == Direction.UP

����� �������� ������ � ��������� ����� (3, 0), ����� ������ ������� � ������ ��������� ������:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();
����������:
1. ������ ���� ����� public static void moveRobot(Robot robot, int toX, int toY)
2. ����� moveRobot ������ ����������� ������ � ������� int toX, int toY
*/
