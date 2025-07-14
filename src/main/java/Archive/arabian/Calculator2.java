package Archive.arabian;

import java.util.Scanner;

public class Calculator2 {

    public  static int romanCharVal(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'x': return 10;
        }
        return -1;
    }

    public  static int romanToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 &&
                    romanCharVal(s.charAt(i)) < romanCharVal(s.charAt(i + 1))) {
                val -= romanCharVal(s.charAt(i));
            } else val += romanCharVal(s.charAt(i));
        }
        return val;
    }

    public static String intToRoman(int val) {
        String str = "";
        String[] c1 = {"", "i", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] c2 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] c3 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        if (val <= 0 || val >= 1000) return null;
        int i = val % 10;
        str = c3[(val / 100) % 10] + c2[(val / 10) % 10] + c1[val % 10];
        return str;
    }

    public static void main(String[] agrs) throws Exception{

        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        int pos = 0, pos2 = 0;
        boolean is_roman = false;
        int X = 0, Y = 0, res = 0;
        char op = ' ';

        while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
        if (pos == expr.length()) {
            throw new Exception("Пустая строка не допустима");
        }

        if ('0' <= expr.charAt(pos) && expr.charAt(pos) <= '9') {
            pos2 = pos;

            while (expr.length() > pos2 && '0' <= expr.charAt(pos2) && expr.charAt(pos2) <= '9') pos2++;
            if (pos2 == expr.length()) {
                throw new Exception("Отсутствует операция и второе число");
            }
            String strX = expr.substring(pos, pos2);
            X = Integer.parseInt(strX);
            if (X < 1 || X > 10) {
                throw new Exception("первый аргумент должен быть от 1 до 10");
            }
            pos = pos2;
            while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
            if (expr.length() == pos) {
                throw new Exception("Отстуствует операция и второй аргумент");
            }
            op = expr.charAt(pos);
            if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                throw new Exception("Некорректный символ");
            }

            pos++;
            while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
            if (expr.length() == pos) {
                throw new Exception("Отстуствует второй аргумент");
            }
            if (expr.charAt(pos) == 'I' || expr.charAt(pos) == 'V' || expr.charAt(pos) == 'X') {
                throw new Exception("Нельзя мешать арабские и римские");
            }
            if (!('0' <= expr.charAt(pos) && expr.charAt(pos) <= '9')) {
                throw new Exception("Второй аргумент должен быть арабским");
            }
            pos2 = pos;
            while (expr.length() > pos2 && '0' <= expr.charAt(pos2) && expr.charAt(pos2) <= '9') pos2++;
            String strY = expr.substring(pos, pos2);
            Y = Integer.parseInt(strY);
            if (Y < 1 || Y > 10) {
                throw new Exception("Второй аргумент должен быть от 1 до 10");
            }
            pos = pos2;
            while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
            if (pos != expr.length()) {
                throw new Exception("недопустимые символы после второго числа");
            }


        } else if (expr.charAt(pos) == 'I' || expr.charAt(pos) == 'V' || expr.charAt(pos) == 'X') {
            is_roman = true;
            pos2 = pos;
            while (expr.length() > pos2 && (expr.charAt(pos2) == 'I' || expr.charAt(pos2) == 'V' || expr.charAt(pos2) == 'X'))
                pos2++;
            if (pos2 == expr.length()) {
                throw new Exception("Отсутствует операция и второе число");
            }

            X = romanToInt(expr.substring(pos, pos2));
            if (X < 1 || X > 10) {
                throw new Exception("первый аргумент должен быть от 1 до 10");
            }
            pos = pos2;
            while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
            if (expr.length() == pos) {
                throw new Exception("Отстуствует  второй аргумент");
            }
            op = expr.charAt(pos);
            if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                throw new Exception("Некорректный символ");
            }
            pos++;
            while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
            if (pos == expr.length()) {
                throw new Exception("Отсутствует второе число");
            }
            pos2 = pos;
            if (expr.length() == pos) {
                throw new Exception("Отстуствует  второй аргумент");
            }
            if (expr.charAt(pos2) >= '0' && expr.charAt(pos2) <= '9') {
                throw new Exception("Нельзя мешать римские и арабские числа");
            }
            while (expr.length() > pos2 && (expr.charAt(pos2) == 'I' || expr.charAt(pos2) == 'V' || expr.charAt(pos2) == 'X'))
                pos2++;
            Y = romanToInt(expr.substring(pos, pos2));
            if (Y < 1 || Y > 10) {
                throw new Exception("второй аргумент должен быть от I до X");
            }
            pos = pos2;
            while (expr.length() > pos && expr.charAt(pos) == ' ') pos++;
            if (pos != expr.length()) {
                throw new Exception("недопустимые символы после второго числа");
            }

        } else {

        }
        switch (op) {
            case '+':
                res = X + Y;
                break;
            case '-':
                res = X - Y;
                break;
            case '*':
                res = X * Y;
                break;
            case '/':
                res = X / Y;
                break;
            default:
        }
        if (is_roman) {
            if (res > 0) {
                System.out.println(intToRoman(res));
            } else {
                throw new Exception("Для римских чисел ответ должен быть положительным");
            }

        } else {
            System.out.println(res);
        }
    }
}