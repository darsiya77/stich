public class Vozrast {
    public static byte getAgeDiff(byte age1, byte age2) {

        return (byte) Math.abs(age1 - age2);
    }

    public static void main(String[] args) {
        byte a = 4;
        byte b = 11;
        byte c = (byte) Math.abs(a - b);
        System.out.println(c);
        System.out.println("_________");
        System.out.println(getAgeDiff((byte) 34, (byte)4));
    }
}
