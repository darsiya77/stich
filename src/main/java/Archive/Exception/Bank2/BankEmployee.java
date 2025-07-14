package Archive.Exception.Bank2;

public class BankEmployee implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        if (!bankClient.getHistory()) {
            throw new BadCreditHistoryException("������ ��������� �������");

        }else  if (bankClient.getProblemWithLaw()) {
            throw new ProblemWithLawException("�������� � �������");

        }else return bankClient.getSalary() > 100_000;
    }
}
