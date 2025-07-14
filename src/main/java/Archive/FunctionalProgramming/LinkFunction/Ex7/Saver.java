package Archive.FunctionalProgramming.LinkFunction.Ex7;

import java.io.IOException;

@FunctionalInterface
public interface Saver<T> {
    public void saveTo(T element) throws IOException;
}