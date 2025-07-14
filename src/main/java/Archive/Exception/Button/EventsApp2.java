package Archive.Exception.Button;
public class EventsApp2 {


    public static void main(String[] args) {

        Button tvButton = new Button(new IEventHandler(){

            private boolean on = false;
            public void execute(){

                if (on) {
                    System.out.println("��������� ��������..");
                    on = false;
                }
                else {
                    System.out.println("��������� �������!");
                    on = true;
                }
            }
        });

        Button printButton = new Button(new IEventHandler(){

            public void execute(){

                System.out.println("�������� ������ �� ��������...");
            }
        });

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
/*
    ����� � ��� ��� ������ - ���� ��� ���������-���������� ����������, � ������ ��� ������ �� ��������.
        ������ ����, ����� ��������� ��������� ������, ����������� ��������� EventHandler, ����� ����������� ��������
        � ���� ��������� ��������, ������� ��������� ��������� EventHandler. ������ ���������� ������ ����������
        ������ �������������� ��������� � ���� ���������� ���������� on.*/
