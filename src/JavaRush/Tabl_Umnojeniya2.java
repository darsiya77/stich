package JavaRush;

public class Tabl_Umnojeniya2 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= MULTIPLICATION_TABLE.length; i++){
            for (int j = 1; j <= MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}
