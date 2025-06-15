package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject.Material.Nasledovanie;

public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich("Страус", null);// т.к. в классе Страус и Ворона прописали конструктор
        Craw craw = new Craw("Ворона",null);          // надо его вызывать здесь иначе выдаст ошибку

        ostrich.setName("Ostrich");

        Birds ostrich2 = new Ostrich("Страус2", null);// создаем страуса, но ссылка является типом Birds
             // и мы не можем обратиться к методам страуса а только к полям Birds - то есть т.о. ограничиваем ostrich2

    }
}
