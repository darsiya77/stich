package Archive.Exception.Main;

public class Main8 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            System.out.println(5 / 0);
            arr[4] = 5;
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Отлов нескольких Exception через знак \"|\"" );
        }
    }
}
