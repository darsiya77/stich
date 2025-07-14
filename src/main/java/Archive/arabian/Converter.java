package Archive.arabian;

import java.util.TreeMap;

public class Converter { // создаю класс конвертер и объявляю в нем Мапу (Чар, Инт)======================================
    TreeMap<Character, Integer> romanKeyMap = new TreeMap<>();
    TreeMap<Integer, String> arabianKeyMap = new TreeMap<>();

    public Converter() { //------------------------Конструктор--класса---------------------------------------------------
        romanKeyMap.put('I', 1);
        romanKeyMap.put('V', 5);
        romanKeyMap.put('X', 10);
        romanKeyMap.put('L', 50);
        romanKeyMap.put('C', 100);
       /* romanKeyMap.put('D',500);
        romanKeyMap.put('M',1000);

        arabianKeyMap.put(1000, "M");
        arabianKeyMap.put(900, "CM");
        arabianKeyMap.put(500, "D");
        arabianKeyMap.put(400, "CD");*/
        arabianKeyMap.put(100, "C");
        arabianKeyMap.put(90, "XC");
        arabianKeyMap.put(50, "L");
        arabianKeyMap.put(40, "XL");
        arabianKeyMap.put(10, "X");
        arabianKeyMap.put(9, "IX");
        arabianKeyMap.put(5, "V");
        arabianKeyMap.put(4, "IV");
        arabianKeyMap.put(1, "I");
    } //----------------------------------------------------------------------------------------------------------------

    public boolean isRoman(String number) { // containsKey - проверяет есть ли ключ в мапе
        return romanKeyMap.containsKey(number.charAt(0)); // charAt(0) - вызывает 1-й символ из строки
    }

    public String intToRoman(int number) {//_______----------------_____________----------_____________------------_____
        String roman = "";
        int arabianKey;
        do {
            arabianKey = arabianKeyMap.floorKey(number); // 'floorKey' среди всех ключей по мапе ищет близкое снизу
            roman += arabianKeyMap.get(arabianKey);
            number -= arabianKey;
        } while (number != 0);
        return roman;
    }//_______----------------_____________----------_____________------------_____________------------_________--------

    public int romanToInt(String s) {
        int end = s.length() - 1; // показывает номер последнего индекса. -1, т.к. индекс на 1 меньше длины (первый индекс - 0)
        char arr[] = s.toCharArray(); // переведет строку в массив символов
        int arabian;
        int result = romanKeyMap.get(arr[end]); // arr[end] - номер посл.индекса  (ему соответствукт символ из строки s)
        for (int i = end - 1; i >= 0; i--) {  // начинаем с i = предпоследний индекс
            arabian = romanKeyMap.get(arr[i]);

            if (arabian < romanKeyMap.get(arr[i + 1])) { // значение индекса < знач.инд.справа от него
                result -= arabian;
            } else {
                result += arabian;
            }

        }
        return result;
    }
}