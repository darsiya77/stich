package Archive.Uroki.Massivi;

public class ObertochniyTipMassivov {
    static String [] nums = new String [3]; /*(типы данных - 1) примитивные и 2) ссылочные; Ссылочные пишутся с большой
    буквы и являются это являются классы, объекты*/

    public static void main(String[] args) {
        nums [0]="Hello";
        nums [1]=" ";
        nums [2]="World!";

        for(int i = 0; i<nums.length; i++){ /*Для вывода массива используем цикл for */
            System.out.print(nums[i]);
        }
    }
}
