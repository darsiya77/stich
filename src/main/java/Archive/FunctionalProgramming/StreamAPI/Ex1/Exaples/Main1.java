package Archive.FunctionalProgramming.StreamAPI.Ex1.Exaples;

// https://drive.google.com/file/d/1RLRmqdxcyk596KfujPlVzL2qVG8P3J0S/view
// https://youtu.be/PY82g6qZJBQ?si=BwOGXTOzM7OiNR_h&t=954

import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(0, 3, -2, 4, -1, 7);
        list.stream()
                .filter(a -> a > 0)
                .sorted()
                .forEach(a -> System.out.println(a)); // 3     4     7
    }
}
