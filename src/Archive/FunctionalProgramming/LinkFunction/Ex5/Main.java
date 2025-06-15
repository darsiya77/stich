package Archive.FunctionalProgramming.LinkFunction.Ex5;

//Особенности работы с обобщенными функциональными интерфейсами
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1355
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        Modifier<Integer> a = ng::add;
        Modifier<String> b = ng::add;

        System.out.println(a.change(1));
        System.out.println(b.change("1"));
    }
}
