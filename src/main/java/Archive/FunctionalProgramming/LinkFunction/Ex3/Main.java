package Archive.FunctionalProgramming.LinkFunction.Ex3;

//Использование ссылки на конструктор
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1054
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //  ссылка на конструктор используется через имя класса:
        Generator gen = ArrayList::new; // new - ключ. слово для получения ссылки на конструктор
        Object a = gen.createNewObject();
        System.out.println(a.getClass());
    }
}
