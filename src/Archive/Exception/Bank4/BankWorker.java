package Archive.Exception.Bank4;

public interface BankWorker {
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
