package Archive.Exception.Main;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            System.out.println(5/0);
            arr[4] = 5;
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Этот блок catch не отработал!!");
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Какая-то ошибка - на 0 делить нельзя");
            //ex.printStackTrace();
        }
        finally {
            System.out.println("FINALLY___1");
        }
            try {
                //System.out.println(5/0);
                arr[4] = 5;
                System.out.println(arr[4]);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                //ex.printStackTrace();
                System.out.println("Index 4 out of bounds for length 3");
                ex.printStackTrace();
            }
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Этот блок catch не отработал!!");
            }
            finally {
                System.out.println("FINALLY____2");
            }
            int i = 1000;
        System.out.println("Программа выполняется дальше," + " i = " + i);
        System.out.println("Конец программы");
    }
}
// https://youtu.be/_3K2Q4K08hQ?si=aAQBcrm1qgS8ObdQ&t=814
// finally не выполняется в 3х случаях
