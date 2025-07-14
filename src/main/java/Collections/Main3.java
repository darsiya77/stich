package Collections;


public class Main3 {
    public static void main(String[] args) {
        Car myCar1 = new Car("Cadillac", 34f);
        Driver driver1 = new Driver("Andrey", myCar1);
        driver1.driveByCar();
        myCar1.modelName = "";

        System.out.println("_______");

        Car myCar2 = new Car("DeoJentra", 4.945129f);
        Driver driver2 = new Driver("Shah", myCar2);
        driver2.driveByCar();
    }

    //_______________________________________________
    public static class Car {
        private String modelName; // ����� ������
        private Float fuelQuantity; // ���������� �������
        private Driver driver = null; // ����� �� ��� � ������

        // constructor
        public Car(String modelName, Float fuelQuantity) {
            this.modelName = modelName;
            this.fuelQuantity = fuelQuantity;
        }


        public void drive(Driver driver) {
//            String mayString = "�� ��� %s, %s ������� ���� ���� ������";
//            System.out.printf((mayString), Driver.driverName, this.modelName);
            System.out.println("�� ��� " + Driver.driverName + ", " + this.modelName + " ������� ���� ���� ������");
//            System.out.printf("�� ��� %s, %s ������� ���� ���� ������", Driver.driverName, this.modelName);
        }
        // getters/setters

    }

    public static class Driver {
        private static String driverName; // ��� ��������
        private Car car; // ������ ��������

        // constructor

        public Driver(String driverName, Car car) {
            this.driverName = driverName;
            this.car = car;
        }

        public void driveByCar() {
            if (this.car.fuelQuantity.equals(0f)) {
                System.out.println("������� � ������ �� �����");
            } else if (this.car.fuelQuantity < 10) {
                System.out.println("��, ������� �� �� ��������");
                this.car.drive(this.car.driver);
            } else {
                System.out.println("����� ����� �� �����, �� �������");
                this.car.drive(this.car.driver);
            }
        }
//        ���� ���������� ������� � ������ ������ 10, �� � ������� ��������� �������: "��, ������� �� �� �������� �
//        ���������� ����� drive.
//        ���� ���������� ������� 0, �� � ������� ��������� �������: �������� � ������ �� �����" � �� ����
//        ������ ������ �������������
//        ���� ������� ������ 10, �� � ������� ��������� �������: ������ ����� �� �����, �� ������� � ���������� ����� drive.
        // getters/setters

    }
}

