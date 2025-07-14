package Archive.Generics;

// https://www.youtube.com/watch?v=ZUYxY-UJ3aI на 8:50

public class Boxxx {
    public static void main(String[] args) {
        Box.getBox();
        Box.getBox().getBox2();
//      Box.getBox2(); // compile-time error - не удастся т.к. метод getBox2() - не static

        Box<Integer> box = new Box<>();
        box.getBox2();
    }
//    В классе Box из прошлой задачи нужно добавить статический метод getBox(),
//    который возвращает пустой параметризованный объект типа Box
    public static class Box<T> {
        private T object;
        public static <T> Box<T> getBox() {
            return new Box<T>();

// <T> перед возвращаемым значением нужно писать именно в static методе, нельзя создать static метод без <T>
// после static
        }
        public Box<T> getBox2() { // В не static методе не нужно ставить <T> перед возвращаемым типом Box<T>
            return new Box<>();
        }
    }
}
