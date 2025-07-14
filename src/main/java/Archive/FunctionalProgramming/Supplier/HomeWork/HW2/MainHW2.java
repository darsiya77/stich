package Archive.FunctionalProgramming.Supplier.HomeWork.HW2;

// https://youtu.be/cl12wAVFPrU?si=VoQaDPn_0GbPn0wJ
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// метод T get()

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainHW2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "world", "Java");
        Predicate<String> startsWithUpperCase = s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0));

        Supplier<String> supplier = MainHW2.filteredSupplier(list, startsWithUpperCase);

        System.out.println(supplier.get()); // "Hello"
        System.out.println(supplier.get()); // "Java"
        System.out.println(supplier.get()); // null
        System.out.println(supplier.get()); // null
        System.out.println(supplier.get()); // null
    }

    public static Supplier<String> filteredSupplier(List<String> list, Predicate<String> predicate) {
        // Создаем итератор для исходного списка
        final Iterator<String> iterator = list.iterator();

        return () -> {
            String result = null;

            // Перебираем элементы, пока не найдем подходящий или не закончим список
            while (iterator.hasNext()) {
                String current = iterator.next();
                if (predicate.test(current)) {
                    result = current;
                    break;
                }
            }

            return result;
        };
    }
}

/*
2)
        Реализуйте Supplier<String> с помощью Predicate<String> реализующий следующий функционал:
        возвращать из List<String> только строки соответствующие реализации Predicate. Например если
        у вас есть список [«Hello», «world», «Java»], а Predicate возвращает true только если слово
        начинается с большой буквы, ваша реализация Supplier должна последовательно вернуть
        «Hello», «Java» и после чего возвращать null (закончились подходящие значения).


Объяснение решения:
        1. filteredSupplier метод:
        - Получает список и предикат.
        - Создает итератор для списка.
        - Возвращает анонимный Supplier, который при каждом вызове get() перебирает элементы до тех пор, пока не найдет
          элемент удовлетворяющий предикату.

        2. Итератор:
        - Используется для последовательного прохода по списку. Каждый вызов supplier.get() перемещает итератор вперед,
          пропуская неподходящие элементы.

        3. Предикат:
        - Проверяет элементы списка на соответствие критерию (например, начальная заглавная буква).

          Такой подход сохраняет состояние через итератор и обеспечивает последовательный доступ к элементам. Каждая
          итерация get() продолжает поиск с текущей позиции, что обеспечивает требуемое поведение.

 */