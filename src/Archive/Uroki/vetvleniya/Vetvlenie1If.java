package Archive.Uroki.vetvleniya;

public class Vetvlenie1If {
    static boolean bool=false;
    static int a=-1;

    public static void main(String[] args) {
        if (a==3) {   // оператор if позволяет рассматривать какие-л булевские, логические равенства
            System.out.println("a=3");
        }else if (a<3) {
            System.out.println("a<3");
        }else if (a>3) {
            System.out.println("a>3");
        }
    }
}
