package Archive.Generics;

public class Program2 {

    public static void main(String[] args) {

        Account acc1 = new Account("1876", 4500);
        Account acc2 = new Account("3476", 1500);

        Transaction<Account> tran1 = new Transaction<Account>(acc1, acc2, 4000);
        tran1.execute();
//        tran1 = new Transaction<Account>(acc1, acc2, 4000);
        tran1.execute();
    }
    public  static class Transaction<T extends Account> {

        private T from;     // � ������ ����� �������
        private T to;       // �� ����� ���� �������
        private int sum;    // ����� ��������

        Transaction(T from, T to, int sum) {
            this.from = from;
            this.to = to;
            this.sum = sum;
        }

        public void execute() {

            if (from.getSum() > sum) {
                from.setSum(from.getSum() - sum);
                to.setSum(to.getSum() + sum);
                System.out.printf("Account %s: %d \nAccount %s: %d \n",
                        from.getId(), from.getSum(), to.getId(), to.getSum());
            } else {
                System.out.printf("Operation is invalid");
            }
        }
    }

    public static class Account {

        private String id;
        private int sum;

        Account(String id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        public String getId() {
            return id;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}

