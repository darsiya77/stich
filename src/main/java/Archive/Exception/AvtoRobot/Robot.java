package Archive.Exception.AvtoRobot;

import Archive.Exception.AvtoRobot.ConnectManager.IRobotConnectionManager;
import Archive.Exception.AvtoRobot.ConnectManager.RobotConnectionManager;
import Archive.Exception.AvtoRobot.Connection.IRobotConnection;

public class Robot {
    public static void main(String[] args) {
        IRobotConnectionManager robotCM = new RobotConnectionManager();
        moveRobot(robotCM, 10,5 );

    }
    public static void moveRobot(IRobotConnectionManager robotConnectionManager, int toX, int toY) {
        IRobotConnection robotConnection = null;
        for (int i = 0; i < 3; i++) {
            robotConnection = null;
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                    e.printStackTrace();
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException e) {
                        System.out.println("Done - не печатает если в этом блоке не ловит исключение");
                    }
                }
            }
        }
    }
}
/*    Вспомним нашего старого знакомого робота. Теперь мы будем давать роботу команды удаленно, подключаясь к нему
по беспроводному каналу связи.

        Подключение к роботу представляется в программе интерфейсом RobotConnection:
        Да, робот с тех пор поумнел и стал понимать команду на перемещение в заданную точку (метод moveRobotTo). Е
        му больше не нужны пошаговые инструкции.

        RobotConnection - это временно устанавливаемое соединение, которое надо закрывать, когда оно больше не нужно.
        Для закрытия соединения в интерфейсе есть метод close().

        За установку соединения отвечает RobotConnectionManager:
        Метод getConnection() делает попытку соединиться с роботом и возвращает установленное соединение, через
        которое можно отдавать роботу команды.

        Установка соединения может завершиться неуспешно, а также уже установленное соединение может
        внезапно разорваться. Всякое бывает. Поэтому любой метод RobotConnectionManager и RobotConnection может бросить
        непроверяемое исключение RobotConnectionException:
        Ваша задача - реализовать метод который устанавливает соединение с роботом, отдает ему команду на перемещение
        в заданную точку и затем закрывает соединение, выполняя при необходимости повтор этой последовательности до трех раз.

        При этом:

        Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить
        метод RobotConnection.moveRobotTo() без исключений. Ошибка закрытия соединения не важна и должна игнорироваться.

        Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем
        вторую попытку. Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен
        бросить исключение RobotConnectionException.

        Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно
        должно быть закрыто несмотря на возможные исключения, случившиеся в дальнейшем во время работы метода.

        Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException,
        метод должен завершиться и выбросить это исключение, не выполняя повторных попыток пообщаться с роботом.
        Единственное, что метод должен сделать перед выбросом этого исключения — закрыть открытое соединение RobotConnection.

        В решение должен использоваться классический try-catch.*/
