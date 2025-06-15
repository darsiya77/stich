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
//   1) UntrustworthyMailWorker Ч класс, моделирующий ненадежного работника почты, который вместо того, чтобы передать
//   почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц,
//   а затем, в конце концов, передает получившийс€ объект непосредственно экземпл€ру RealMailService.
//   ” UntrustworthyMailWorker должен быть конструктор от массива MailService (результат вызова processMail
//   первого элемента массива передаетс€ на вход processMail второго элемента, и т. д.) и метод getRealMailService,
//   который возвращает ссылку на внутренний экземпл€р RealMailService, он не приходит масивом в конструкторе и не
//   настраиваетс€ извне класса.
