package Archive.FunctionalProgramming.Lyambda.Ex1;

// ������ ������� ��� ���������� ��������������� ����������
//https://youtu.be/ChTVknYsHeU?si=stEud2EOA8TSA72J&t=78
//https://drive.google.com/file/d/1FvFcyijJVyOEV7wCzxxvd6ojP9KRFvMf/view

public class Main {
    public static void main(String[] args) {

        StringModificator sm = (text) -> text.toUpperCase();

        System.out.println(sm.getString("hello"));
//_______________________________������������� ������ �������________________________________________

        StringModificator sm2 = (text) -> {
            String result = "";
            for (char let : text.toCharArray()) {
                if (Character.isLetter(let) || let == ' ') {
                    result += let;
                }
            }
            return result; // �������� return ����������
        };                 // ����� ���� ������ �������. ����� � ������� �����������

        System.out.println(sm2.getString("Hello12345 world!"));
//_______________________________�������� ���� ���������� � ������ �������_______________________________________
        StringModificator sm3 = (String text) -> "length = " + text.length();
        System.out.println(sm3.getString("Hi"));
    }

}