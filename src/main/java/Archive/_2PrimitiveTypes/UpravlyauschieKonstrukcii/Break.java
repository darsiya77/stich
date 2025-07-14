package Archive._2PrimitiveTypes.UpravlyauschieKonstrukcii;

public class Break {            // Оператор break используется для выхода из цикла
    public static void main(String[] args) {
                                             // 1. Рассмотрим цикл for:
        for (int i = 0; i < 100; i++) {
            if (i == 4) {
                break; // завершить цикл, если i = 4; Прерывает цикл и передает управление на следующую за циклом строку
            }
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
         // ============================================ 2. Рассмотрим цикл while:============================
            int i = 0;
            while (i < 100) {
                if (i == 5) {
                    break; // закончить цикл, если i = 5
                }
                System.out.println("i: " + i);
                i++;
            }
            System.out.println("Цикл завершен.");
          // =========================================== 3. xxx:===============================================
     for (i = 0; i < 3; i++) {
        System.out.print("Итерация " + i + ": ");
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                break; // закончить цикл, если j = 4
            }
            System.out.print(j + " ");
        } // оператор break во внутреннем цикле вызывает завершение только этого цикла. Внешний цикл не затрагивается.
        System.out.println();
    }
    System.out.println("Цикл завершен.");

}
    }
