package Archive.Mail.MailService3;

import Archive.Mail.MailService1.MailPackage;
import Archive.Mail.MailService1.Sendable;
import Archive.Mail.MailService2.MailService;
import static Archive.Mail.MailService3.Main.*;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getContent() == WEAPONS || ((MailPackage) mail).getContent().getContent() == BANNED_SUBSTANCE) {
                throw new IllegalPackageException("��������! ���������� ����������� ����������!!");
            } else if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException("��������! ���������� �����!!");
            }
        }
        return mail;
    }
}

//  4) Inspector � ���������, ������� ������ �� ������������ � ����������� ��������� � ���� ������� � ���� ����������,
//  ���� ���� ���������� �������� �������. ���� �� ������� ����������� ������� � ����� �� ����������� ����������
//  ("weapons" � "banned substance"), �� �� ������� IllegalPackageException. ���� �� ������� �������, ��������� ��
//  ������ (�������� ����� "stones"), �� ������� ��������� � ���� StolenPackageException.
//  ��� ���������� �� ������ �������� �������������� � ���� ������������� ����������.
