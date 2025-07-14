package Archive.FunctionalProgramming.Lyambda.Ex8;

// �������� ������-��������� � �������� ����������

public class Main {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "������-��������� �������� ������������� Java" ;
        String outStr;
        System.out.println( "��o �������� ������: " + inStr);

        outStr = stringOp( (str) -> str. toUpperCase( ) , inStr) ;
        System.out.println( "��o ������ ���������� �������: " + outStr) ;
    }
}
