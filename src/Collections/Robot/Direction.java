package Collections.Robot;

public enum Direction {

    UP("�����"),
    DOWN("����"),
    LEFT("������"),
    RIGHT("�������");
    final private String translate;
    Direction (String translate) {
        this.translate = translate;
    }
    public String getDirection() {
        return this.translate;
    }
}
