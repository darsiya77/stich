package JavaRush;

import java.util.Arrays;

public class Massiv3merniy2 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (var array : multiArray) {
            System.out.println(Arrays.deepToString(array));
        }
    }
}
