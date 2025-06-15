package Archive.Uroki.KonsolVvodVivod;

public class VernutMenshee {

    public static void main(String[] args) {
        int minFromFour = getMinFromFour(8,1,3,2);
        System.out.println(minFromFour);
        System.out.println(Math.min(0,5));  // int min = Math.min(x,y);
    }
    public static int getMinFromFour(int x, int y, int m, int n){
        int firstPairaresult = getMinFromTwo(x,y);
        int secondPairaresult = getMinFromTwo(m,n);

        return getMinFromTwo(firstPairaresult,secondPairaresult);
    }

    public static int getMinFromTwo(int x, int y) {
        if (x < y) {
        return x;}
        else return y;
                                  // int min = Math.min(x,y); иначе можно использовать метод из библиотеки Math.min

    }

}
    /*Создайте метод public static int getMinFromTwo(int x, int y), который принимает два целочисленных параметра и
    возвращает наименьший из них. Создайте метод public static int getMinFromFour(int x, int y, int m, int n),
    который принимает четыре целочисленных параметра и возвращает наименьший из них. При том  второй метод должен
    использовать первый.*/