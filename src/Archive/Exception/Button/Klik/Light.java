package Archive.Exception.Button.Klik;

import Archive.Exception.Button.IEventHandler;

public class Light implements IEventHandler {
    private boolean turn_On;
    @Override
    public void execute() {
        if (turn_On) {
            System.out.println("���� ��������...");
            turn_On = false;
        }else {
            System.out.println("���� �������!");
            turn_On = true;
        }
    }
}
