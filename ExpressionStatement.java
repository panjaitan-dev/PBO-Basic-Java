public class ExpressionStatement {
    public static void main(String[] args) {
        // Expression (Slide 19)
        int result = 1 + 2; // menghasilkan int
        if (a == b) System.out.println("Sama"); // *catatan: a dan b sesuai potongan slide

        // Statement (Slide 20)
        double aValue = 8933.234; // assignment & declaration
        aValue++;                 // increment
        System.out.println(aValue); // method call
        // new Bicycle();         // object creation (potongan dari slide)

        // Block (Slide 21)
        boolean condition = true;
        if (condition) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}