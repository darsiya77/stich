package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Material.Nasledovanie;

public class Craw extends Birds{
    public Craw(String name, Wings wings) { // _________________Alt + Ins -> Constructor_____________________________
        super(name, wings);
    }

    public void  fly (){
        System.out.println("I Craw and I fly");
    }
}
