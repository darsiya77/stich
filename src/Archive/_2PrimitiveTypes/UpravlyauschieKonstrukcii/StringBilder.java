package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii;

public class StringBilder {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("Hello");
        result.append(" world");

        String string = new String(result);
        string = result + "!!\n";
        System.out.println(string.trim()); // trim - удаляет пробелы в начале и в конце строки
        string = string.toUpperCase();

        System.out.println(string);
    }
}
