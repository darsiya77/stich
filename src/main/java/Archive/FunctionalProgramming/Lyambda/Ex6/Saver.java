package Archive.FunctionalProgramming.Lyambda.Ex6;

import java.io.IOException;

@FunctionalInterface
public interface Saver {
    public void save(Object obj) throws IOException;
}
