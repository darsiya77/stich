package Other;

public class Radius {
public static void calcCircleRadius(double area) {
    System.out.printf("%.3f", Math.sqrt(area / Math.PI));
    // printf - метод форматирования вывода
    // %.3f - "%" - вывести первый аргумент, который указан далее, ".3" - 3 знака после запятой "f" - вещественное число
}

// aria = Pi r2, R = корень из (aria/pi)
public static void main(String[] args) {
    calcCircleRadius(123);
}
}
// 1. Выделяем код в IDEA и жмём  Ctrl + Alt + L
//2. Нажимаем Shift + Tab
//3. Копируем и вставляем на сайт