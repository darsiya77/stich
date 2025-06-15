package Archive.FunctionalProgramming.KataEx.Ex7;


import Archive.MailService.Pochta;

import java.util.*;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

// 53, 84, 72 - ���� ������� ����� ������ ���� � �������� 3 ������ ����� ����������


        // Random variables
        String randomFrom = "..."; // ��������� ��������� ������. ������ ������� �� ��������������.
        String randomTo = "...";  // ��������� ��������� ������. ������ ������� �� ��������������.
        int randomSalary = 100;  // ��������� ��������� ����� ������������� �����. ������ ������� ��� ��������������.

// �������� ������ �� ���� �������� ���������.
        MailMessage firstMessage = new MailMessage("Robert Howard", "H.P. Lovecraft", "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!");

        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";

        MailMessage secondMessage = new MailMessage("Jonathan Nolan", "Christopher Nolan", "����, ������ ��� ��� ������ ������ ����, ����� ����������� ��� �������� ������� �. ��� �� ������!");

        MailMessage thirdMessage = new MailMessage("Stephen Hawking", "Christopher Nolan", "� ��� � �� ����� ������������.");

        List<MailMessage> messages = Arrays.asList(firstMessage, secondMessage, thirdMessage);

// �������� ��������� �������.
        MailService<String> mailService = new MailService<>();

// ��������� ������ ����� �������� ��������
        messages.stream().forEachOrdered(mailService);

// ��������� � �������� ������� "��������� �����",
//   ��� �� ���������� ����� �������� ������ ���������, ������� ���� ��� ����������
        Map<String, List<String>> mailBox = mailService.getMailBox();

        assert mailBox.get("H.P. Lovecraft").equals(Arrays.asList("This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!")) : "wrong mailService mailbox content (1)";

        assert mailBox.get("Christopher Nolan").equals(Arrays.asList("����, ������ ��� ��� ������ ������ ����, ����� ����������� ��� �������� ������� �. ��� �� ������!", "� ��� � �� ����� ������������.")) : "wrong mailService mailbox content (2)";

        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()) : "wrong mailService mailbox content (3)";


// �������� ������ �� ���� �������.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

// �������� ��������� �������, ��������������� ��������.
        MailService<Integer> salaryService = new MailService<>();

// ��������� ������ ������� �������� ��������
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

// ��������� � �������� ������� "��������� �����",
//   ��� �� ���������� ����� �������� ������ �������, ������� ���� ��� ����������.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)) : "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)) : "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)) : "wrong salaries mailbox content (3)";
    }

    public static interface Sendable<T> {

        String getFrom();

        String getTo();

        T getContent();
    }

    public static abstract class AbstractSendable<T> implements Sendable<T> {

        protected final String from;
        protected final String to;
        protected final T content;

        public AbstractSendable(String from, String to, T content) {
            this.from = from;
            this.to = to;
            this.content = content;
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
        public T getContent() {
            return content;
        }

    }

    public static class MailMessage extends AbstractSendable<String> {

        public MailMessage(String from, String to, String content) {
            super(from, to, content);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }

            MailMessage that = (MailMessage) o;

            return Objects.equals(content, that.content);

//            if (content != null ? !content.equals(that.content) : that.content != null) {
//                return false;
//            }
//            return true;                                          ������� �� - return Objects.equals(content, that.content);
        }

    }

    public static class Salary extends AbstractSendable<Integer> {
        public Salary(String from, String to, Integer content) {
            super(from, to, content);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Salary salary = (Salary) o;
            return Objects.equals(content, salary.content);
        }
        // implement here
    }

    public static class MailService<T> implements Consumer<Sendable<T>> {

        HashMap<String, List<T>> mailBox = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return (super.get(key) == null) ? new ArrayList<>() : super.get(key);
//                return mailBox.getOrDefault(key, Collections.emptyList());
            }
        };

        public Map<String, List<T>> getMailBox() {
            return mailBox;
        }


        @Override
        public void accept(Sendable<T> s) {

            // �������� ���������� �� Sendable
            String recipient = s.getTo();

            // �������� ����������
            T content = s.getContent();

            mailBox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(content);

        }
        // implement here
    }
}

