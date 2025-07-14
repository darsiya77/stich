package Archive.Logi;
import java.util.logging.*;

//https://youtu.be/e1Balqbin84?t=221

public class Main {
    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO, "Все хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
        logger.warning("Все хорошо");     // - другой вариант
        logger.info("Произошла ошибка");  // - другой вариант - тоже что и logger.log(Level.INFO, "Все хорошо")
    }
}
//    Создайте в статичном публичном методе logging логгер с именем com.javamentor.logging.Test, залогируйте им
//    два сообщения: первое "Все хорошо" с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.
