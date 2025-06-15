package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class RoboTest {
    public static void main(String[] args) {
        Rob robot = new Rob(0,0,Direction.UP);
        int x = 3;
        int y = 3;
        System.out.printf("����������� ����������: (x = %s, y = %s), �����������: %s \n" , robot.getX(), robot.getY(), robot.getDirection().getTranslate());
        System.out.printf("���� ���� - (x = %s, y = %s) - ��� � ���\n\n", x, y);
        moveRobot(robot, x, y);
    }

    public static void moveRobot(Rob robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        System.out.println("� �� ����� �� ����������� X � Y ");
    }
    public static class Rob {
        int x;
        int y;
        Direction dir;
        Rob(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
            // ������� ���������� X
        }

        public int getY() {
            return y;
            // ������� ���������� Y
        }

        public void turnLeft() {
            System.out.println("����������� ������");
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else dir = Direction.UP;
            // ����������� �� 90 �������� ������ ������� �������
        }

        public void turnRight() {
            System.out.println("����������� �������");
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else dir = Direction.UP;
            // ����������� �� 90 �������� �� ������� �������
        }

        public void stepForward() {
            System.out.printf("�������� %s (%s, %s) ", dir.getTranslate(), x, y);
            if (dir == Direction.UP) {
                y++;
            } else if (dir == Direction.RIGHT) {
                x++;
            } else if (dir == Direction.DOWN) {
                y--;
            } else
                x--;
            System.out.printf("-> (%s, %s)\n", x, y);
            // ��� � ����������� �������
            // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
        }
    }
}
/* � ����� ��������: toX == 3, toY == 0; ��������� ��������� ������ �����: robot.getX() == 0, robot.getY() == 0,
    robot.getDirection() == Direction.UP

        ����� �������� ������ � ��������� ����� (3, 0), ����� ������ ������� � ������ ��������� ������:
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();

        ����������:
        1. ������ ���� ����� public static void moveRobot(Robot robot, int toX, int toY)
        2. ����� moveRobot ������ ����������� ������ � ������� int toX, int toY*/
