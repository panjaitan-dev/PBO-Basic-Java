// Operator adalah simbol untuk melakukan operasi matematika, perbandingan, atau logika. 
//  Memahami perbedaan antara operator matematika dasar (+, -, *, /, %), increment/decrement (++, --), relasi/kondisional (==, &&, ||), serta operasi bitwise (&, |, ^).

public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators 
        int sum = 3 + 4;   // 7
        int diff = 10 - 3; // 7
        int prod = 7 * 3;  // 21
        double q = 20.0 / 3; // 6.666...
        int r = 7 % 3;     // 1

        // Unary & Compound Assignment 
        int x = 10;
        x += 5; // x = 15
        double d = 10.0 / 3; // 3.333...
        int i = 10 / 3;     // 3 (truncation)

        // Math utility 
        double p = Math.pow(2, 3); // 8.0
        double s = Math.sqrt(64);   // 8.0

        // Equality, Relational, & Conditional Operators 
        int a = 5;
        boolean ok = (a == 5); // true
        boolean r1 = (5 > 3) && (7 < 10); // true
        boolean r2 = (5 < 3) || (7 < 10); // true
        boolean r3 = !(5 > 3);            // false

        // Bitwise Operators 
        int and = 5 & 3; // 1
        int or = 5 | 3;  // 7
        int xor = 5 ^ 3; // 6
    }
}