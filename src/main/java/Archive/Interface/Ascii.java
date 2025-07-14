package Archive.Interface;

import java.util.Arrays;

public class Ascii {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
        System.out.println("_________________________");
        String t = "text";
        System.out.println(t.length());
        System.out.println(example[0]);
    }
    public static class AsciiCharSequence implements CharSequence  {
        private byte[] byteSequence;

        AsciiCharSequence (byte[] byteArray) {
            this.byteSequence = byteArray;
        }

        @Override
        public int length() {
            return this.byteSequence.length;
        }

        @Override
        public char charAt(int index) {
            return (char) byteSequence[index];
        }

        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(this.byteSequence, start, end));

        }
        @Override
        public String toString() {
            String result = new String();
            for(int i = 0; i < this.length(); i++) {
                result += charAt(i);
            }
            return result;
        }
    }
}
/*
    Напишите статический класс AsciiCharSequence, реализующий компактное хранение последовательности
    ASCII-символов (их коды влезают в один байт) в массиве байт. По сравнению с классом String из
    Java 8, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти
        Класс AsciiCharSequence должен:

        реализовывать интерфейс java.lang.CharSequence;//+

        иметь конструктор, принимающий массив байт;//+

        определять методы length(), charAt(), subSequence() и toString()

        Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса
        java.lang.CharSequence
        (JavaDoc или исходники). В данном задании методам charAt() и subSequence() всегда будут
        подаваться
        корректные входные параметры, поэтому их проверкой и обработкой ошибок заниматься не нужно.
        Тем более мы еще не проходили исключения.*/
