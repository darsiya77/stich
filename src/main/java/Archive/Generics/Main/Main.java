package Archive.Generics.Main;

public class Main {
    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("Co�ep���oe ������� tdlocs. " ) ;
        BoundedWildcard.showXY(tdlocs);  // �����, ��� ��� TwoD
//        BoundedWildcard.showXYZ(tdlocs); // ������, ��� �� ��� ThreeD
//        BoundedWildcard.showAll(tdlocs); // ������, ��� �� ��� FourD
    }
}

class TwoD {
    int �, �;

    TwoD(int �, int �) {
    }
}

class ThreeD extends TwoD {
    int z;

    public ThreeD(int �, int �, int c) {
        super(�, �);
        this.z = c;
    }
}

class FourD extends ThreeD {
    int t;

    public FourD(int �, int �, int c, int d) {
        super(�, �, c);
        this.t = d;
    }
}

class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] coorsd) {
        this.coords = coorsd;
    }

}

class BoundedWildcard {
    static void showXY(Coords<?> c) {
        System.out.println("Koop���a�� � �: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].� + " " + c.coords[i].�);
        }
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Koop���a�� � � Z: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].� + " " + c.coords[i].� + " " + c.coords[i].z);
        System.out.println();
    }
    static void showAll (Coords<? extends FourD> c) {
        System.out.println("Koop���a�� � � Z T: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].� + " " + c.coords[i].� + " " + c.coords[i].z + c.coords[i].t);
        System.out.println();
    }
}

