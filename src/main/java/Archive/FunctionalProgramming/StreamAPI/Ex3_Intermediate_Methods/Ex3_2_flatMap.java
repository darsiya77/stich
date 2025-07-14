package Archive.FunctionalProgramming.StreamAPI.Ex3_Intermediate_Methods;

// https://drive.google.com/file/d/1NCutgNNGdAhZxqwA67ICv0Q8w1Bs1lKF/view
// https://youtu.be/P_MZQhMsiDA?si=FDlAAv_evC33YAMd&t=97
// ������������� ������ ��� ��������� ������

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3_2_flatMap {

    public static void main(String[] args) {

        Singer singer1 = new Singer("Freddie Mercury", new String[] { "We Are the Champions", "Somebody to Love" });
        Singer singer2 = new Singer("David Bowie",new String[] { "Space Oddity", "Let Me Sleep Beside You", "Suffragette City" });
        Singer singer3 = new Singer("James Paul McCartney", new String[] { "Can�t Buy Me Love", "Another Girl" });

        Singer[] rockStars = new Singer[] { singer1, singer2, singer3 };

        List<String> song = Arrays.stream(rockStars)
                .flatMap(n-> Arrays.stream(n.getSongs()))
                .collect(Collectors.toList());
        System.out.println(song);
    }
//    � ������ ������� ���������� ��������� ���� ������ ������. �� ��������� ������
//    ������������ ��������� ����� ����� � ��������� �����. ������ �� ��������� �������
//    ����������� ��������� ��������� ����� �����. �� ��� ������ ������������� � ������
//    �����.
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


//    <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper) �����
//    ������� ������� �� ��������� ������� �������� ������ �������� ������, ����� �����
//        ��� ���� ��������� ��������� ������ � ������.
