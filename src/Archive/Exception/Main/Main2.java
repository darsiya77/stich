package Archive.Exception.Main;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            System.out.println(5/0);
            arr[4] = 5;
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("���� ���� catch �� ���������!!");
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("�����-�� ������ - �� 0 ������ ������");
            //ex.printStackTrace();
        }
        finally {
            System.out.println("FINALLY___1");
        }
            try {
                //System.out.println(5/0);
                arr[4] = 5;
                System.out.println(arr[4]);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                //ex.printStackTrace();
                System.out.println("Index 4 out of bounds for length 3");
                ex.printStackTrace();
            }
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("���� ���� catch �� ���������!!");
            }
            finally {
                System.out.println("FINALLY____2");
            }
            int i = 1000;
        System.out.println("��������� ����������� ������," + " i = " + i);
        System.out.println("����� ���������");
    }
}
// https://youtu.be/_3K2Q4K08hQ?si=aAQBcrm1qgS8ObdQ&t=814
// finally �� ����������� � 3� �������
