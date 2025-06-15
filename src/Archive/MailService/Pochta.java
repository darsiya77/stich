package Archive.MailService;


// https://stepik.org/lesson/12774/step/9?unit=3122 - коменты на стэпике с решениями
// Тест в psvm из комментов под задачей в ката
// https://github.com/BJCreslin/Stepik-Java-4-9-/blob/master/src/Solution.java

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pochta {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Pochta.class.getName());

        Inspector inspector = new Inspector();
        Spy spy = new Spy(logger);
        Thief thief = new Thief(10_000);
        MailService variousWorkers[] = new MailService[]{spy, thief, inspector};
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(variousWorkers);

//        System.out.println(Pochta.class.getName());   -->  Archive.MailService.Pochta

        AbstractSendable correspondence[] = {
                new MailMessage("Oxxxymiron", "Гнойный", "Я здесь чисто по фану, поглумиться над слабым\n" + "Ты же вылез из мамы под мой дисс на Бабана...."),
                new MailMessage("Гнойный", "Oxxxymiron", "....Что? Так болел за Россию, что на нервах терял ганглии.\n" + "Но когда тут проходили митинги, где ты сидел? В Англии!...."),
                new MailMessage("Жриновский", AUSTIN_POWERS, "Бери пацанов, и несите меня к воде."),
                new MailMessage(AUSTIN_POWERS, "Пацаны", "Го, потаскаем Вольфовича как Клеопатру"),
                new MailMessage("NASA", AUSTIN_POWERS, "Найди в России ракетные двигатели и лунные stones"),
                new MailMessage(AUSTIN_POWERS, "Психиатр", "Помогите"),

                new MailPackage("берег", "море", new Package("ВВЖ", 32)),
                new MailPackage(AUSTIN_POWERS, "NASA", new Package("ракетный двигатель ", 2_500_000)),
                new MailPackage(AUSTIN_POWERS, "NASA", new Package("stones", 1_000)),
                new MailPackage("Китай", "КНДР", new Package("banned substance", 99)),
                new MailPackage(AUSTIN_POWERS, "ИГИЛ (запрещенная группировка", new Package("tiny bomb", 9_000)),
        };
        Arrays.stream(correspondence).forEach(parcell -> {
            try {
                worker.processMail(parcell);
            } catch (StolenPackageException e) {
                logger.log(Level.WARNING, "Inspector found stolen package: " + e);
            } catch (IllegalPackageException e) {
                logger.log(Level.WARNING, "Inspector found illegal package: " + e);
            }
        });
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

//    Теперь рассмотрим классы, которые моделируют работу почтового сервиса:

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

    //__________________________________________________________________________________________________
//набор классов, каждый из которых является MailService:
// __________________________________________________________________________________________________
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
// __________________________________________________________________________________________________

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
                    this.logger.warning("Detected target mail correspondence: from " +
                            from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
                } else {
                    this.logger.info("Usual correspondence: from " + from + " to " + to + "");
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

            if (mail.getClass() == MailPackage.class) {  // или mail instanceof MailMessage
                Package pac = ((MailPackage) mail).getContent();
                if (pac.getPrice() >= minPrice) {
                    stolenPrice += pac.getPrice();
                    mail = new MailPackage(mail.getFrom(), mail.getTo(),
                            new Package("stones instead of " + pac.getContent(), 0));
                }
            }
            return mail;
        }
    } // готовый

    public static class Thief2 implements MailService {
        private int minPrice;
        private int stolenValue;

        public Thief2(int minPrice) {
            this.minPrice = minPrice;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail.getClass() == MailPackage.class) {

                MailPackage mailPackage = (MailPackage) mail;

                int worth = mailPackage.getContent().getPrice();
                String realContent = mailPackage.getContent().getContent();
                Package fakePackage = new Package("stones instead of " + realContent, 0);
                if (worth >= minPrice) {
                    stolenValue += worth;
                    return new MailPackage(mail.getFrom(), mail.getTo(), fakePackage);
                }
            }
            return mail;
        }

        public int getStolenValue() {
            return stolenValue;
        }
    } // я написал

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
}

/*
    Вам необходимо описать набор классов, каждый из которых является MailService:
 1) UntrustworthyMailWorker — класс, моделирующий ненадежного работника почты, который вместо того,
 чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору
 третьих лиц, а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService.
 У UntrustworthyMailWorker должен быть конструктор от массива MailService (результат вызова processMail
 первого элемента массива передается на вход processMail второго элемента, и т. д.) и метод getRealMailService,
 который возвращает ссылку на внутренний экземпляр RealMailService, он не приходит масивом в конструкторе и
 не настраивается извне класса.
 2) Spy — шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект
 конструируется от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит
 только за объектами класса MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить
 части в фигурных скобках на значения полей почты):
 2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с
 уровнем WARN: Detected target mail correspondence: from {from} to {to} "{message}"
 2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
 3) Thief — вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе
 переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен
 присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.
 Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же,
 только с нулевой ценностью и содержимым посылки "stones instead of {content}".
 4) Inspector — Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде
 исключения, если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из
 запрещенных содержимым ("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он
 находит посылку, состоящую из камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException.
 Оба исключения вы должны объявить самостоятельно в виде непроверяемых исключений.
 Все классы должны быть определены как публичные и статические, так как в процессе проверки ваш код будет
 подставлен во внешний класс, который занимается тестированием и проверкой структуры. Для удобства во внешнем
 классе объявлено несколько удобных констант и импортировано все содержимое пакета java.util.logging.
 Для определения, посылкой или письмом является Sendable объект воспользуйтесь оператором instanceof.
*/
