package Archive.Uroki.vetvleniya;

public class Gruppi_Vozrastov {
public static void main(String[] args) {
    System.out.println(determineGroup(14));
}

public static int determineGroup(int age) {
    if (age >= 7 && age <= 13) {
        return 1;
    }
    if (age >= 14 && age <= 17) {
        return 2;
    }
    if (age >= 18 && age <= 65) {
        return 3;
    } else return -1;
}
}
