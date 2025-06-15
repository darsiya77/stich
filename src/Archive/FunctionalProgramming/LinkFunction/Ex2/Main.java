package Archive.FunctionalProgramming.LinkFunction.Ex2;

//Использование ссылки на не статический метод любого объекта

//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=939
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

public class Main {
    public static void main(String[] args) {
        Generator gen1 = IntGenerator::next;
        IntGenerator a = new IntGenerator();
        System.out.println(gen1.getNextElement(a));
    }
}

/*    Для того что бы можно было использовать ссылку на метод произвольного
      объекта требуется обязательное условие!
      указанна ссылка, тип которой совместим с типом класса на метод которого создается
      ссылка.*/
