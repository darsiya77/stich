package Archive.Uroki.Massivi;

public class VivodKonsol2ZiklomForEach {
    static int [] nums = new int [10]; /*массив из 10 элементов. Если не прописали значение элементов, то по умолчанию
    для числовых переменных значение элементов будет 0*/

    public static void main(String[] args) {
        int i = -1;
        for(int n: nums){ /*Для вывода массива используем цикл for */
            i ++;
            System.out.println(i+" : "+n);
        }
    }
}
// i+" : "+ nums[i]);
