package Archive.arabian;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int num;

        int num2;

        System.out.print("�����1: "); num = scanner.nextInt();
        System.out.print("�����2: "); num2 = scanner.nextInt();
        if (num>num2){
            System.out.println("����� ����� ������");
        }
        else if (num2>num){
            System.out.println("������ ����� ������");
        }
        else {
            System.out.println("����� �����");
        }

    }
}

