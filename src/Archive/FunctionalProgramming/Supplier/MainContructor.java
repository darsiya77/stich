package Archive.FunctionalProgramming.Supplier;

// https://youtu.be/cl12wAVFPrU?si=WeX3YtTGlzMu-5r1&t=313
// https://drive.google.com/file/d/1SYu7Cum7mGWQypZTUzx6-HwlIhdruQUz/view
// ����� T get()
// ������ ������������� ������ �� �����������. ������� �������� �������

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MainContructor {
    public static void main(String[] args) {

        Supplier<List<String>> sup1 = ArrayList::new;

        List<String> list = sup1.get();

        System.out.println(list);
    }
}
