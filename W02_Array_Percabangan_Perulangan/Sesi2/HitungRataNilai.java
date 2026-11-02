import java.util.Scanner;
/* Latihan 1 - rata-rata 3 nilai. */
public class HitungRataNilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 3; i++) { System.out.print("Masukkan nilai " + i + ": "); total += in.nextDouble(); }
        System.out.printf("Rata-rata: %.2f%n", total / 3);
    }
}
