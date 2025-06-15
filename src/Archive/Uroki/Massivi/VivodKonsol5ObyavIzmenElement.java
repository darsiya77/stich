package Archive.Uroki.Massivi;

public class VivodKonsol5ObyavIzmenElement {
    static int [] nums = new int [4]; /*(int nums =5) - переменная, а (int[] nums = new int [4];) - массив
    из 4 элементов*/

    public static void main(String[] args) {

        for(int i=0; i<nums.length; i++){ /*Используем цикл for для присваивания значений элементам матрицы (инициализации) */
            nums[i]=i*2;}    // Присваиваем элементу с инд.i значение: i * 2

        for(int i=0; i<nums.length; i++){     /*Для вывода массива используем цикл for */

            nums[i]=nums[i]*3;// Можем изменить элементы, эл с инд i * 3
            System.out.println(i+" : "+ nums[i]);
        }
    }
}
// Инициализирует каждый элемент матрицы и выводит на печать, показывая значение элемента для каждого индекса
