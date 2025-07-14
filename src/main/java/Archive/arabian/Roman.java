package Archive.arabian;   // https://youtu.be/Nd0_Azbj-TQ

import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {
        Roman roman = new Roman();
        // I - 1
        // V - 5
        // X - 10
//        System.out.println(roman.romanToInt("V")); //5
        System.out.println(roman.romanToInt2("VI")); //6  - идем справа налево
        System.out.println(roman.romanToInt2("VII")); //7   -  если слева идет число больше чем справа, то числа + (скалад.)
        System.out.println(roman.romanToInt2("IX")); //9  если слева больше чем справа то вычитаем друг из друга
        System.out.println(roman.romanToInt2("IVX")); //14
        System.out.println(roman.romanToInt2("XXXIV")); //34
    }
    public int romanToInt2 (String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);  // ключ, значение
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int end = s.length()-1; // показывает номер последнего индекса. -1, т.к. индекс на 1 меньше длины (первый индекс - 0)
        char arr[] = s.toCharArray(); // переведет строку в массив символов
        int arabian;
        int result = map.get(arr[end]); // arr[end] - номер посл.индекса  (ему соответствукт символ из строки s)
        for (int i = end-1; i >=0; i--){  // начинаем с i = предпоследний индекс
            arabian = map.get(arr[i]);

            if(arabian<map.get(arr[i+1])){ // значение индекса < знач.инд.справа от него
                result -= arabian;
            }else {
                result += arabian;
            }

        }
        return result;
    }
}
