package Archive.Exception.Main;

public class Main3 {
    public static void main(String[] args) {
        int i = 80;
        try {
            if (i > 50) throw new Exception("����� i > 50");
        }
        catch (Exception ex) {
            //System.out.println("��������� ������");
            ex.printStackTrace();
            System.out.println("��������� ������");
        }
        System.out.println("��������� ����������� ������!");
        int a = 100;
        System.out.println(a);
    }
}
// ��� ��������� ���������� � ����������� ��� � ���. try/catch