package Archive.Anonimus;

//https://youtu.be/ndnubpPzkNE?si=TsTXKgdL7pT3odTU

interface MonitoringSystem {

    public void startMonitoring();
}

public class Test3 {
    public static void main(String[] args) {
        MonitoringSystem generalModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("���������� ����� ����������� ���������!");
            }

            public void someSpecificMethod() {

                System.out.println("������������� ����� ������ ��� ������� ������");
            }
        };
        generalModule.startMonitoring();
    }
}
