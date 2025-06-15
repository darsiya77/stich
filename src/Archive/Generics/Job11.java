package Archive.Generics;

import java.io.Serializable;

public class Job11 {
    public static void main(String[] args) {
        Cell<Job> cell = new Cell<Job>();
        cell.set(new Job());
        cell.set(new ChildJob());
        cell.doJob();

        Cell<ChildJob> cell2 = new Cell<>();
        cell2.set(new ChildJob());
        cell2.doJob();
    }
}
class Job implements Serializable { void doit () {System.out.println("doit");}}
class ChildJob extends Job { }
class Cell<T extends Job & Serializable> {
    T t;
    public T getT() {return t;}
    public void set(T t) {this.t = t;}
    public void doJob() {t.doit();}
}
