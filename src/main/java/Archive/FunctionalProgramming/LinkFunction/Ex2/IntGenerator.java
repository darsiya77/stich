package Archive.FunctionalProgramming.LinkFunction.Ex2;

public class IntGenerator{

//    ����� next() ��������� � ������� getNextElement(IntGenerator gen) � ���������� Generator
//    ���� ����� next() �� ��������� ���������� �� ����� ����� ������ �������� ��� ������ �� ������� ������ this
//    public int next(){...} = public int next(IntGenerator this){...}
    public int next() {
        return 0;
    }
    public int next2(IntGenerator this) {
        return 0;
    }
}
