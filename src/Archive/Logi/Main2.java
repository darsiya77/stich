package Archive.Logi;

import java.util.logging.Logger;

public class Main2 {
    public static void main(String[] args) {
        Main2.logging();
    }
    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.info("Все хорошо");
        logger.warning("Произошла ошибка");
    }
}
