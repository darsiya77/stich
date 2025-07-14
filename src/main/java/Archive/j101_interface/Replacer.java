package Archive.j101_interface;

import Archive.j101_interface.printer.ConsolPrinter;
import Archive.j101_interface.printer.IPrinter;
import Archive.j101_interface.readers.IReader;
import Archive.j101_interface.readers.PredefinderReader;

// „итает, преобразовывает смайлики и выводит на экран
public class Replacer {
    private final IReader reader;                              // который будет считывать текст откуда-то
    public final IPrinter printer;                             // что бы куда-то выводить

    public Replacer(final IReader reader,
                    final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }
    public void replace() {                 // будет читать текст из ридера - у ридера есть метод read —трока
        final String text = reader.read();
        final String replacedText = text.replace(":)", "=)");             // мен€ем смайлики
        printer.print(replacedText);                                                     // передаем на вывод
    }

    public static void main(String[] args) {
        final IReader reader = new PredefinderReader("sdf:) ldfkpeo :) oertoi:)");
        final IPrinter printer = new ConsolPrinter();
        final Replacer replacer = new Replacer(reader, printer);
        replacer.replace();
        System.out.println("_____________");
    }
}
