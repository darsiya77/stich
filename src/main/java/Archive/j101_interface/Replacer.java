package Archive.j101_interface;

import Archive.j101_interface.printer.ConsolPrinter;
import Archive.j101_interface.printer.IPrinter;
import Archive.j101_interface.readers.IReader;
import Archive.j101_interface.readers.PredefinderReader;

// ������, ��������������� �������� � ������� �� �����
public class Replacer {
    private final IReader reader;                              // ������� ����� ��������� ����� ������-��
    public final IPrinter printer;                             // ��� �� ����-�� ��������

    public Replacer(final IReader reader,
                    final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }
    public void replace() {                 // ����� ������ ����� �� ������ - � ������ ���� ����� read ������
        final String text = reader.read();
        final String replacedText = text.replace(":)", "=)");             // ������ ��������
        printer.print(replacedText);                                                     // �������� �� �����
    }

    public static void main(String[] args) {
        final IReader reader = new PredefinderReader("sdf:) ldfkpeo :) oertoi:)");
        final IPrinter printer = new ConsolPrinter();
        final Replacer replacer = new Replacer(reader, printer);
        replacer.replace();
        System.out.println("_____________");
    }
}
