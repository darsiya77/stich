package Archive.arabian1;

import java.util.Map;
import java.util.Scanner;

public class CalculatorArabian1 {
    public static void main(String[] args) {
        //2+3
        //V-VII
        Converter1 converter = new Converter1();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String exp = scn.nextLine();
        //Определяем арифметическое действие:
        int actionIndex=-1;
        for (int i = 0; i < actions.length; i++) {
            if(exp.contains(actions[i])){
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        if(actionIndex == -1){
            System.out.println("Некорректное выражение");
            return;
        }
        Map<Character, Integer> arabianMap = Converter1.romanKeyMap;
        //"2-4".split("-")-> {"2", "4"}
        String[] data = exp.split(regexActions[actionIndex]);
        //Определяем, находятся ли числа в одном формате (оба римские или оба арабские)
        if(converter.isRoman(data[0]) == converter.isRoman(data[1])){
            int a,b;

            //конвертируем арабские числа из строки в число
            a = arabianMap.get(data[0].charAt(0));
            b = arabianMap.get(data[1].charAt(0));

            //выполняем с числами арифметическое действие
            int result;
            switch (actions[actionIndex]){
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                default:
                    result = a/b;
                    break;
            }
            //если числа были арабские, возвращаем результат в арабском числе
            System.out.println(result);

        } else {
            System.out.println("Числа должны быть в одном формате");
        }


    }
}