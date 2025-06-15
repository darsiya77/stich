package Archive.Exception.Main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        try {
            System.out.println(a/b);
        }
        catch (Exception ex) {
            System.out.println("При делении произошла обшибка!");
        }
        System.out.println("Исключение обработано (try/catch) программа выполняется дальше!");
    }
}
// после работы с потоком необходимо его закрыть, что бы не расходовать ресурсы ПК - in.close();