package Archive.File;
//https://metanit.com/java/tutorial/6.6.php
//        На PrintStream похож другой класс PrintWriter.
//        Его можно использовать как для вывода информации на консоль, так и в файл или любой другой поток вывода.
//
//        PrintWriter(File file): автоматически добавляет информацию в указанный файл
//
//        PrintWriter(File file, String csn): автоматически добавляет информацию в указанный файл с учетом кодировки csn
//
//        PrintWriter(OutputStream out): для вывода информации используется существующий объект OutputStream, автоматически
//        сбрасывая в него данные
//
//        PrintWriter(OutputStream out, boolean autoFlush): для вывода информации используется существующий объект OutputStream,
//        второй параметр указывает, надо ли автоматически добавлять в OutputStream данные
//
//        PrintWriter(String fileName): автоматически добавляет информацию в файл по указанному имени
//
//        PrintWriter(String fileName, String csn): автоматически добавляет информацию в файл по указанному имени,
//        используя кодировку csn
//
//        PrintWriter(Writer out): для вывода информации используется существующий объект Writer, в который автоматически
//        идет запись данных
//
//        PrintWriter(Writer out, boolean autoFlush): для вывода информации используется существующий объект Writer,
//        второй параметр указывает, надо ли автоматически добавлять в Writer данные

//        Для записи данных в поток он также используется методы printf() и println().

import java.io.PrintWriter;

public class PrintWriterEx1 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(System.out)) {
            pw.println("Hello world!");
        }
    }
}
