package Archive.FunctionalProgramming.Function;

// https://youtu.be/wUp2TLL4F6E?si=56g7uK1-On7JOkpZ&t=1908
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view
// ������ ���������� ToIntFunction. ������������ ����������� ������������� Function

import java.util.function.ToIntFunction;

public class MainToIntFun {

    public static void main(String[] args) {

        ToIntFunction<String> fun = a -> a.hashCode(); // �� ���� ��������� String, ���������� int

        System.out.println(fun.applyAsInt("Hello"));
    }
}
