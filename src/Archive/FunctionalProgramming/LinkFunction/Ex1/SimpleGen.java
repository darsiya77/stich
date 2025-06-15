package Archive.FunctionalProgramming.LinkFunction.Ex1;

//https://youtu.be/Czkk1Kgqxjs?si=7DJ5XUpsRruwtVPA&t=497

public class SimpleGen {
    private int number;
    public SimpleGen(int number) {
        super();
        this.number = number;
    }
    public SimpleGen() {
        super();
    }

    public int getNumber() {  // ����� ���������� �������� ���� int � ���������� � ���� ���, ��� � ����� � ������. Generator.
        int temp = number;
        number = number + 1;
        return temp;
    }
    public static int getRandomNumber() { // ���������� �������� ���� int � ���������� � ����
        return (int) (Math.random() * 10);
    }
}

// �������� ��������, ���� ����� �� ��������� �������� ����������. � � ��� ���
// ������� � ��������� ��� � ��������� ���� ����������.