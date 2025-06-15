package Archive.FunctionalProgramming.KataEx.Ex2;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}