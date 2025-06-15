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
        private String modelName; // марка машины
        private Float fuelQuantity; // количество топлива
        private Driver driver = null; // сидит ли кто в машине

        // constructor
        public Car(String modelName, Float fuelQuantity) {
            this.modelName = modelName;
            this.fuelQuantity = fuelQuantity;
        }


        public void drive(Driver driver) {
//            String mayString = "Ну что %s, %s отвезет тебя куда угодно";
//            System.out.printf((mayString), Driver.driverName, this.modelName);
            System.out.println("Ну что " + Driver.driverName + ", " + this.modelName + " отвезет тебя куда угодно");
//            System.out.printf("Ну что %s, %s отвезет тебя куда угодно", Driver.driverName, this.modelName);
        }
        // getters/setters

    }

    public static class Driver {
        private static String driverName; // имя водителя
        private Car car; // машина водителя

        // constructor

        public Driver(String driverName, Car car) {
            this.driverName = driverName;
            this.car = car;
        }

        public void driveByCar() {
            if (this.car.fuelQuantity.equals(0f)) {
                System.out.println("Сегодня я никуда не поеду");
            } else if (this.car.fuelQuantity < 10) {
                System.out.println("Ох, доехать бы до заправки");
                this.car.drive(this.car.driver);
            } else {
                System.out.println("Вроде права не забыл, ну поехали");
                this.car.drive(this.car.driver);
            }
        }
//        Если количество топлива у машины меньше 10, то в консоль выводится надпись: "Ох, доехать бы до заправки» и
//        вызывается метод drive.
//        Если количество топлива 0, то в консоль выводится надпись: «Сегодня я никуда не поеду" и на этом
//        логика метода заканчивается
//        Если топлива больше 10, то в консоль выводится надпись: «Вроде права не забыл, ну поехали» и вызывается метод drive.
        // getters/setters

    }
}

