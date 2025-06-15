package Archive.Exception.Bank2;

public class Main {
    public static void main(String[] args) {
        BankClient bankClient1 = new BankClient("Anton", 101_000, true, false);
        BankClient bankClient2 = new BankClient("Anton", 100_000, true, false);
        BankClient bankClient3 = new BankClient("Anton", 200_000, false, false);
        BankClient bankClient4 = new BankClient("Anton", 200_000, true, true);
        BankWorker bankWorker = new BankEmployee();
        System.out.println("bankClient1: " + getCreditForClient(bankWorker,bankClient1));               //true
        System.out.println("bankClient2: " + getCreditForClient(bankWorker,bankClient2) + "\n______");  //false
        System.out.println("bankClient3: " + getCreditForClient(bankWorker,bankClient3) + "\n______");  //"Проблемы с банковской историей" false
        System.out.println("bankClient4: " + getCreditForClient(bankWorker,bankClient4));               //false
    }
    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);

        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            //e.printStackTrace();

        } catch (ProblemWithLawException e) {
            //e.printStackTrace();

        }
        return false;
    }
}
