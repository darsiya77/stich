package Archive.j101_interface.printer;

public class ConsolPrinter implements IPrinter{
    @Override
    public void print(final String text) {
        System.out.println(text);
    }
}
