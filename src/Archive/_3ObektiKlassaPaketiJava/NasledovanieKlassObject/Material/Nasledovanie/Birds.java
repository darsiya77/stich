package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Material.Nasledovanie;
// Наследование - отношение между классами, при котором характеристики одного класса передаются другому классу без
// необходимости их повторного определения
// https://youtu.be/3F8nKR-bazE
public class Birds {
    public String name; // public - что бы поле было доступно для других классов наследников
    private Wings wings; // private - недоступно для других классов

    public Birds(String name, Wings wings) {
        this.name = name; // ключевое слово this говорит о данном классе. this.name (переменная класса) = name (пришла с конструктора)
        this.wings = wings;
    }

    public void walk (){
        System.out.println("Ho-ho-ho");
    }
//______________________________________Alt + Ins -> Getter and Setter__________________________________________________
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
