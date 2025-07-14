package Archive._3ObektiKlassaPaketiJava.NasledovanieKlassObject;

import java.util.Objects;

public class ComplexNumber348 {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(327.0, 522.0);
        ComplexNumber number2 = new ComplexNumber(327.0, 522.0);
        System.out.println(number1.equals(number2));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());
        System.out.println(number1.hashCode() == number2.hashCode());

    }

    //________________________________ComplexNumber____________________________________________________________________
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj) return true;
//            if (obj == null || getClass() != obj.getClass()) return false;
//            ComplexNumber stuff = (ComplexNumber) obj;
//            return re == stuff.re && im == stuff.im;
//        }
//
//        @Override
//        public int hashCode() {
//
//            return java.util.Objects.hash(re, im);
//        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
//            return Objects.hash(re, im) + 31 >>> 4;
            return Double.hashCode(this.re + 31) * 31 + Double.hashCode(this.im + 31) >>> 4;
        }
//        public int hashCode() {
//            int res = 1;
//            res = (31 * res) + Double.hashCode(this.im);
//            res = 31 * res + Double.hashCode(this.re);
//            return res;
//        }
    }
}
