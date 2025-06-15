package Archive.Exception.AvtoRobot.Connection;

public interface IRobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}