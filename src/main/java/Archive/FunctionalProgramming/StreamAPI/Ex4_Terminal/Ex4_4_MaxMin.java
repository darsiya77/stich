package Archive.FunctionalProgramming.StreamAPI.Ex4_Terminal;

// https://youtu.be/B_9-FqfA514?si=WIs9d5nIY88JCsc5&t=688
// https://drive.google.com/file/d/1uI3YLnwwBO3gOytfa4vnwOdKCDvAJ3Mt/view
//        Optional<T> max(Comparator<? super T> comparator) - вернет Optional с
//        максимальным элементом потока. Отношения порядка определяется реализацией
//        Comparator.

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex4_4_MaxMin {

    public static void main(String[] args) {

        ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);

        ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);

        ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);

        ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);

        ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);

        List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);

        Optional<ProgrammingLanguage> result = languages.stream().max(Ex4_4_MaxMin::compareHard);

        System.out.println(result.get());
    }

//    С помощью Comparator выполним поиск самого сложного языка с самым длинным названием.

    public static int compareHard(ProgrammingLanguage a, ProgrammingLanguage b) {

        if (a.getComplexity().ordinal() > b.getComplexity().ordinal()) {
            return 1;
        }
        if (a.getComplexity().ordinal() < b.getComplexity().ordinal()) {
            return -1;
        }
        return Integer.compare(a.getName().length(), b.getName().length());
    }


}

enum DifficultyLevel {
    EASY, MEDIUM, HARD;
}
class ProgrammingLanguage {
    private String name;
    private DifficultyLevel complexity;
    public ProgrammingLanguage(String name, DifficultyLevel complexity) {
        super();
        this.name = name;
        this.complexity = complexity;
    }
    public String getName() {
        return name;
    }
    public DifficultyLevel getComplexity() {
        return complexity;
    }
    @Override
    public String toString() {
        return "ProgrammingLanguage [name = " + name + ", complexity = " + complexity + "]";
    }
}
