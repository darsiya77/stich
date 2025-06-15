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

//        Spy — шпион, который логгирует о всей почтовой переписке, которая проходит через его руки.
//        Объект конструируется от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях.
//        Он следит только за объектами класса MailMessage и пишет в логгер следующие сообщения
//        (в выражениях нужно заменить части в фигурных скобках на значения полей почты):
//
//        2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с
//        уровнем WARN: Detected target mail correspondence: from {from} to {to} "{message}"
//
//        2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
