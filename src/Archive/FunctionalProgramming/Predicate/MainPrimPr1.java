package Archive.FunctionalProgramming.Predicate;

// https://youtu.be/rfVhHnxBdc0?si=PIgcdK_pM-vi-x6x&t=2022
// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// ѕример использовани€ примитивной специализации


import java.util.function.IntPredicate;

public class MainPrimPr1 {

    public static void main(String[] args) {

        IntPredicate pr = a -> a % 2 == 0;

        System.out.println(pr.test(100));
    }
}
