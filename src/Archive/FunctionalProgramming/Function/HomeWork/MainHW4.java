package Archive.FunctionalProgramming.Function.HomeWork;

// https://youtu.be/wUp2TLL4F6E?si=c4-iXIZxyYLDjRGr
// https://drive.google.com/file/d/1aHL5z5ewesZHie0IcZZyQhzV4FjuN1HI/view

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MainHW4 {
    public static void main(String[] args) {

        BiFunction<String,String,String[]> biFun = (text1, text2) -> {

//            Set<String> set = new LinkedHashSet<>(Arrays.asList(text1.split(" ")));
            String[] arrText1 = new HashSet<>(Arrays.asList(text1.split(" ")))
                    .toArray(new String[0]);

            String[] arrText2 = text2.split(" ");

            List<String> list = new ArrayList<>();

            for (int i = 0; i < arrText1.length; i++) {

                for (int j = 0; j < arrText2.length; j++) {

                    if (arrText1[i].equals(arrText2[j])) {

                        list.add(arrText1[i]);
                        break;
                    }
                }
            }
            return list.toArray(new String[0]);
        };
//        String[] resultArray = biFun.apply("Hello Java", "Hello Python");
        System.out.println(Arrays.toString(biFun.apply("Hello Java Anna Hello", "Hello Python tex100 jkkll Anna hdhdhdh Hello Anna lklklk Anna")));
    }
}

    /*
        Опишите такую реализацию BiFunction<String,String,String[]> которая вернет в виде массива
        слова которые одновременно присутствуют и в первой строке и во второй (слова разделены
        пробелами). Например text1 = «Hello Java», text2 = «Hello Python» в результате должен быть
        массив вида [«Hello»].

        */
