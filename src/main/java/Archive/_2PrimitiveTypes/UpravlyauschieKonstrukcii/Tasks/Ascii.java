package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii.Tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ascii {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
        System.out.println("_______________");
        char ch = 101;
        System.out.println("char ch = 101 - вывод на печать ch = " + ch);
        String str = "Hello";
        byte[] byteArr = str.getBytes();
        System.out.println("byte[] byteArr = str.getBytes() = " + Arrays.toString(str.getBytes()));
        char[]charArr2 = new char[byteArr.length];
        String sChar;
        StringBuilder sbChar = new StringBuilder();
//        for (int i = 0; i < byteArr.length; i++) {
//            sbChar = sbChar.append((char) byteArr[i]);
//        }
        for (byte b : byteArr) {
            sbChar.append((char) b);
        }
        for (int i = 0; i < byteArr.length; i++) {
            charArr2[i] = (char) byteArr[i];
        }
        System.out.println("____________");





//        String charS = charArr2;

        char[] chArr =  str.toCharArray();
        System.out.println("String str = " + str);
        System.out.println("str.toCharArray() = " + chArr); // печатает массив символов но без спец.вывода это будет адрес ссылки массива
        System.out.println("Arrays.toString(str.toCharArray()) = " + Arrays.toString(chArr));// [H, e, l, l, o]
        System.out.println("byte[] byteArr = str.getBytes() = " + Arrays.toString(byteArr)); // [72, 101, 108, 108, 111]
        System.out.println("Arrays.toString(charArr2) = " + Arrays.toString(charArr2));
        System.out.println((char) byteArr[0] + (char) byteArr[1] + (char) byteArr[2]);
        System.out.println("sbChar = " + sbChar);
        System.out.println("___________");
        System.out.println(new String(new byte[] {72, 101, 108, 108, 111, 33}));
        System.out.println(new String(new char[] {72, 101, 108, 108, 111, 33}));
        System.out.println(new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'}));
    }
    public static class AsciiCharSequence implements CharSequence{
        byte[] array;

        public AsciiCharSequence(byte[] array) {
            this.array = array;
        }

        @Override
        public int length() {
            return this.array.length;
        }

        @Override
        public char charAt(int index) {
            return (char) array[index];
        }

        @Override
        public String toString() {
//            StringBuilder sbChar = new StringBuilder();
//            for (byte b : this.array) {
//                sbChar.append((char) b);
//            }
//            return sbChar.toString();
            return new String(array);
        }

//        public String toString() {
//            String result = new String();
//            int len = this.length();
//            for (int i = 0; i < len; i++) {
//                result += charAt(i);
//            }
//            return result;
//        }

        @Override
        public CharSequence subSequence(int start, int end) {
//            byte[] newArray = new byte[end - start];
//            for (int i = start, j = 0; j < newArray.length; i++, j++) {
//                newArray[j] = array[i];
//            }
            return new AsciiCharSequence(Arrays.copyOfRange(this.array, start, end));

        }
        //Твой код здесь
    }
}
