package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public enum Day {
    MONDAY("�����������",false),
    TUESDAY("�������", false),
    WEDNESDAY("�����", false),
    THURSDAY("�������", false),
    FRIDAY("�������", false),
    SATURDAY("�������", true),
    SUNDAY("�����������", true);
    final String meaning;
    final boolean vocationStatus;

    Day(String meaning, boolean vocationStatus){
        this.meaning = meaning;
        this.vocationStatus = vocationStatus;
    }
    public boolean isWeekend() {
        return vocationStatus;
    }
    public String getRusName() {
        return meaning;
    }
}

    /*����������� Enum Day, ������� ����� �������� �� ��� ������. ���� Enum ������ ��������� ��������� ��������:
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        ����� � ���� Enum ������ ���� ���������� ��� ������:
        1. public boolean isWeekend() � �����, ���������� �� ������, �������� �� ���������� ������� �������� ����.
        ��������� ����� �������� ������ ������� � �����������.
        2. public String getRusName() � �����, ������������ ������� �������� ��� ������.*/