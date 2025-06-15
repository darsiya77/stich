package Archive.j101_interface.readers;

public class PredefinderReader implements IReader {
    private final String str;

    public PredefinderReader(String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
        //return "sdf:) ldfkpeo :) oertoi:)";
    }
}
