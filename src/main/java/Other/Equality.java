package Other;

public class Equality {
    public static boolean doubleExpression(double a, double b, double c) {
        c = 0.0001;
        a = .0;
        for (int i = 1; i <= 11; i++) {
            a += .1;
        }
        b = .1 * 11;
        if (Math.abs(a - b) < c)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.1,0.1));
    }
}
