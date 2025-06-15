package Archive.Exception.Bank2;

public class BankClient {
    private String name;
    private int salary;
    private boolean history;
    private boolean problemWithLaw;

    public BankClient(String name, int salary, boolean history, boolean problemWithLaw) {
        this.name = name;
        this.history = history;
        this.salary = salary;
        this.problemWithLaw = problemWithLaw;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }


    public void setHistory(boolean history) {
        this.history = history;
    }
    public boolean getHistory() {
        return history;
    }
    public void setProblemWithLaw(boolean problemWithLaw) {
        this.problemWithLaw = problemWithLaw;
    }
    public boolean getProblemWithLaw() {
        return problemWithLaw;
    }
}
