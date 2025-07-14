package Archive._2PrimitiveTypes.PrimitivnieTipi;

public class A_Plus_B_NeRavno_C2 {
    public static void main(String[] args)  {

        final double threshold = 0.0001;

        //прибавляем к нулю 0.1 одиннадцать раз подряд
        double f1 = .0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }

        //Умножаем 0.1 на 11
        double f2 = .1 * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (Math.abs(f1 - f2) < threshold)
            System.out.println("f1 и f2 равны");
        else
            System.out.println("f1 и f2 ne не равны");
        System.out.println("__________________");
        double x = .0;
        double y = .1;
        System.out.println(x);
        System.out.println(y);
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