package Archive.FiltrSystem;

public class Main {
    public static void main(String[] args) {
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"mail", "SPAM", "Hello"});
        Label label = new Main().checkLabels(new TextAnalyzer[]{spamAnalyzer,
                new NegativeTextAnalyzer(), new TooLongTextAnalyzer(100)}, "В лесул^;ась ёлочка");
        System.out.println(label);


//        Допустим, мы будем фильтровать спам, комментарии с негативным содержанием и слишком длинные комментарии.
//        -Спам будем фильтровать по наличию указанных ключевых слов в тексте.
//        -Негативное содержание будем определять по наличию одного из трех смайликов — :( =( :|.
//        -Слишком длинные комментарии будем определять исходя из данного числа — максимальной длины комментария.

//        Дальше, вам необходимо реализовать три класса, которые реализуют данный интерфейс:
//        SpamAnalyzer, NegativeTextAnalyzer и TooLongTextAnalyzer.

//        SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
//        Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.
    }




    interface TextAnalyzer {
        Label processText(String text);
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
    //    _______________________________________________________

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textAnalyzer : analyzers) {
            if (textAnalyzer.processText(text) != Label.OK) {
                return textAnalyzer.processText(text);
            }
        }
        //Твой код здесь
//        будет возвращать метку для комментария по набору анализаторов текста. checkLabels должен возвращать первую
//        не—OK метку в порядке данного набора анализаторов, и OK, если все анализаторы вернули OK. TextAnalyzer и Label
//        уже подключены, лишние импорты вам не потребуются.
        return Label.OK;
    }

    public static abstract class KeywordAnalyzer implements Main.TextAnalyzer {
        protected abstract String[] getKeywords(); // будет возвращать набор ключевых слов

        protected abstract Main.Label getLabel();  // будет возвращать набор метку, которой необходимо пометить положительные срабатывания

        @Override
        public Main.Label processText(String text) {
            for (int i = 0; i < getKeywords().length; i++) {
                if (text.toLowerCase().contains(getKeywords()[i].toLowerCase())) {
                    return getLabel();
                }
            }
            return Main.Label.OK;
        }
    }

    public static class SpamAnalyzer extends KeywordAnalyzer {
        private final String[] keywords;

        public SpamAnalyzer(String[] keywords) {
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
        private final String[] negativwords = new String[]{":(", "=(", ":|"};

        @Override
        protected String[] getKeywords() {
            return this.negativwords;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public static class TooLongTextAnalyzer implements TextAnalyzer {

        private final int maxLength;

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
    }
}
