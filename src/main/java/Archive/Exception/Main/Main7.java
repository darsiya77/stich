package Archive.Exception.Main;

public class Main7 {
    public static void main(String[] args) {
//        System.out.println(5/0);
        Main7 m = new Main7();
        try {
            m.testExp();
        } catch (MyNewException e) {
            e.getMessage();
        }
    }

    class MyNewException extends Exception {
        public MyNewException(String message) {
            System.out.println(message);
        }
    }

    public void testExp() throws MyNewException {
        throw new MyNewException("Ошибка!!");
    }
}
