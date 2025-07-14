package Archive.Generics;

// https://www.youtube.com/watch?v=ZUYxY-UJ3aI �� 8:50

public class Boxxx {
    public static void main(String[] args) {
        Box.getBox();
        Box.getBox().getBox2();
//      Box.getBox2(); // compile-time error - �� ������� �.�. ����� getBox2() - �� static

        Box<Integer> box = new Box<>();
        box.getBox2();
    }
//    � ������ Box �� ������� ������ ����� �������� ����������� ����� getBox(),
//    ������� ���������� ������ ����������������� ������ ���� Box
    public static class Box<T> {
        private T object;
        public static <T> Box<T> getBox() {
            return new Box<T>();

// <T> ����� ������������ ��������� ����� ������ ������ � static ������, ������ ������� static ����� ��� <T>
// ����� static
        }
        public Box<T> getBox2() { // � �� static ������ �� ����� ������� <T> ����� ������������ ����� Box<T>
            return new Box<>();
        }
    }
}
