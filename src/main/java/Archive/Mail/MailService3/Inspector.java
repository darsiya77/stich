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
                throw new IllegalPackageException("ВНИМАНИЕ! Обнаружено запрещенное содержимое!!");
            } else if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException("ВНИМАНИЕ! Обнаружена кража!!");
            }
        }
        return mail;
    }
}

//  4) Inspector — Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
//  если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
//  ("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из
//  камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException.
//  Оба исключения вы должны объявить самостоятельно в виде непроверяемых исключений.
