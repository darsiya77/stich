package Archive.Mail.MailService2;

import Archive.Mail.MailService1.Sendable;

/*
�����, � ������� ������ ������ ��������� �����
*/
public class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // ����� ������ ��� ��������� ������� �������� �����.
        return mail;
    }
}
