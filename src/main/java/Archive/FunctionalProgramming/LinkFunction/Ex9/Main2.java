package Archive.FunctionalProgramming.LinkFunction.Ex9;

//Использование метода в качестве параметра другого метода
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1902
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        String[] array = new String[]{"Hallo", "Java"};

        // ссылка на функциональный интерфейс как в Ex2

        changeStringArray(array, String::toUpperCase); // toUpperCase - метод класса String

        System.out.println(Arrays.toString(array));
    }
    // Метод, который на вход примет массив строк и любую функцию, которая сможет изменить строку, вернув строку:
    // С помощью этой любой функции я буду менять содержание каждого элемента этого массива.
    // В этом методе в параметрах 1 - будет ссылка на массив, который хочу поменять и 2 - ссылка типа функц.интерф
    public static void changeStringArray(String[] array, StringModificationFunction smf) {
        for (int i = 0; i < array.length; i++) {
            array[i] = smf.modification(array[i]);
        }
    }
}
