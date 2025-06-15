package Archive.Exception.Bank2;

public class BankEmployee implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        if (!bankClient.getHistory()) {
            throw new BadCreditHistoryException("Плохая кредитная история");

        }else  if (bankClient.getProblemWithLaw()) {
            throw new ProblemWithLawException("Проблемы с законом");

        }else return bankClient.getSalary() > 100_000;
    }
}
