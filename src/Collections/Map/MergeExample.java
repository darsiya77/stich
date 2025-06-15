package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MergeExample {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("apple", 3);
        wordCounts.put("banana", 2);

        // ����������� ���������� ��������� ��� ����� "apple"
        wordCounts.merge("apple", 1, (oldValue, newValue) -> oldValue + newValue);

        // ��������� ����� ����� "orange" � ����������� 1
        wordCounts.put("orange", 1);
        wordCounts.merge("orange", 1, (oldValue, newValue) -> oldValue + newValue);

        System.out.println(wordCounts); // {banana=2, apple=4, orange=1}
    }
}