package Archive.Exception.Bank4;

public class BankEmployee implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.creditHistory && bankClient.problemWithLaw) {
            return true;
        } else if (!bankClient.problemWithLaw) {
            throw new ProblemWithLawException();
        } else if (!bankClient.creditHistory) {
            throw new BadCreditHistoryException();
        }
        return false;
    }
}
