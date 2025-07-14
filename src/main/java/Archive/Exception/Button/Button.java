package Archive.Exception.Button;

class Button {

    IEventHandler handler;

    Button(IEventHandler handler) {

        this.handler = handler;
    }

    public void click() {

        handler.execute();
    }
}
