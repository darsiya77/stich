package Archive.FunctionalProgramming.LinkFunction.Ex1;

//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=497

public class SimpleGen {
    private int number;
    public SimpleGen(int number) {
        super();
        this.number = number;
    }
    public SimpleGen() {
        super();
    }

    public int getNumber() {  // метод возвращает значение типа int и параметров у него нет, как и метод в интерф. Generator.
        int temp = number;
        number = number + 1;
        return temp;
    }
    public static int getRandomNumber() { // возвращает значение типа int и параметров у него
        return (int) (Math.random() * 10);
    }
}

// ќбратите внимание, этот класс не реализует никакого интерфейса. » в нем нет
// методов с названием как в описанном выше интерфейсе.