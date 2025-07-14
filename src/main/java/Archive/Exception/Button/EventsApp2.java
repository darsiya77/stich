package Archive.Exception.Button;
public class EventsApp2 {


    public static void main(String[] args) {

        Button tvButton = new Button(new IEventHandler(){

            private boolean on = false;
            public void execute(){

                if (on) {
                    System.out.println("Телевизор выключен..");
                    on = false;
                }
                else {
                    System.out.println("Телевизор включен!");
                    on = true;
                }
            }
        });

        Button printButton = new Button(new IEventHandler(){

            public void execute(){

                System.out.println("Запущена печать на принтере...");
            }
        });

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
/*
    Здесь у нас две кнопки - одна для включения-выключения телевизора, а другая для печати на принтере.
        Вместо того, чтобы создавать отдельные классы, реализующие интерфейс EventHandler, здесь обработчики задаются
        в виде анонимных объектов, которые реализуют интерфейс EventHandler. Причем обработчик кнопки телевизора
        хранит дополнительное состояние в виде логической переменной on.*/
