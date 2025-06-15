package Archive.File;

import java.io.*;

//https://metanit.com/java/tutorial/6.6.php
//Класс PrintStream - это именно тот класс, который используется для вывода на консоль.
//Для записи информации в поток вывода. Для этого PrintStream определяет ряд конструкторов:
//        PrintStream(OutputStream outputStream)
//        PrintStream(OutputStream outputStream, boolean autoFlushingOn)
//        PrintStream(OutputStream outputStream, boolean autoFlushingOn, String charSet) throws UnsupportedEncodingException
//        PrintStream(File outputFile) throws FileNotFoundException
//        PrintStream(File outputFile, String charSet) throws FileNotFoundException, UnsupportedEncodingException
//        PrintStream(String outputFileName) throws FileNotFoundException
//        PrintStream(String outputFileName, String charSet) throws FileNotFoundException, UnsupportedEncodingException

public class PrintStreamEx2 {
    public static void main(String[] args) throws FileNotFoundException {

//       PrintStream Заапись в ФАЙЛ:

        FileOutputStream fos = new FileOutputStream("notes3.txt");
        PrintStream printToFile = new PrintStream(fos);

        try (fos; printToFile) {
            printToFile.println("Привет мир!");
            System.out.println("Запись в файл \"notes3.txt\" произведена");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//        Кроме того, как и любой поток вывода и наследник класса OutputStream он имеет метод write:

        try (PrintStream printToFile2 = new PrintStream("notes3.txt")) {

            printToFile2.print("Hello World!");

            printToFile2.println("Welcome to Java!");

            printToFile2.printf("Name: %s Age: %d \n", "Tom", 34);

            printToFile2.write("PrintStream".getBytes());

            System.out.println("The file \"notes3.txt\" has been written\n");

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//        ВЫВОД в КОНСОЛЬ с помощью потока PrintStream

        try (PrintStream printToConsole = new PrintStream(System.out)) {

            printToConsole.print("printToConsole.print: Hello World!\n");

            printToConsole.println("printToConsole.println: Welcome to Java!");

            printToConsole.printf("printToConsole.printf: Name: %s Age: %d \n", "Tom", 34);

            printToConsole.write("printToConsole.write: PrintStream \n".getBytes());

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//        System.out.print("Hello World!");
//        System.out.println("Welcome to Java!");
//        System.out.printf("Name: %s Age: %d \n", "Tom", 34);
//        System.out.print("PrintStream");

    }
}
