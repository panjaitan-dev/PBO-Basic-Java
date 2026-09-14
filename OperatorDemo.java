public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators (Slide 15)
        int sum = 3 + 4;   // 7
        int diff = 10 - 3; // 7
        int prod = 7 * 3;  // 21
        double q = 20.0 / 3; // 6.666...
        int r = 7 % 3;     // 1

        // Unary & Compound Assignment (Slide 16)
        int x = 10;
        x += 5; // x = 15
        double d = 10.0 / 3; // 3.333...
        int i = 10 / 3;     // 3 (truncation)

        // Math utility (Slide 16)
        double p = Math.pow(2, 3); // 8.0
        double s = Math.sqrt(64);   // 8.0

        // Equality, Relational, & Conditional Operators (Slide 17)
        int a = 5;
        boolean ok = (a == 5); // true
        boolean r1 = (5 > 3) && (7 < 10); // true
        boolean r2 = (5 < 3) || (7 < 10); // true
        boolean r3 = !(5 > 3);            // false

        // Bitwise Operators (Slide 18)
        int and = 5 & 3; // 1
        int or = 5 | 3;  // 7
        int xor = 5 ^ 3; // 6
    }
}