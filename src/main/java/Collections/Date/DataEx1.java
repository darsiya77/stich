package Collections.Date;

import java.util.Date;

public class DataEx1 {
    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        System.out.println("Carrent date (today.getTime()): " + today.getTime());

        long msDay = 24 * 60 * 60 * 1000;
        System.out.println("Years from 1970: " + today.getTime()/msDay/365);

        Date currentTime = new Date();             //
        Thread.sleep(3000);                  //
        Date newTime = new Date();                //

        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
