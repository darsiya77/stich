package Archive.Exception.Bank;

public class Bank {

    public static void main(String [] args) {
        Checking c = new Checking(101);
        System.out.println("������� $300...");
        c.deposit(300.00);

        try {
            System.out.println("\n������ $100...");
            c.withdraw(100.00);
            System.out.println("\n������ $400...");
            c.withdraw(400.00);
        }catch(InsufficientFundsException e) {
            System.out.println("��������, �� � ��� $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
