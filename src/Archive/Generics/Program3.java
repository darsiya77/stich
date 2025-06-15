package Archive.Generics;

//https://www.youtube.com/watch?v=2Sbg8tJAQ2I

public class Program3 {

    public static void main(String[] args) {

        DepositAccount <Integer, String> dAccount1 = new DepositAccount<>(20, "Tom");

        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());

        DepositAccount <String, Integer> dAccount2 = new DepositAccount<>("12345", 23456);

        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());

//      Можем создать экземпляр класса без использования дженериков, но тогда вместо Т будет
//      обджэект как в старом коде до дженериков

        Account<String> a1 = new Account<>("ac1");
        Account a2 = new Account (a1);
        Account a3 = new Account (5);
    }

    public static class Account<T> {
        private T _id;

        T getId() {
            return _id;
        }

        Account(T id) {
            _id = id;
        }
    }

    public static class DepositAccount<T, S> extends Account<T> {

        private S _name;

        S getName() {
            return _name;
        }

        DepositAccount(T id, S name) {
            super(id);
            this._name = name;
        }
    }
}
