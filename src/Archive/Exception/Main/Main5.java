package Archive.Exception.Main;

// https://youtu.be/grgzoGXkIG4?si=hkGfH3LKiYhOhxZx&t=332

public class Main5 {
    public static void main(String[] args) {
        try {
            NumCheck.printResult(8);
        } catch (Exception ex) {
//            ex.printStackTrace();
        }
        System.out.println("Программа отработала нормально");
        //throw new NumCheckExeption("Большое число");
    }
}
    class NumCheck {
        public static void printResult (int a) throws NumCheckExeption {
            if (a <= 5 && a >= 1) {
                System.out.println("Запись успешно добавлена!");
            }
            else
                throw new NumCheckExeption(a);
        }
    }
    class NumCheckExeption extends Exception {
        public NumCheckExeption(int a) {
            System.out.println("Введенное число " + a +  " вышло за пределы");
        }
//        public NumCheckExeption(String discription) {
//            super(discription);
//        }
    }
    // 16 - Создал класс и в нем стат. метод, кот. выбрасывает исключение при условии.
    // 25 - Создал свой класс-исключение в нем 2 конструктора