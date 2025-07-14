package Archive.FunctionalProgramming.Supplier;

//https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// https://youtu.be/cl12wAVFPrU?si=EkQ5BoL21lk2QhRM&t=95
// метод T get()
// Реализация Supplier с помощью класса

import java.util.function.Supplier;

public class MainGet {
    public static void main(String[] args) {
        Supplier<Integer> counter = new IntegerSequince(0, 10, 1);
        Integer number;
        for (; (number = counter.get()) != null; ) {
            System.out.println(number);
        }
    }
}

class IntegerSequince implements Supplier<Integer> {
    private Integer start;
    private Integer end;
    private Integer step;

    public IntegerSequince(Integer start, Integer end, Integer step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Integer get() {
        if (start > end)
            return null;
        start += step;
        return (start - step);
    }
}
