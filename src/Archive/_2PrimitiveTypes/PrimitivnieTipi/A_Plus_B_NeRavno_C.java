package Archive._2PrimitiveTypes.PrimitivnieTipi;

public class A_Plus_B_NeRavno_C {
    public static void main(String[] args) {
        boolean bool = doubleExpression(0.1,0.1,0.2);
        System.out.println(bool);
        double a = 0.3333, b = 0.3333;




        double x = 0.1;
        System.out.println(a+b);
    }
    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs(a + b - c) < 0.0001;
    }

}

//  (a + b == c); (a + b - c)
//  "Модуль разности чисел меньше эпсилон" - ключ к решению
// return Math.abs(a + b - c) < 0.0001;
  /*  Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
        Допустимая погрешность – 0.0001 (1E-4)
        Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
        В качестве примера написано заведомо неправильное выражение. Исправьте его.

        Требования:
        Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)
______________________________________________________________________________
        public static boolean doubleExpression(double a, double b, double c) {
	return a + b == c;
}

        */