package Archive.Mail.MailService2;

import Archive.Mail.MailService1.Sendable;
import Archive.Mail.MailService3.IllegalPackageException;
import Archive.Mail.MailService3.StolenPackageException;

//Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
public interface MailService {
    Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException;
}
