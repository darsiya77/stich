package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Material.Nasledovanie;

public class Ostrich extends Birds { // можем наследоваться только от одного класса - в нашем случае от Birds
    // также все классы java являются невными наследниками класса Object (супер класс для всех класссов)


    public Ostrich(String name, Wings wings) { // _________________Alt + Ins -> Constructor_____________________________
        super(name, wings); // ключ.словов super - это работа с суперКлассом. Данная запись только первой идет и только в конструкторе
    }

    public void HideHead (){
        System.out.println("I ostrich and I scared");
    }
}
