package Archive.Exception;

import java.io.IOException;

// https://youtu.be/RXfurmtlANg?si=54Zw4wkQx2Q8gvbg https://youtu.be/_3K2Q4K08hQ?si=nHLKnwCFunabufkf
// Ctrl + N (найти, поиск)
// Ctrl + O (добавить конструктор)
// Alt + Ins (добавить конструктор)
// Ctrl + F12 (просмотреть методы класса, вложенные классы)
// Shift двойной - поиск
// Alt+7 - струтктура класса
// Ctrl+H - все наследники
/*
                        Throwable  (checked)
                      /                     \
                  Error (checked)    Exception (checked)
                / /  \ \              / /  \ \
 OutOfMemoryError           IOException      RuntimeException (unchecked)
                          (checked) |           |
                  FileNotFoundException      NullPointerException,
                                             IndexOutOfBoundsException,
                                             ArithmeticException,
                                             IllegalArgumentException

checked - должны описать реакцию на исключение (throws + throw, try\catch)
throws - пробрасываем исключсение, соглашаемс€, если оно по€витс€ то программа завершитс€ с ошибкой.
throws - игнорируем обработку исключени€ в данном методе

throw - используетс€, что бы выбросить исключение в нашей программе

unchecked - не заставл€ют нас давать реакцию на исключение. »х обработка на усмотрение программиста
нет смысла пробрасывать unchecked исключени€

Error - checked исключени€, на них надо об€зательно прореагировать - они не пробрасываютс€, их нельз€ отловить
но они €вл€ютс€ checked - т.к. если они по€вл€ютс€, то программа 100% завершитс€

Ћюба€ обратботка исключений требует ресурсов от нашей программы
*/
public class HELP {
    public static void main(String[] args) throws RuntimeException, IOException, OutOfMemoryError {
        System.out.println("ѕривет как дела");
        System.out.println("Hello, world");
    }
}
