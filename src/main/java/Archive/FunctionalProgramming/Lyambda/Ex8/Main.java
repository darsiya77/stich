package Archive.FunctionalProgramming.Lyambda.Ex8;

// Передача лямбда-выражений в качестве аргументов

public class Main {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java" ;
        String outStr;
        System.out.println( "Этo исходная строка: " + inStr);

        outStr = stringOp( (str) -> str. toUpperCase( ) , inStr) ;
        System.out.println( "Этo строка прописными буквами: " + outStr) ;
    }
}
