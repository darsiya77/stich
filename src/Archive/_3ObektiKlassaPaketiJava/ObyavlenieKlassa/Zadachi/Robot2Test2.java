package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public class Robot2Test2 {
    public static void main(String[] args) {
        Robot2 android = new Robot2();
        android.x = 7;
        android.y = -5;
        android.napravlenie = Napravlenie.VERCH;
        int X = -3, Y = 9;
        System.out.println("Исходные данные, положение робота - Направление: в" + android.napravlenie + ", \nПоложение на оси " +
                "координат: х, у -- " + "(" + android.x + ", " + android.y + ")");
        System.out.println("Вижу цель - иду к ней: (x = " + X + ", y = " + Y + ")");
        moveRobot (android,X,Y);
        System.out.println("Все удалось как нельзя лучше - требуемое положение робота " + " достигнуто");
    }
    public static void moveRobot(Robot2 robot, int toX, int toY){//================MOVE_ROBOT===========================
        if (robot.x != toX && robot.y != toY){
            if (robot.x < toX) {
                if (robot.napravlenie != Napravlenie.PRAVO){
                    while (robot.napravlenie != Napravlenie.PRAVO) robot.turnRight();
                }
                while (robot.x != toX) robot.stepForward();
            }
            if (robot.x > toX) {
                if (robot.napravlenie != Napravlenie.LEVO){
                    while (robot.napravlenie != Napravlenie.LEVO) robot.turnLeft();
                }
                while (robot.x != toX) robot.stepForward();
            }
            if (robot.y < toY) {
                if (robot.napravlenie != Napravlenie.VERCH){
                    while (robot.napravlenie != Napravlenie.VERCH) robot.turnRight();
                }
                while (robot.y != toY) robot.stepForward();
            }
            if (robot.y > toY) {
                if (robot.napravlenie != Napravlenie.NIZ){
                    while (robot.napravlenie != Napravlenie.NIZ) robot.turnLeft();
                }
                while (robot.y != toY) robot.stepForward();
            }
            System.out.println("Робот прибыл в заданные координаты");
        }
        else System.out.println("Робот прибыл в заданные координаты!");
       /* Пример
        В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
                robot.getDirection() == Direction.UP

        Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:*/
    }//=================================================================================================================
    public static class Robot2 {//===================================CLASS_ROBOT===============================================
        int x;
        int y;
        Napravlenie napravlenie;
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public Napravlenie getNapravlenie (){
            return napravlenie;
        }
        public void turnLeft(){  // повернуться на 90 градусов против часовой стрелки
            System.out.println("Поворот налево");
            if (napravlenie == Napravlenie.VERCH) {napravlenie = Napravlenie.LEVO;}
            else if(napravlenie == Napravlenie.LEVO) {napravlenie = Napravlenie.NIZ;}
            else if (napravlenie == Napravlenie.NIZ) {napravlenie = Napravlenie.PRAVO;}
            else if (napravlenie == Napravlenie.PRAVO) {napravlenie = Napravlenie.VERCH;}
        }
        public void turnRight(){  // повернуться на 90 градусов по часовой стрелке
            System.out.println("Поворот направо");
            if (napravlenie == Napravlenie.VERCH) {napravlenie = Napravlenie.PRAVO;}
            else if(napravlenie == Napravlenie.PRAVO) {napravlenie = Napravlenie.NIZ;}
            else if (napravlenie == Napravlenie.NIZ) {napravlenie = Napravlenie.LEVO;}
            else if (napravlenie == Napravlenie.LEVO) {napravlenie = Napravlenie.VERCH;}
        }
        public void stepForward(){
            System.out.print("Движение в " + napravlenie + ": (" + x + ", " + y + ") ");
            if (napravlenie == Napravlenie.VERCH) {y ++;}
            else if (napravlenie == Napravlenie.NIZ) {y --;}
            else if (napravlenie == Napravlenie.PRAVO) {x ++;}
            else if (napravlenie == Napravlenie.LEVO) {x --;}
            System.out.println("--> (" + x + ", " + y + ") ");// Изменение положения вверх: х,у (0, 0) --> (0, 0)
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }//=================================================================================================================
}
