package Archive.Uroki.Massivi;

public class VivodKonsolZiklomForIndex {
    static int [] nums = new int [10]; /*(int nums =5) - переменная, а (int[] nums = new int [10];) - массив
    из 10 элементов*/

    public static void main(String[] args) {
        nums [0]=2;
        nums [1]=5;
        nums [2]=55;
        nums [3]=39;
        nums [4]=12;
        nums [5]=52;
        nums [6]=55;
        nums [7]=5;
        nums [8]=15;
        nums [9]=35;
        for(int i=0; i<nums.length; i++){ /*Для вывода массива используем цикл for */
            System.out.println(i+" : "+ nums[i]); /*Прописываем i+":", чтобы видеть номер индекса элемента матрицы */
        }
    }
}
