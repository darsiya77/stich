package Archive.Exception.AvtoRobot.ConnectManager;

import Archive.Exception.AvtoRobot.Connection.RobotConnection;
import Archive.Exception.AvtoRobot.RobotConnectionException;

import java.util.Random;

public class RobotConnectionManager implements IRobotConnectionManager {

    @Override
    public RobotConnection getConnection() {
        int n = new Random().nextInt(2);
        if (n > 0) {
            //System.err.println("connection OFF");
            throw new RobotConnectionException("connection failed");

        }else {
            return new RobotConnection();
        }
    }
}
   /* «а установку соединени€ отвечает RobotConnectionManager:

ћетод getConnection() делает попытку соединитьс€ с роботом и возвращает установленное соединение,
через которое можно отдавать роботу команды.

”становка соединени€ может завершитьс€ неуспешно, а также уже установленное соединение может внезапно разорватьс€.
¬с€кое бывает. ѕоэтому любой метод RobotConnectionManager и RobotConnection может бросить непровер€емое исключение RobotConnectionException:
   */