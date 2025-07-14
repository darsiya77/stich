package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class RobotTest3313 {//---___---___---___---___---___---___---ROBOT_TEST___---___---___---___---___---___---___---

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.x = -5;
        robot.y = -8;
        robot.direction = Direction.LEFT;
        int X = 2, Y = 4;
        System.out.println("Изначальные координаты: (x = " + robot.x + ", y = " + robot.y + "), Направление: " + robot.direction); // Изначальные координаты: (X=3, Y=3), Направление: UP
        System.out.println("Вижу цель - иду к ней: (X = " + X + ", Y = " + Y + ")");                    //Вижу цель - иду к ней:  (X=3, Y=3)
        moveRobot (robot,X,Y);
        if (X == robot.x && Y == robot.y){
            System.out.println("Цель достигнута");
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {//================MOVE_ROBOT===========================
        if (robot.x != toX && robot.y != toY) ;{
            if (robot.x < toX) {  // _________________________________________если по Оси Х роботу надо двигаться вправо
                //if (robot.direction != Direction.RIGHT) {
                    while (robot.direction != Direction.RIGHT) robot.turnRight();
                //}
                while (robot.x != toX) robot.stepForward();
            }
            if (robot.x > toX) {  // _________________________________________если по Оси Х роботу надо двигаться влево
                //if (robot.direction != Direction.LEFT) {
                    while (robot.direction != Direction.LEFT) robot.turnLeft();
                //}
                while (robot.x != toX) robot.stepForward();
            }
            if (robot.y < toY) {  // __________________________________________если по Оси Y роботу надо двигаться вверх
                //if (robot.direction != Direction.UP) {
                    while (robot.direction != Direction.UP) robot.turnRight();
                //}
                while (robot.y != toY) robot.stepForward();
            }
            if (robot.y > toY) {  // ___________________________________________если по Оси Y роботу надо двигаться вниз
                //if (robot.direction != Direction.DOWN) {
                    while (robot.direction != Direction.DOWN) robot.turnLeft();
                //}
                while (robot.y != toY) robot.stepForward();
            }
            System.out.println("Я на месте по координатам  Х и Y!");
        }//=============================================================================================================
      /*
        Изначальное состояние робота:
        robot.getX() == 0, robot.getY() == 0;  -   начальное состояние робота

        Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();

        В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
robot.getDirection() == Direction.UP
        */
    }
    public static class Robot {//===================================CLASS_ROBOT=========================================
        int x;
        int y;
        Direction direction;

        public Direction getDirection() {    //   enum Direction
            return direction;
            // текущее направление взгляда
        }

        public int getX() {            // Метод getX (возвратный)
            return x;
            // текущая координата X
        }

        public int getY() {            // Метод getY (возвратный)
            return y;
            // текущая координата Y
        }

        public void turnLeft() {            // Метод turnLeft
            System.out.println("Поворот налево.");
            if (direction == Direction.LEFT) {
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.UP;
            } else if (direction == Direction.UP) {
                direction = Direction.LEFT;
            }
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {            // Метод turnLeft
            System.out.println("Поворот направо.");
            if (direction == Direction.LEFT){
                direction = Direction.UP;
            } else if (direction == Direction.UP){
                direction = Direction.RIGHT;
            } else if (direction == Direction.RIGHT){
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN){
                direction = Direction.LEFT;
            }
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {          // Метод turnLeft
            System.out.printf("Движение %s (%s, %s) ", direction.translate, x, y); // Движение UP: (3, 3)
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
            // ИТОГО:   Движение UP: (3, 3) -> (3, 3)
        }
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
    }//================================================================================================================
}//---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---___---
/* На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X
смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?)
В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо
или налево. Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):

public class Robot {

    public Direction getDirection() {
        // текущее направление взгляда
    }

    public int getX() {
        // текущая координата X
    }

    public int getY() {
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}

Пример
В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
robot.getDirection() == Direction.UP

Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();
Требования:
1. должен быть метод public static void moveRobot(Robot robot, int toX, int toY)
2. метод moveRobot должен переместить робота в позицию int toX, int toY
*/
