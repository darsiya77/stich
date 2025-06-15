package Archive.FunctionalProgramming.LinkFunction.Ex2;

public class IntGenerator{

//    метод next() совпадает с методом getNextElement(IntGenerator gen) в интерфейсе Generator
//    хотя метод next() не принимает параметров на самом здесь первый параметр это ссылка на текущий объект this
//    public int next(){...} = public int next(IntGenerator this){...}
    public int next() {
        return 0;
    }
    public int next2(IntGenerator this) {
        return 0;
    }
}
