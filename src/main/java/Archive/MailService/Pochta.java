package Archive.MailService;


// https://stepik.org/lesson/12774/step/9?unit=3122 - ������� �� ������� � ���������
// ���� � psvm �� ��������� ��� ������� � ����
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
                new MailMessage("Oxxxymiron", "�������", "� ����� ����� �� ����, ����������� ��� ������\n" + "�� �� ����� �� ���� ��� ��� ���� �� ������...."),
                new MailMessage("�������", "Oxxxymiron", "....���? ��� ����� �� ������, ��� �� ������ ����� �������.\n" + "�� ����� ��� ��������� �������, ��� �� �����? � ������!...."),
                new MailMessage("����������", AUSTIN_POWERS, "���� �������, � ������ ���� � ����."),
                new MailMessage(AUSTIN_POWERS, "������", "��, ��������� ���������� ��� ���������"),
                new MailMessage("NASA", AUSTIN_POWERS, "����� � ������ �������� ��������� � ������ stones"),
                new MailMessage(AUSTIN_POWERS, "��������", "��������"),

                new MailPackage("�����", "����", new Package("���", 32)),
                new MailPackage(AUSTIN_POWERS, "NASA", new Package("�������� ��������� ", 2_500_000)),
                new MailPackage(AUSTIN_POWERS, "NASA", new Package("stones", 1_000)),
                new MailPackage("�����", "����", new Package("banned substance", 99)),
                new MailPackage(AUSTIN_POWERS, "���� (����������� �����������", new Package("tiny bomb", 9_000)),
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

//    ������ ���������� ������, ������� ���������� ������ ��������� �������:

    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // ����� ������ ��� ��������� ������� �������� �����.
            return mail;
        }
    }

    //__________________________________________________________________________________________________
//����� �������, ������ �� ������� �������� MailService:
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
            if (mail.getClass() == MailMessage.class) {  // ��� mail instanceof MailMessage
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

            if (mail.getClass() == MailPackage.class) {  // ��� mail instanceof MailMessage
                Package pac = ((MailPackage) mail).getContent();
                if (pac.getPrice() >= minPrice) {
                    stolenPrice += pac.getPrice();
                    mail = new MailPackage(mail.getFrom(), mail.getTo(),
                            new Package("stones instead of " + pac.getContent(), 0));
                }
            }
            return mail;
        }
    } // �������

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
    } // � �������

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
    ��� ���������� ������� ����� �������, ������ �� ������� �������� MailService:
 1) UntrustworthyMailWorker � �����, ������������ ����������� ��������� �����, ������� ������ ����,
 ����� �������� �������� ������ ��������������� � ������ �����, ��������������� �������� ���� ������ ������
 ������� ���, � �����, � ����� ������, �������� ������������ ������ ��������������� ���������� RealMailService.
 � UntrustworthyMailWorker ������ ���� ����������� �� ������� MailService (��������� ������ processMail
 ������� �������� ������� ���������� �� ���� processMail ������� ��������, � �. �.) � ����� getRealMailService,
 ������� ���������� ������ �� ���������� ��������� RealMailService, �� �� �������� ������� � ������������ �
 �� ������������� ����� ������.
 2) Spy � �����, ������� ��������� � ���� �������� ���������, ������� �������� ����� ��� ����. ������
 �������������� �� ���������� Logger, � ������� �������� ����� ����� �������� � ���� ���������. �� ������
 ������ �� ��������� ������ MailMessage � ����� � ������ ��������� ��������� (� ���������� ����� ��������
 ����� � �������� ������� �� �������� ����� �����):
 2.1) ���� � �������� ����������� ��� ���������� ������ "Austin Powers", �� ����� �������� � ��� ��������� �
 ������� WARN: Detected target mail correspondence: from {from} to {to} "{message}"
 2.2) �����, ���������� �������� � ��� ��������� � ������� INFO: Usual correspondence: from {from} to {to}
 3) Thief � ���, ������� ������ ����� ������ ������� � ���������� ��� ���������. ��� ��������� � ������������
 ���������� int � ����������� ��������� �������, ������� �� ����� ��������. �����, � ������ ������ ������
 �������������� ����� getStolenValue, ������� ���������� ��������� ��������� ���� �������, ������� �� ��������.
 ��������� ���������� ��������� �������: ������ �������, ������� ������ ����, �� ������ �����, ����� ��,
 ������ � ������� ��������� � ���������� ������� "stones instead of {content}".
 4) Inspector � ���������, ������� ������ �� ������������ � ����������� ��������� � ���� ������� � ����
 ����������, ���� ���� ���������� �������� �������. ���� �� ������� ����������� ������� � ����� ��
 ����������� ���������� ("weapons" � "banned substance"), �� �� ������� IllegalPackageException. ���� ��
 ������� �������, ��������� �� ������ (�������� ����� "stones"), �� ������� ��������� � ���� StolenPackageException.
 ��� ���������� �� ������ �������� �������������� � ���� ������������� ����������.
 ��� ������ ������ ���� ���������� ��� ��������� � �����������, ��� ��� � �������� �������� ��� ��� �����
 ���������� �� ������� �����, ������� ���������� ������������� � ��������� ���������. ��� �������� �� �������
 ������ ��������� ��������� ������� �������� � ������������� ��� ���������� ������ java.util.logging.
 ��� �����������, �������� ��� ������� �������� Sendable ������ �������������� ���������� instanceof.
*/
