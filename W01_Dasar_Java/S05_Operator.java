/* W01 - S05_Operator. KAPAN: hitung (+ - * / %), bandingkan (== != < >), gabung syarat (&& || !). */
public class S05_Operator {
    public static void main(String[] args) {
        int a = 7, b = 3;
        System.out.println(a + b + " " + (a - b) + " " + a * b + " " + a / b + " " + a % b); // % = sisa bagi
        int x = 5; x += 3; x *= 2;                 // compound assignment -> 16
        System.out.println(x + " " + x++ + " " + ++x + " " + (-x)); // post vs pre increment
        System.out.println((a > b) + " " + (a == b) + " " + (a != b));
        boolean ok = a > 5 && b < 5 || !(a == 7);  // && lebih tinggi dari ||
        System.out.println(ok);
        System.out.println((a > b) ? "a besar" : "b besar"); // ternary
        System.out.println((5 & 3) + " " + (5 | 3) + " " + (5 ^ 3) + " " + (~5) + " " + (5 << 1) + " " + (20 >> 2)); // bitwise
        System.out.println(Math.pow(2, 10) + " " + Math.sqrt(16) + " " + Math.max(3, 9) + " " + Math.abs(-4));
    }
}
