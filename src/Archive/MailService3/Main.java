package Archive.MailService3;

import java.util.logging.Logger;


public class Main {

    public static final String AUSTIN_POWERS = "Austin Powers";

    public static final String WEAPONS = "weapons";

    public static final String BANNED_SUBSTANCE = "banned substance";

    //Интерфейс: сущность, которую можно отправить по почте.
//У такой сущности можно получить от кого и кому направляется письмо.
    public static interface Sendable {
        String getFrom();

        String getTo();
    }


    //Абстрактный класс, который позволяет абстрагировать логику хранения
//источника и получателя письма в соответствующих полях класса.
    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }

    }


    //Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }

    }


    //Посылка, содержимое которой можно получить с помощью метода `getContent`
    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }

    }

    //Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
    public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }


//    Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.

    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    /*
    Класс, в котором скрыта логика настоящей почты
    */
    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }
//    __________________________МОИ КЛАССЫ_________________________________________

    public static class Spy implements MailService {
        Logger logger;

        public Spy(Logger logger) {
            this.logger = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                    logger.warning(String.format("Detected target mail correspondence: from %s to %s \"%s\"",
                            mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()));
                } else {
                    logger.info(String.format("Usual correspondence: from %s to %s", mail.getFrom(), mail.getTo()));
                }

            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        int minWorth;
        int totalSumOfStolen;

        public Thief(int minWorth) {
            this.minWorth = minWorth;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                if (((MailPackage) mail).getContent().getPrice() >= this.minWorth) {
                    this.totalSumOfStolen += ((MailPackage) mail).getContent().getPrice();
                    return new MailPackage(mail.getTo(), mail.getFrom(), new Package((String.format("stones instead of %s", ((MailPackage) mail).getContent().getContent())), 0));
                } else {
                    return mail;
                }
            }
            return mail;
        }

        public int getStolenValue() {
            return this.totalSumOfStolen;
        }
    }

    public static class UntrustworthyMailWorker implements MailService {
        MailService[] peopleArray;
        RealMailService realMailService = new RealMailService();

        public UntrustworthyMailWorker(MailService[] peopleArray) {
            this.peopleArray = peopleArray;
            this.realMailService = new RealMailService();
        }

        @Override
        public Sendable processMail(Sendable mail) {
            for (int i = 0; i < this.peopleArray.length; i++) {
                mail = peopleArray[i].processMail(mail);
            }

            return this.realMailService.processMail(mail);
        }

        public RealMailService getRealMailService() {
            return this.realMailService;
        }
    }

    public static class Inspector implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                if (((MailPackage) mail).getContent().getContent().contains(WEAPONS) || ((MailPackage) mail).getContent().getContent().contains(BANNED_SUBSTANCE)) {
                    throw new IllegalPackageException("ВНИМАНИЕ! Обнаружено запрещенное содержимое!!");
                } else if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                    throw new StolenPackageException("ВНИМАНИЕ! Обнаружена кража!!");
                }
            }
            return mail;
        }
    }

    public static class IllegalPackageException extends RuntimeException {
        public IllegalPackageException(String message) {
            super(message);
        }
    }

    public static class StolenPackageException extends RuntimeException {
        public StolenPackageException(String message) {
            super(message);
        }
    }
}
