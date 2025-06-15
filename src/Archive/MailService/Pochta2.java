package Archive.MailService;

// https://github.com/WhiteK0T/Stepik-Java.BaseCourse/blob/master/src/4-3-8/Main.java

import java.util.logging.Level;
import java.util.logging.Logger;

class Pochta2 {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    //Stepik code: start

    //Тут Писать свой КОД
    public static class UntrustworthyMailWorker implements MailService {
        private RealMailService rms;
        private MailService[] mailserv;

        public UntrustworthyMailWorker(MailService[] mailserv) {
            this.mailserv = mailserv;
            this.rms = new RealMailService();
        }

        public Sendable processMail(Sendable mail) {
            for (int i = 0; i < mailserv.length; i++) {
                mail = mailserv[i].processMail(mail);

            }
            return rms.processMail(mail);
        }

        public RealMailService getRealMailService() {
            return this.rms;
        }
    }

    public static class Spy implements MailService {
        private Logger logger;

        public Spy(Logger logger) {
            this.logger = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailMessage.class) {  // или mail instanceof MailMessage
                MailMessage mailMessage = (MailMessage) mail;
                String from = mailMessage.getFrom();
                String to = mailMessage.getTo();
                if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
                    logger.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
                } else {
                    logger.info("Usual correspondence: from " + from + " to " + to + "");
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        private int minPrice = 0;
        private int stolenPrice = 0;

        public Thief(int minPrice) {
            this.minPrice = minPrice;
        }

        public int getStolenValue() {
            return stolenPrice;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailPackage.class) {
                Package pac = ((MailPackage) mail).getContent();
                if (pac.getPrice() >= minPrice) {
                    stolenPrice += pac.getPrice();
                    mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pac.getContent(), 0));
                }
            }
            return mail;
        }
    } // готовый

    public static class IllegalPackageException extends RuntimeException {
    }

    public static class StolenPackageException extends RuntimeException {
    }

    public static class Inspector implements MailService {

        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailPackage.class) {
                Package pack = ((MailPackage) mail).getContent();
                StringBuilder stringBuilder = new StringBuilder(pack.getContent());
                if (stringBuilder.indexOf("stones") != -1) {
                    throw new StolenPackageException();
                } else if (stringBuilder.indexOf(WEAPONS) != -1 || stringBuilder.indexOf(BANNED_SUBSTANCE) != -1) {
                    throw new IllegalPackageException();
                }
            }
            return mail;
        }
    }

    //Stepik code: end

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Pochta2.class.getName());
        Inspector inspector2 = new Inspector();
        Spy spy2 = new Spy(logger);
        Thief thief2 = new Thief(10000);
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(new MailService[]{spy2, thief2, inspector2});
        AbstractSendable[] correspondence = {
                new MailMessage("Oxxxymiron", "Гнойный", " Я здесь чисто по фану, поглумиться над слабым\n" + "Ты же вылез из мамы под мой дисс на Бабана...."),
                new MailMessage("Гнойный", "Oxxxymiron", "....Что? Так болел за Россию, что на нервах терял ганглии.\n" + "Но когда тут проходили митинги, где ты сидел? В Англии!...."),
                new MailMessage("Жириновский", AUSTIN_POWERS, "Бери пацанов, и несите меня к воде."),
                new MailMessage(AUSTIN_POWERS, "Пацаны", "Го, потаскаем Вольфовича как Клеопатру"),
                new MailPackage("берег", "море", new Package("ВВЖ", 32)),
                new MailMessage("NASA", AUSTIN_POWERS, "Найди в России ракетные двигатели и лунные stones"),

                new MailPackage(AUSTIN_POWERS, "NASA", new Package("ракетный двигатель ", 2500000)),
                new MailPackage(AUSTIN_POWERS, "NASA", new Package("stones ", 1000)),
                new MailPackage("Китай", "КНДР", new Package("banned substance ", 10000)),
                new MailPackage(AUSTIN_POWERS, "Жопа запрещенная группировка", new Package("tiny bomb", 9000)),
                new MailMessage(AUSTIN_POWERS, "Психиатр", "Помогите")
        };

        for (AbstractSendable p : correspondence) {
            try {
                print("До:  ", p);                   // print нужен только как элемент пояснения - убрать можно
                Sendable sendable = worker.processMail(p); // можно сразу worker.processMail(p)
                print("После:  ", sendable);

            } catch (StolenPackageException | IllegalPackageException e) {
                logger.log(Level.WARNING, "из: " + p.getFrom() + " куда: " + p.getTo() + " Содержимое: " +
                        (p instanceof MailMessage ? ((MailMessage) p).getMessage() :
                                ((MailPackage) p).getContent().getContent() + " Цена=" +
                                        ((MailPackage) p).getContent().getPrice()) + " Exceptions: " + e);
            }
        }
    }

    public static void print(String prefix, Sendable p) {
    }

    public static interface Sendable {
        String getFrom();

        String getTo();
    }

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

    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }
}