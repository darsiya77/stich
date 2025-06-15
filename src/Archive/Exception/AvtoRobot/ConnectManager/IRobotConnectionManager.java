package Archive.Exception.AvtoRobot.ConnectManager;

import Archive.Exception.AvtoRobot.Connection.IRobotConnection;

public interface IRobotConnectionManager {
    IRobotConnection getConnection();
}