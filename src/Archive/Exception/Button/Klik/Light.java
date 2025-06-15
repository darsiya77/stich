package Archive.Exception.Button.Klik;

import Archive.Exception.Button.IEventHandler;

public class Light implements IEventHandler {
    private boolean turn_On;
    @Override
    public void execute() {
        if (turn_On) {
            System.out.println("Свет выключен...");
            turn_On = false;
        }else {
            System.out.println("Свет включен!");
            turn_On = true;
        }
    }
}
