package JavaRush;

import java.util.Scanner;

public class Shifr {
    public static char[]alfabet = new char[]{'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�',' '};

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        String input = inn.nextLine();
        StringBuilder result = new StringBuilder();
        int x = alfabet.length;
        int shift = 1;
        for (int i = 0; i < input.length(); i++){
            for (int j = 0; j < x; j++){
                if (input.charAt(i) == alfabet[j]) {
                    result.append(alfabet[(j+shift)%x]);
                    System.out.printf("Find symbol %s(%s), rec: %s(%s)\n", alfabet[j], j, alfabet[(j+shift)%x], (j+shift)%x);
                }
            }
        }
        System.out.println(result);

    }
}

