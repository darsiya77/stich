package Archive.File.Main;

//https://youtu.be/4MFcmreAUhs?si=ZzFmXhVNHadRuENf

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String str = "Ы";
        str.getBytes();
        System.out.println("Ы".getBytes(StandardCharsets.UTF_8)[0] + " - 1 индекс массива в кодировке UTF_8 (1 из 2-х байт) бзе сдвига");
        System.out.println("Ы".getBytes(StandardCharsets.UTF_8)[1] + " - 2 индекс массива в кодировке UTF_8 (2 из 2-х байт) бзе сдвига");
        System.out.println("---------------------");
        System.out.println(Arrays.toString("Ы".getBytes()) + " - \"Ы\" в виде переменной \"byte\" в кот. 8 бит и в двоичном коде в этих 8 битах зашыто это число");
        System.out.println(Arrays.toString("Ы".getBytes(StandardCharsets.UTF_8)) + " в кодировке UTF_8 \"Ы\" (каждый символ кириллицы закодирован двумя байтами) - массив из 2-х байт");
        System.out.println("---------------------");
        System.out.print("Ы".getBytes(StandardCharsets.UTF_8)[0] & 0xFF); // выводим 1-й инд. массива со сдвигом
        System.out.println(" - 1 индекс массива в кодировке UTF_8 (1 из 2-х байт) со сдвигом");
        System.out.print("Ы".getBytes(StandardCharsets.UTF_8)[1] & 0xFF); // выводим 2-й инд. массива со сдвигом
        System.out.println(" - 2 индекс массива в кодировке UTF_8 (2 из 2-х байт) со сдвигом");
    }
}
