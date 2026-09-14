public class CastingDemo {
    public static void main(String[] args) {
        // 1. Implicit (automatic / widening)
        int myInt = 9;
        double myDouble = myInt; // otomatis

        // 2. Explicit (manual / narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // hasil 9, .78 hilang
    }
}