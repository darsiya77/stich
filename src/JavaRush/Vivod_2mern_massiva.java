package JavaRush;

public class Vivod_2mern_massiva {
    public static void main(String[] args) {
        int[][] months = {{31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}};
        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.print(months[i][j] + " ");
            }
            System.out.println();
        }
    }

}

