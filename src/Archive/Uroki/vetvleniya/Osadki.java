package Archive.Uroki.vetvleniya;

public class Osadki {
    public static long determineRainfall(double area, double rainfallAmount) {
        double count = area * rainfallAmount*2000000;
        long x= (long) count;
        return x;
        //Твой код здесь
    }

    public static void main(String[] args) {
        long y=determineRainfall(0.11,0.33);
        System.out.println(y);
    }
}
/*Известно, что 1 мм осадков - это один литр воды, вылитый на квадратный метр за 12 часов. Напишите метод
static long determineRainfall(double area, double rainfallAmount), который будет принимать площадь в
квадратных километрах и осадки в мм и возвращать количество выпавших осадков за сутки на этой площади.
Требования:
1. Метод должен иметь модификаторы public static
2. Метод должен принимать в качестве параметров два числа с плавающей точкой
3. Метод должен возвращать число типа long
4. Метод не должен ничего выводить в консоль

        Пример ввода параметров: 8 км2, 12 мм
        Пример возвращаемого значения: 192_000_000 л за 24 ч.
        возвращает 8*12

        12мм =
        1мм=1м2*1л
        */
