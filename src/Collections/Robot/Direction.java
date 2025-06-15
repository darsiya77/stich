package Collections.Robot;

public enum Direction {

    UP("ббепу"),
    DOWN("бмхг"),
    LEFT("мюкебн"),
    RIGHT("мюопюбн");
    final private String translate;
    Direction (String translate) {
        this.translate = translate;
    }
    public String getDirection() {
        return this.translate;
    }
}
