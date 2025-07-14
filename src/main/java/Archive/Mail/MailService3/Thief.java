package Archive.Mail.MailService3;

import Archive.Mail.MailService1.*;
import Archive.Mail.MailService1.Package;
import Archive.Mail.MailService2.MailService;

public class Thief implements MailService {
int minWorth;
int totalSumOfStolen;

    public Thief(int minWorth) {
        this.minWorth = minWorth;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= this.minWorth) {
                return new MailPackage(mail.getTo(), mail.getFrom(), new Package("stones instead of", 0));
            } else {
                return mail;
            }
        }
        return mail;
    }
}
//   3) Thief � ���, ������� ������ ����� ������ ������� � ���������� ��� ���������. ��� ��������� � ������������
//   ���������� int � ����������� ��������� �������, ������� �� ����� ��������. �����, � ������ ������ ������
//   �������������� ����� getStolenValue, ������� ���������� ��������� ��������� ���� �������, ������� �� ��������.
//   ��������� ���������� ��������� �������: ������ �������, ������� ������ ����, �� ������ �����, ����� ��, ������
//   � ������� ��������� � ���������� ������� "stones instead of {content}".
