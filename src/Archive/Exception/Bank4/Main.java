package Archive.Exception.Bank4;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        System.out.println("_____TEST_1____________");
        test.getCreditForClient(new BankEmployee(), new BankClient(true, true));
        System.out.println("_____TEST_2________________");
        test.getCreditForClient(new BankEmployee(), new BankClient(true, false));
        System.out.println("_____TEST_3_________________");
        test.getCreditForClient(new BankEmployee(), new BankClient(false, true));

    }
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            if (bankWorker.checkClientForCredit(bankClient)) {
                return true;
            }
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");

        } catch (ProblemWithLawException e) {
//            Если проблемы с законом - ничего выводить на экран не нужно
        }
        return false;
    }
}
