package JavaRush;

public class Massiv3merniy {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++){
            for (int j =0 ; j < multiArray [i].length; j++){
                for (int n = 0; n < multiArray[i][j].length; n++){
                    System.out.print(multiArray[i][j][n] + " ");
                }
                System.out.println();
            }
            System.out.println("------------------------------");
        }
    }
}
/*
    В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.

        Требования:
        •	В классе Solution должна быть публичная статическая переменная multiArray типа int[][][].
        •	В методе main(String[]) выведи на экран все числа из multiArray.*/
