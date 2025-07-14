package Archive.Mail.MailService3;

import Archive.Mail.MailService1.*;
import Archive.Mail.MailService2.MailService;
import java.util.logging.Logger;
import static Archive.Mail.MailService3.Main.AUSTIN_POWERS;

public class Spy implements MailService {
    Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom() == AUSTIN_POWERS || mail.getTo() == AUSTIN_POWERS) {
                logger.warning(String.format("Detected target mail correspondence: %s to %s \"%s\"",
                        mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()));
            } else {
                logger.info(String.format("Usual correspondence: from %s to %s", mail.getFrom(), mail.getTo()));
            }

        }
        return mail;
    }
}

//        Spy � �����, ������� ��������� � ���� �������� ���������, ������� �������� ����� ��� ����.
//        ������ �������������� �� ���������� Logger, � ������� �������� ����� ����� �������� � ���� ���������.
//        �� ������ ������ �� ��������� ������ MailMessage � ����� � ������ ��������� ���������
//        (� ���������� ����� �������� ����� � �������� ������� �� �������� ����� �����):
//
//        2.1) ���� � �������� ����������� ��� ���������� ������ "Austin Powers", �� ����� �������� � ��� ��������� �
//        ������� WARN: Detected target mail correspondence: from {from} to {to} "{message}"
//
//        2.2) �����, ���������� �������� � ��� ��������� � ������� INFO: Usual correspondence: from {from} to {to}
