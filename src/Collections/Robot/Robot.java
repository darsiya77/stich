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
        // текущая координата X
    }

    public int getY() {
        return this.y;
        // текущая координата Y
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP -> {
                this.direction = Direction.LEFT;
                System.out.println("Выполнен поворот, теперь робот смотрит НАЛЕВО");
            }

            case RIGHT -> {
                this.direction = Direction.UP;
                System.out.println("Выполнен поворот, теперь робот смотрит ВВЕРХ");
            }
            case DOWN -> {
                this.direction = Direction.RIGHT;
                System.out.println("Выполнен поворот, теперь робот смотрит НАПРАВО");
            }
            case LEFT -> {
                this.direction = Direction.DOWN;
                System.out.println("Выполнен поворот, теперь робот смотрит ВНИЗ");
            }
        }
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP -> {
                this.direction = Direction.RIGHT;
                System.out.println("Выполнен поворот, теперь робот смотрит НАПРАВО");
            }
            case RIGHT -> {
                this.direction = Direction.DOWN;
                System.out.println("Выполнен поворот, теперь робот смотрит ВНИЗ");
            }
            case DOWN -> {
                this.direction = Direction.LEFT;
                System.out.println("Выполнен поворот, теперь робот смотрит НАЛЕВО");
            }
            case LEFT -> {
                this.direction = Direction.UP;
                System.out.println("Выполнен поворот, теперь робот смотрит ВВЕРХ");
            }
        }
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP -> {
                this.y++;
                System.out.printf("Позиция робота стала: (%d, %d)\n", getX(), getY());
            }
            case DOWN -> {
                this.y--;
                System.out.printf("Позиция робота стала: (%d, %d)\n", getX(), getY());
            }
            case RIGHT -> {
                this.x++;
                System.out.printf("Позиция робота стала: (%d, %d)\n", getX(), getY());
            }
            case LEFT -> {
                this.x--;
                System.out.printf("Позиция робота стала: (%d, %d)\n", getX(), getY());
            }
        }
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.printf("Исходная позиция робота: (%d, %d, робот смотрит %s),\nНеобходимо переместиться в позицию: (%d, %d)\n" +
                "НАЧИНАЮ:\n", robot.getX(), robot.getY(), robot.getDirection().getDirection(), toX, toY);
        //________________________________
        // по каждой оси - 1 иф + тернарный и 2 вайл
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

        System.out.printf("Робот прибыл в пункт назначения по координатам (%d, %d)\n", toX, toY);
    }
    //Твой код здесь
}


