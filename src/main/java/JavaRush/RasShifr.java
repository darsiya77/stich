package JavaRush;

import java.util.Scanner;

public class RasShifr {
    public static char[]alfabet = new char[]{'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�',' '};

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        String input = inn.nextLine();
        int shift = alfabet.length;
        while (shift > 0){
            StringBuilder result = new StringBuilder();
            shift--;
            for(int i = 0; i < input.length(); i++){
                for (int j = 0; j < alfabet.length; j++){
                    if (input.charAt(i) == alfabet[j]) {
                        result.append(alfabet[(j + shift) % alfabet.length]);
                    }

                }
            }
            System.out.println(result);
        }
    }
}
