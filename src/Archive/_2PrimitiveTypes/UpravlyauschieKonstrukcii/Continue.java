package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii;

public class Continue {
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;// оператор continue досрочно завершает текущую итерацию (исполнение кода) и начинает следующую
            }
            System.out.println( x );
        }
    }
}
