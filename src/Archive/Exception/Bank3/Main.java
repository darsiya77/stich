package Archive.Exception.Bank3;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient client1 = new BankClient("Good");
        BankClient client2 = new BankClient("BAD");
        BankClient client3 = new BankClient("Проблемы с законом");
        BankClient client4 = new BankClient("Проблемы с банковской историей");
        BankWorker rabotnik = new BankRabotnik();
        System.out.println(getCreditForClient(rabotnik, client1) + "\n"); //true

        System.out.println(getCreditForClient(rabotnik, client2) + "\n"); //false

        System.out.println(getCreditForClient(rabotnik, client3) + "\n"); //false

        System.out.println(getCreditForClient(rabotnik, client4) + "\n"); // "Проблемы с банковской историей" false

    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);

        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");

        } catch (ProblemWithLawException e) {

        }
        return false;
    }
}

class ProblemWithLawException extends Exception {
}

class BadCreditHistoryException extends Exception {
}

class BankRabotnik implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.getStatus().equals("Проблемы с банковской историей")) {
            throw new BadCreditHistoryException();
        } else if (bankClient.getStatus().equals("Проблемы с законом")) {
            throw new ProblemWithLawException();
        } else if (bankClient.getStatus().equals("Good")) {
            return true;
        }
        else return false;
    }
}

class BankClient {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BankClient(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
}

interface BankWorker {
    boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
