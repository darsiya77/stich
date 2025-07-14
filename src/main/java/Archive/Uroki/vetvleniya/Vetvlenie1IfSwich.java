package Archive.Uroki.vetvleniya;

public class Vetvlenie1IfSwich {
    static boolean bool=false;
    static int a=1;

    public static void main(String[] args) {
        switch (a){   // оператор switch позволяет сравнивать и в зависимости от того,
                      // какое значение передали он выбирает какое из действий выполнить
            case 5:
                System.out.println("5");
                break;// ставим оператор break что бы остановить программу
            case 6:
                System.out.println(6);
                break;
            case 1:
                System.out.println(1);
                break;
        }
    }
}
