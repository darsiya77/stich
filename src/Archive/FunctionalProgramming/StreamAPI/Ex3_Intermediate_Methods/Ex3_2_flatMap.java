package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=FDlAAv_evC33YAMd&t=97
// ѕромежуточные методы дл€ изменени€ потока

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3_2_flatMap {

    public static void main(String[] args) {

        Singer singer1 = new Singer("Freddie Mercury", new String[] { "We Are the Champions", "Somebody to Love" });
        Singer singer2 = new Singer("David Bowie",new String[] { "Space Oddity", "Let Me Sleep Beside You", "Suffragette City" });
        Singer singer3 = new Singer("James Paul McCartney", new String[] { "CanТt Buy Me Love", "Another Girl" });

        Singer[] rockStars = new Singer[] { singer1, singer2, singer3 };

        List<String> song = Arrays.stream(rockStars)
                .flatMap(n-> Arrays.stream(n.getSongs()))
                .collect(Collectors.toList());
        System.out.println(song);
    }
//    ¬ данном примере происходит изменение типа потока данных. Ќа основании потока
//    исполнителей создаетс€ поток строк с названием песен. ѕричем на основании каждого
//    исполнител€ создаетс€ отдельный поток строк. Ќо эти потоки упаковываютс€ в единый
//    поток.
}
class Singer {
    private String name;
    private String[] songs;
    public Singer(String name, String[] songs) {
        super();
        this.name = name;
        this.songs = songs;
    }
    public String[] getSongs() {
        return songs;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Singer [name=" + name + ", songs=" + Arrays.toString(songs) + "]";
    }
}


//    <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper) метод
//    который создает на основании каждого элемента данных текущего потока, новый поток
//        при этом укладыва€ созданные потоки в единый.
