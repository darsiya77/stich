package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class RoboTest {
    public static void main(String[] args) {
        Rob robot = new Rob(0,0,Direction.UP);
        int x = 3;
        int y = 3;
        System.out.printf("Изначальные координаты: (x = %s, y = %s), Направление: %s \n" , robot.getX(), robot.getY(), robot.getDirection().getTranslate());
        System.out.printf("Вижу цель - (x = %s, y = %s) - иду к ней\n\n", x, y);
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
        System.out.println("Я на месте по координатам X и Y ");
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
            // текущая координата X
        }

        public int getY() {
            return y;
            // текущая координата Y
        }

        public void turnLeft() {
            System.out.println("Поворачиваю налево");
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else dir = Direction.UP;
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            System.out.println("Поворачиваю направо");
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else dir = Direction.UP;
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            System.out.printf("Движение %s (%s, %s) ", dir.getTranslate(), x, y);
            if (dir == Direction.UP) {
                y++;
            } else if (dir == Direction.RIGHT) {
                x++;
            } else if (dir == Direction.DOWN) {
                y--;
            } else
                x--;
            System.out.printf("-> (%s, %s)\n", x, y);
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }
}
/* В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
    robot.getDirection() == Direction.UP

        Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();

        Требования:
        1. должен быть метод public static void moveRobot(Robot robot, int toX, int toY)
        2. метод moveRobot должен переместить робота в позицию int toX, int toY*/
