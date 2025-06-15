package Archive.FunctionalProgramming.LinkFunction.Ex6;

//Автовыведение типа для функционального интерфейса
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=1449
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();
        IntElementGenerator ieg = gen::nextElement;
//        IntElementGenerator ieg = gen::<Integer>nextElement; //- можно явно указать тип в обобщ. методе, но не обяхательно
    }
}
