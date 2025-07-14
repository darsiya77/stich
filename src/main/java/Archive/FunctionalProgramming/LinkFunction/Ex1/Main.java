package Archive.FunctionalProgramming.LinkFunction.Ex1;

// Использование ссылки на не статический/статический метод
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=497
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

public class Main {
 /*   Для того, что бы можно было использовать ссылку на метод в качестве реализации
    функционального интерфейса достаточно, что бы совпадали тип возвращаемого значения
    и список параметров.
    Совпадение имен методов не обязательно! Класс в котором описан метод не
    обязательно должен реализовать функциональный интерфейс!*/

    public static void main(String[] args) {
//      создаем экземпляр класса SimpleGen:
        SimpleGen sg = new SimpleGen(5);

//      ссылка на метод в качестве реализации функционального интерфейса:
//      для нестатического метода класса SimpleGen мы создаем ссылку на объект

//      создаем экземпляр интерфейса Generator и присваиваем ему ссылку:
        Generator gen1 = sg::getNumber;

//      теперь у нас есть экземпляр интерфейса Generator = gen1

        int temp = gen1.getNextElement();

        System.out.println(temp);    // 5

//___________________________________ ССЫЛКА НА СТАТИЧЕСКИЙ МЕТОД: ________________________________________________

//      для статического метода класса SimpleGen мы используем имя класса:

        gen1 = SimpleGen::getRandomNumber;

        temp = gen1.getNextElement();

        System.out.println(temp);

    }
}
