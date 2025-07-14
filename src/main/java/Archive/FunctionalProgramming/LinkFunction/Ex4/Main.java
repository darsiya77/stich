package Archive.FunctionalProgramming.LinkFunction.Ex4;

//Использование ссылки на конструктор в случае массивов
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1150
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

public class Main {
    public static void main(String[] args) {
        Generator gen = int[]::new;
        Object a = gen.createNewObject(10);
        System.out.println(a.getClass());
    }
}
