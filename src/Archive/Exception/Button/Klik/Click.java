package Archive.Exception.Button.Klik;

import Archive.Exception.Button.IEventHandler;

public class Click {
    public static void main(String[] args) {
        Click pressLight = new Click(new Light());
        Click pressTV = new Click(new TV());
        pressLight.click();
        pressLight.click();
        pressTV.click();
        pressTV.click();
    }

    IEventHandler iEventHandler;

    public Click(IEventHandler iEventHandler) {
        this.iEventHandler = iEventHandler;
    }
    public void click() {
        iEventHandler.execute();
    }
}
/*В классе Click помимо ссылок (конструктор Click(...)) на классы, реализующие интерфейс IEventHandler могут быть
свои методы со своей логикой. Этот класс может писать 1 команда, а классы Light и ТV, реализующие интерфейс пишет 2
команда. Т.о. команды 1,2 не зависят др. от др. и пишут свои классы балгодаря интерфейсам.
 */
