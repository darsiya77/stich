package Archive.Generics;
//https://habr.com/ru/companies/sberbank/articles/416413/  -- Wildcards и Pecs
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class Program4 {
    public static void main(String[] args) {


        List<Account> account = new ArrayList<>();
        account.add(new Account("001",101));
        account.add(new Account("002",204));
        account.add(new Account("003",99));

        List<SubAccaunt> subAccaunt = new ArrayList<>();
        subAccaunt.add(new SubAccaunt("001",101));
        subAccaunt.add(new SubAccaunt("002",958));
        subAccaunt.add(new SubAccaunt("003",99));

        System.out.println(getSum(account));
        System.out.println("__________");
        System.out.println(getSum2(account));
//        System.out.println(getSum2(subAccaunt)); // compile-time error.
    }
/*Предположим, банку нужно подсчитать сумму сбережений на счетах клиентов.
До появления «дженериков» метод вычисления суммы выглядел так:*/
    public static long getSum(List accounts) {
        long sum = 0;

        for (int i = 0, n = accounts.size(); i < n; i++) {
            Object account = accounts.get(i);
            if (account instanceof Account) {
                sum += ((Account) account).getAmount();
            }
        }

        return sum;
    }

//  С появлением Generics необходимость в проверке и приведении типа отпала:
    public static long getSum2(List<Account> accounts) {
        long sum = 0;

        for (Account account : accounts) {
            sum += account.getAmount();
        }

        return sum;
    }
    public static class Account {
        private String id;
        private int amount;

        public Account(String id, int amount) {
            this.id = id;
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }
    public static class SubAccaunt extends Account {
        public SubAccaunt(String id, int amount) {
            super(id, amount);
        }
    }
}
