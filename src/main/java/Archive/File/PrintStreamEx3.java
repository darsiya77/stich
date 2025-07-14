package Archive.File;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintStreamEx3 {
    public static void main(String[] args) {

        System.out.println("Hello"); // Вывод строки на консоль

// Сохранили поток вывода на консоль в отдельную переменную. Выводим в поток строку.

        PrintStream console = System.out;
        console.println("Hello");

//        Создали динамический (растягивающийся) массив байт в памяти.
//        Связали его с новым потоком вывода – объектов PrintStream
//        Выводим в поток строку.

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console2 = new PrintStream(stream);
        console2.println("Hello");
        System.out.println(stream);
    }
}
