package Archive.Mail.MailService3;

import Archive.Mail.MailService1.Sendable;
import Archive.Mail.MailService2.MailService;
import Archive.Mail.MailService2.RealMailService;

public class UntrustworthyMailWorker implements MailService {
    MailService[] peopleArray;

    public UntrustworthyMailWorker(MailService[] peopleArray) {
        this.peopleArray = peopleArray;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        for (int i = 0; i < this.peopleArray.length; i++) {
            peopleArray[i].processMail(mail);
        }

        return new RealMailService().processMail(mail);
    }
}
//   1) UntrustworthyMailWorker � �����, ������������ ����������� ��������� �����, ������� ������ ����, ����� ��������
//   �������� ������ ��������������� � ������ �����, ��������������� �������� ���� ������ ������ ������� ���,
//   � �����, � ����� ������, �������� ������������ ������ ��������������� ���������� RealMailService.
//   � UntrustworthyMailWorker ������ ���� ����������� �� ������� MailService (��������� ������ processMail
//   ������� �������� ������� ���������� �� ���� processMail ������� ��������, � �. �.) � ����� getRealMailService,
//   ������� ���������� ������ �� ���������� ��������� RealMailService, �� �� �������� ������� � ������������ � ��
//   ������������� ����� ������.
