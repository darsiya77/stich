package Collections.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DataEx {
    public static void main(String[] args) {
        Date date = new Date();                                 // кол-во мс с 1970 года
        Date date2 = new Date();
        System.out.println("date.getTime():         " + date.getTime());
        date.setYear(119);   // тот год что присылаю в аргументах, прибаляется к числу 1900
        date.setMonth(0);    // отсчет месяцев с 0
        System.out.println("date.before(date2): " + date.before(date2));
        System.out.println("date.after(date2): " + date.after(date2));
        System.out.println("date:               " + date);        // вместо мс внутри класса происходит преобразование в дату

        System.out.println("_____________");

        LocalDate localDate = LocalDate.now();  // не можем испо-ть к-р, т.к. он private - используем стат.метод
        LocalDate localDate1 = LocalDate.of(2007, Month.APRIL, 20);
        System.out.println("localDate1 = LocalDate.of(): " + localDate1);
        System.out.println("LocalDate.now():        " + localDate);
        System.out.println("____________");

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2007, Month.APRIL, 20, 12, 25, 10);
        System.out.println("localDateTime1 = LocalDateTime.of(): " + localDateTime1);
        System.out.println("LocalDateTime.now():        " + localDateTime);
        System.out.println("____________");

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime.now():        " + localTime);
    }
}
