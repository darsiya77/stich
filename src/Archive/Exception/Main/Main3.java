package Archive.Exception.Main;

public class Main3 {
    public static void main(String[] args) {
        int i = 80;
        try {
            if (i > 50) throw new Exception("Число i > 50");
        }
        catch (Exception ex) {
            //System.out.println("Случилась ошибка");
            ex.printStackTrace();
            System.out.println("Случилась ошибка");
        }
        System.out.println("Программа выполняется дальше!");
        int a = 100;
        System.out.println(a);
    }
}
// Сам генерирую исключение и обрабатываю его с пом. try/catch