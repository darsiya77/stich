package Archive.j101_aclass;

public abstract class AbstactSmileProcessor {
    public void process() {
        final String text = this.readString();
        final String result = text.replace(":)", "=)");
        System.out.println(result);
    }
    public abstract String readString();
}
