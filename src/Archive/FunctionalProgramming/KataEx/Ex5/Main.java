package Archive.FunctionalProgramming.KataEx.Ex5;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(123, 54325, 456, 567, 768, 7689, 78, 35, 132);

        Stream<Integer> stream2 = Stream.empty();

        Comparator<? super Integer> comparator = Integer::compare;

        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println("min: " + x1 + "\nmax: " + x2);

        findMinMax(stream1, comparator, biConsumer);

        System.out.println("______________");

        findMinMax(stream2, comparator, biConsumer);
    }

    public static <T> void findMinMax(

            Stream<? extends T> stream,

            Comparator<? super T> order,

            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? extends T> list = stream.toList();

        T min = list.stream().min(order).orElse(null);

        T max = list.stream().max(order).orElse(null);

        minMaxConsumer.accept(min, max);

    }
}
/*
    �������� �����, ��������� � ������ ����������� � ������������ �������� � ������������ ��������,
    �������� Comparator'��.
        ��������� ����������� � ������������ �������� ��������� � minMaxConsumer ��������� �������:
        minMaxConsumer.accept(min, max);
        ���� ����� �� �������� ���������, �� ��������:
        minMaxConsumer.accept(null, null);

        ����������:
        1. ������ ���� �����

        public <T> void findMinMax
        (Stream<? extends T> stream, Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer)

        2. ����� ������ �������� ������� � �������� � ������, � ������� order.
        3. ���������� ������ ������ ���� �������� minMaxConsumer, �������� �������
*/