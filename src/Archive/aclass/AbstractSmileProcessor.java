package Archive.aclass;

public abstract class AbstractSmileProcessor {
    public void process () {   // Метод process использует абстрактный метод readString (кот. неизвестно как реализован)
        final String text = this.readString();
        final  String result = text.replace(":)","=)");
        System.out.println(result);
    }
    protected abstract String readString(); // этот метод реальзует другая команда в другом классе

}
