package Archive.Generics;

public class Numeric {
    public static void main(String[] args) {
        Double d = 5.25;
        System.out.println("(5.25)d.intValue() = " + d.intValue());
        Integer i = 5;
        System.out.println("(5)i.doubleValue() = " + i.doubleValue());

//      int c = d - i;  // compile-time error, c = 0.25
        int c2 = (int)(d - i);
        double c3 = d - i;

        System.out.println("(double 5.25) d - (5 int) i = " + (d - i));
        System.out.println("int c2 = (int)(d - i) = " + c2);
        System.out.println("double c3 = d - i = " + c3);
        System.out.println();

        NumericFns<Integer> iOb = new NumericFns<>(5);
        System.out.println( "Oбpaтнaя величина iOb " + iOb. reciprocal ( ) ) ;
        System.out.println( "Дpoбнaя часть iOb " + iOb. fraction( ) ) ;
        System.out.println("___");

        NumericFns<Double> dOb = new NumericFns<>(5.25);
        System.out.println ( "Oбpaтнaя величина dOb - " + dOb.reciprocal ( ) ) ;
        System.out.println( "Дpoбнaя часть dOb " + dOb.fraction( ) ) ;

        NumericFns<Double> dObd = new NumericFns<>(1.25);
        NumericFns<Float> fObf = new NumericFns<>(-1.25f);
        if (dObd. absEqual (new NumericFns<>(-1.25f)) )
            System.out.println();
    }
    static class NumericFns<T extends Number> {
        T num;

        public NumericFns(T num) {
            this.num = num;
        }
        // Вернуть обратную величину

        double reciprocal () {return num.doubleValue();}
        double fraction () {return num.doubleValue() - num.intValue();}
        boolean absEqual (NumericFns<?> ob) {if(Math.abs (num.doubleValue()) ==
                    Math.abs (ob.num.doubleValue() ) ) return true; return false;}
    }
}

