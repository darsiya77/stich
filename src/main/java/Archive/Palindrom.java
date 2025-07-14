package Archive;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
    }
    public static boolean isPalindrome(String text) {
        String text2 = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuffer textReverse = new StringBuffer(text2).reverse();
        return textReverse.toString().equals(text2);
    }

}
/* 0) поставил задачу: надо сравнить строку, которую принимает метод с этой же, но обратной строкой
   1) убрал из исходной строки лишние символы и делаю одинаковый регистр для последующего сравнения
   2) переворачиваю слово, но в строке нет такого метода, а есть в баффере. Перевожу строку в бафер и переворачиваю

[^a-zA-Z], [^a-zA-Z0-9] - регулярное выражение для удаления из строки всех символов, не являющихся буквами и цифрами
   [^a-zA-Z], [^a-zA-Z0-9] - здесь прописал все буквы, и все, что не входит в диапазон, должно быть заменено на ""
   Все цифры и символы которые не буквы будут удалены
   https://youtu.be/5hq5EfsMkgY?si=8c9OII8H7zh1dFzD
   */


