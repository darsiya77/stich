package Archive.FiltrSystem;

public class Main {
    public static void main(String[] args) {
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"mail", "SPAM", "Hello"});
        Label label = new Main().checkLabels(new TextAnalyzer[]{spamAnalyzer,
                new NegativeTextAnalyzer(), new TooLongTextAnalyzer(100)}, "� �����^;��� ������");
        System.out.println(label);


//        ��������, �� ����� ����������� ����, ����������� � ���������� ����������� � ������� ������� �����������.
//        -���� ����� ����������� �� ������� ��������� �������� ���� � ������.
//        -���������� ���������� ����� ���������� �� ������� ������ �� ���� ��������� � :( =( :|.
//        -������� ������� ����������� ����� ���������� ������ �� ������� ����� � ������������ ����� �����������.

//        ������, ��� ���������� ����������� ��� ������, ������� ��������� ������ ���������:
//        SpamAnalyzer, NegativeTextAnalyzer � TooLongTextAnalyzer.

//        SpamAnalyzer ������ ���������������� �� ������� ����� � ��������� �������.
//        ������ ����� ������ ������ ��������� � ����� ��������� ���� ������ ����� � ��������� ���� keywords.
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
        //���� ��� �����
//        ����� ���������� ����� ��� ����������� �� ������ ������������ ������. checkLabels ������ ���������� ������
//        ��OK ����� � ������� ������� ������ ������������, � OK, ���� ��� ����������� ������� OK. TextAnalyzer � Label
//        ��� ����������, ������ ������� ��� �� �����������.
        return Label.OK;
    }

    public static abstract class KeywordAnalyzer implements Main.TextAnalyzer {
        protected abstract String[] getKeywords(); // ����� ���������� ����� �������� ����

        protected abstract Main.Label getLabel();  // ����� ���������� ����� �����, ������� ���������� �������� ������������� ������������

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
