package Archive.iyerarkhiya;

public class Main {
    public static abstract class KeywordAnalyzer implements TextAnalyzer {

        protected abstract String[] getKeywords();               // по условию - возвращает набор ключ.слов

        protected abstract Label getLabel();                     // возвращ. метку, с положит. срабатыванием

        @Override
        public Label processText(String text) {
            String[] keywords = getKeywords();
            for (String keyword : keywords) {
                if (text.contains(keyword)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

    //____________________________________________________________________
    public static class SpamAnalyzer extends KeywordAnalyzer {
        private String[] keywords;

        public SpamAnalyzer(String[] keywords) {                           // по усл. конструется от массива строк с ключевыми словами

            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    public static class NegativeTextAnalyzer extends KeywordAnalyzer {
        private final String[] keywords = {":(", "=(", ":|"};               // заданы по условию

        @Override
        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public static class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public Label processText(String text) {
            if (text.length() > this.maxLength) {
                return Label.TOO_LONG;
            }
            return Label.OK;
        }
    } //______________________________________________________________________
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {        // параметры заданы по условию
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }
    //________________________________________TEST____________________________________________

    public static void main(String[] args) {
                           // инициализация анализаторов для проверки в порядке данного набора анализаторов
                           // создаем обект интерфейса, что бы в него вставить массиф с фильтрами
                           // разных последовательностей
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {                         // (1,2,3)
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {                         // (1,3,2)
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {                         // (3,1,2)
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers4 = {                         // (3,2,1)
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords)
        };
        TextAnalyzer[] textAnalyzers5 = {                         // (2,1,3)
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {                         // (2,3,1)
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords)
        };
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1,
                                          textAnalyzers2,
                                          textAnalyzers3,
                                          textAnalyzers4,
                                          textAnalyzers5,
                                          textAnalyzers6};
        // textAnalyzers1,2,3,4,5,6 - масиивы с фильтрами

        Main testObject = new Main();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев

        for (String test : tests) {
            numberOfAnalyzer = 1;

            System.out.println("__________________");
            System.out.print("test #" + numberOfTest + ": ");

            System.out.println(test);

            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");

                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
        System.out.println("-------------" + Label.OK + "-------------");
    }
}

