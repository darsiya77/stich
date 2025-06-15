package Archive.aclass;

public class FileSmileProcessor extends AbstractSmileProcessor {
    @Override
    protected String readString() {
        return "text from :) file:) :)";
    }

    public static void main(String[] args) {
        final FileSmileProcessor filesmilrprocessor = new FileSmileProcessor();
        filesmilrprocessor.process();
    }

}
