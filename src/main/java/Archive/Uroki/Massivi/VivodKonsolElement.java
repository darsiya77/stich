package Archive.Uroki.Massivi;

public class VivodKonsolElement {
    public static void main(String[] args) {
        int nums[]={2,3,8,14};
        int length = nums.length; //свойство length, возвращающее длину массива, то есть количество его элементов - 4
        int last = nums[nums.length-1];/* чтобы получить последний элемент массива, используем свойство length*/
        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };// - Двухмерный массив
        System.out.println(nums[3]);// Выводим значение 3-го элемента массива, счет идет с 0 до 3 - всего 4 элемента
        System.out.println(last);
        System.out.println(nums2[1][0]);// Выводим элемент 2-й строки 1-го столбца
    }
}
