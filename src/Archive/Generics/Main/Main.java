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
        System.out.println("Coдepжимoe объекта tdlocs. " ) ;
        BoundedWildcard.showXY(tdlocs);  // Верно, это тип TwoD
//        BoundedWildcard.showXYZ(tdlocs); // Ошибка, это не тип ThreeD
//        BoundedWildcard.showAll(tdlocs); // Ошибка, это не тип FourD
    }
}

class TwoD {
    int х, у;

    TwoD(int а, int Ь) {
    }
}

class ThreeD extends TwoD {
    int z;

    public ThreeD(int а, int Ь, int c) {
        super(а, Ь);
        this.z = c;
    }
}

class FourD extends ThreeD {
    int t;

    public FourD(int а, int Ь, int c, int d) {
        super(а, Ь, c);
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
        System.out.println("Koopдинaты Х У: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].х + " " + c.coords[i].у);
        }
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Koopдинaты Х У Z: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].х + " " + c.coords[i].у + " " + c.coords[i].z);
        System.out.println();
    }
    static void showAll (Coords<? extends FourD> c) {
        System.out.println("Koopдинaты Х У Z T: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].х + " " + c.coords[i].у + " " + c.coords[i].z + c.coords[i].t);
        System.out.println();
    }
}

