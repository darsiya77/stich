package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public enum Direction {
    UP("�����"),
    DOWN("����"),
    LEFT("�����"),
    RIGHT("������");
    final String translate;
    Direction (String translate){

        this.translate = translate;
    }
    public String getTranslate() {

        return translate;
    }
}
