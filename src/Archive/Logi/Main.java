package Archive.Logi;
import java.util.logging.*;

//https://youtu.be/e1Balqbin84?t=221

public class Main {
    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO, "��� ������");
        logger.log(Level.WARNING, "��������� ������");
        logger.warning("��� ������");     // - ������ �������
        logger.info("��������� ������");  // - ������ ������� - ���� ��� � logger.log(Level.INFO, "��� ������")
    }
}
//    �������� � ��������� ��������� ������ logging ������ � ������ com.javamentor.logging.Test, ����������� ��
//    ��� ���������: ������ "��� ������" � ������� INFO � ������ "��������� ������" � ������� WARNING.
