package Archive.aclass;

public abstract class AbstractSmileProcessor {
    public void process () {   // ����� process ���������� ����������� ����� readString (���. ���������� ��� ����������)
        final String text = this.readString();
        final  String result = text.replace(":)","=)");
        System.out.println(result);
    }
    protected abstract String readString(); // ���� ����� ��������� ������ ������� � ������ ������

}
