import java.util.Scanner;
/* Sesi2 P3 - Luas & keliling lingkaran dengan validasi r negatif. */
public class Lingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double PI = 3.14;              // konstanta
        System.out.print("Masukkan jari-jari: "); double r = in.nextDouble();
        if (r < 0) System.out.println("Error: jari-jari tidak boleh negatif.");
        else {
            System.out.println("Luas: " + PI * r * r);
            System.out.println("Keliling: " + 2 * PI * r);
        }
    }
}
