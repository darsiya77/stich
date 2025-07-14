package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii;

import java.util.Arrays;

public class MassiviStrok {
    public static void main(String[] args) {
        String [] str = {"Mersedes", "Renault", "Ferrary", "Seat", "Skoda", "Ford"};
        System.out.println(Arrays.toString(str));
        System.out.println("________________________________________");

        for(String string : str){ // назначили string - счетчиком и передали в него массив str
            if (string.startsWith("S")) { // Здесь булевое значение - тру\фолз - а именно, элемент массива начинается с S
                System.out.println(string);
            }
        } // печатает элементы которые начинаются с "S"
        System.out.println("=============");
        for (String string : str){        // как и в прошлый раз объявили цикл, что бы он перебирал элементы массива
            if (string.startsWith("S")){  // если элемент массива начинается с S
                break;                    // то прерываем исполение кода  (можно также сделать с continue - тогда пропустит)
            }
            System.out.println(string);
        } // прерывает исполнение кода с элементы который начинаются с "S"
        System.out.println("==============");
        for (String string : str){
            if (string.endsWith("at") || string.startsWith("F")) {// если элемент массива заканч-ся на at или нач-ся на F
                System.out.println(string);
            }
        }  // печатает если элементы начинаются с "F" или заканчиваются на "at"
        String sText = "";
        for (String s: str){
            sText = sText + s + ", ";
        }
        System.out.println("\n"+sText+"\b\b");
    }
}
