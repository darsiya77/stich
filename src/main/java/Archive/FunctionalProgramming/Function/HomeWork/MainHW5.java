package Archive.FunctionalProgramming.Function.HomeWork;

// https://youtu.be/wUp2TLL4F6E?si=c4-iXIZxyYLDjRGr
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class MainHW5 {
    public static void main(String[] args) {
        ToIntFunction<Calendar> fun = calendar -> calendar.get(Calendar.YEAR);
        Calendar calendar = Calendar.getInstance();
        System.out.println(fun.applyAsInt(calendar));

    }
}

/*
    »спользу€ примитивную специализацию Function реализуйте функционал который на основе
        объекта типа java.util.Calendar вернет целое число значение которого равно году хранимому в
        Calendar.
        */
