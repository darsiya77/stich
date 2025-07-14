package Archive.FunctionalProgramming.LinkFunction.Ex1;

// ������������� ������ �� �� �����������/����������� �����
//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=497
//https://drive.google.com/file/d/1GEs34Ds1Ff6qSjshkl8rw3Qc-FNo6CVq/view

public class Main {
 /*   ��� ����, ��� �� ����� ���� ������������ ������ �� ����� � �������� ����������
    ��������������� ���������� ����������, ��� �� ��������� ��� ������������� ��������
    � ������ ����������.
    ���������� ���� ������� �� �����������! ����� � ������� ������ ����� ��
    ����������� ������ ����������� �������������� ���������!*/

    public static void main(String[] args) {
//      ������� ��������� ������ SimpleGen:
        SimpleGen sg = new SimpleGen(5);

//      ������ �� ����� � �������� ���������� ��������������� ����������:
//      ��� �������������� ������ ������ SimpleGen �� ������� ������ �� ������

//      ������� ��������� ���������� Generator � ����������� ��� ������:
        Generator gen1 = sg::getNumber;

//      ������ � ��� ���� ��������� ���������� Generator = gen1

        int temp = gen1.getNextElement();

        System.out.println(temp);    // 5

//___________________________________ ������ �� ����������� �����: ________________________________________________

//      ��� ������������ ������ ������ SimpleGen �� ���������� ��� ������:

        gen1 = SimpleGen::getRandomNumber;

        temp = gen1.getNextElement();

        System.out.println(temp);

    }
}
