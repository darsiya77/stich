package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public enum Direction {
    UP("ббепу"),
    DOWN("бмхг"),
    LEFT("бкебн"),
    RIGHT("бопюбн");
    final String translate;
    Direction (String translate){

        this.translate = translate;
    }
    public String getTranslate() {

        return translate;
    }
}
