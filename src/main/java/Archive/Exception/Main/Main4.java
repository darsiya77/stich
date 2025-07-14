package Archive.Exception.Main;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        if (a > 50) {
            throw new Exception("Слишком большое число!");
        }
        System.out.println("Программа выполняется дальше!");
        System.out.println("Программа завершена!");
    }
}
// Пробрасываю исключение в сигн.метода - throws, затем выкидываю throw new Exception("Слишком большое число!")
// Программа выкидывает исключение и завершается - следующий код не выполняется