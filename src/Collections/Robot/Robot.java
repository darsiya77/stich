package Collections.Robot;

public class Robot {
    public static void main(String[] args) {
        Robot.moveRobot(new Robot(-5, 4, Direction.LEFT), 3, -4);

    }

    private int x;
    private int y;
    Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return this.x;
        // ������� ���������� X
    }

    public int getY() {
        return this.y;
        // ������� ���������� Y
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP -> {
                this.direction = Direction.LEFT;
                System.out.println("�������� �������, ������ ����� ������� ������");
            }

            case RIGHT -> {
                this.direction = Direction.UP;
                System.out.println("�������� �������, ������ ����� ������� �����");
            }
            case DOWN -> {
                this.direction = Direction.RIGHT;
                System.out.println("�������� �������, ������ ����� ������� �������");
            }
            case LEFT -> {
                this.direction = Direction.DOWN;
                System.out.println("�������� �������, ������ ����� ������� ����");
            }
        }
        // ����������� �� 90 �������� ������ ������� �������
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP -> {
                this.direction = Direction.RIGHT;
                System.out.println("�������� �������, ������ ����� ������� �������");
            }
            case RIGHT -> {
                this.direction = Direction.DOWN;
                System.out.println("�������� �������, ������ ����� ������� ����");
            }
            case DOWN -> {
                this.direction = Direction.LEFT;
                System.out.println("�������� �������, ������ ����� ������� ������");
            }
            case LEFT -> {
                this.direction = Direction.UP;
                System.out.println("�������� �������, ������ ����� ������� �����");
            }
        }
        // ����������� �� 90 �������� �� ������� �������
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP -> {
                this.y++;
                System.out.printf("������� ������ �����: (%d, %d)\n", getX(), getY());
            }
            case DOWN -> {
                this.y--;
                System.out.printf("������� ������ �����: (%d, %d)\n", getX(), getY());
            }
            case RIGHT -> {
                this.x++;
                System.out.printf("������� ������ �����: (%d, %d)\n", getX(), getY());
            }
            case LEFT -> {
                this.x--;
                System.out.printf("������� ������ �����: (%d, %d)\n", getX(), getY());
            }
        }
        // ��� � ����������� �������
        // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.printf("�������� ������� ������: (%d, %d, ����� ������� %s),\n���������� ������������� � �������: (%d, %d)\n" +
                "�������:\n", robot.getX(), robot.getY(), robot.getDirection().getDirection(), toX, toY);
        //________________________________
        // �� ������ ��� - 1 �� + ��������� � 2 ����
        if (toX != robot.getX()) {
            Direction dir = (toX < robot.getX()) ? Direction.LEFT : Direction.RIGHT;
            while (robot.getDirection() != dir) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY != robot.getY()) {
            Direction dir = (toY < robot.getY()) ? Direction.DOWN : Direction.UP;
            while (robot.getDirection() != dir) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        System.out.printf("����� ������ � ����� ���������� �� ����������� (%d, %d)\n", toX, toY);
    }
    //���� ��� �����
}


