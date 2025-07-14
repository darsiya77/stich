package Archive.FunctionalProgramming.LinkFunction.Ex8;

//Использование ссылок на методы может сократить объемы кода
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1727
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {"Anna", "Ira", "Alexandr", "Katia"};

//        Comparator<String> cm = Main::compareStringLength;

        Arrays.sort(names, Main::compareStringLength);

        System.out.println(Arrays.toString(names));
    }
    // этот метод совпадает по типу возвращаемого значения и списку параметров с Компаратором:
    public static int compareStringLength(String a, String b) {
        return a.length() - b.length();
    }
}
// не нудно создавать много временных (анонимных) классов
// Есть массив строк - задача отсортировать имена в массиве по длине
// Для этого нужно создать анонимный класс, который реализует интерфейс компаратор
// Но так как Компаратор - функцирнальный интерфейс, то его можно реализовать с помощью ссылки на метод
