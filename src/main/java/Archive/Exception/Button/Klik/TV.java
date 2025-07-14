package Archive.Exception.Button.Klik;

import Archive.Exception.Button.IEventHandler;

public class TV implements IEventHandler {
    private boolean turn_On;
    @Override
    public void execute() {
        if (turn_On) {
            System.out.println("TV OFF...");
            turn_On = false;
        }else {
            System.out.println("TV ON!");
            turn_On = true;
        }
    }
}
