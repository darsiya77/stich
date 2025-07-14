package Archive;

public class A12 {
    public static void main(String[] args) {
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A'+'1'+"2");
        System.out.println("A" + 12);
        System.out.println('A' + "12");
        parseAndPrintNumber("20");
        System.out.println("_________________________");
        String text = "text";
        System.out.println(text.charAt(2));
        System.out.println(text.length());


    }
    public static void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2);
    }
}
