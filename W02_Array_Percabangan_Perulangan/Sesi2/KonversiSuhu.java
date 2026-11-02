import java.util.Scanner;
/* Latihan 4 - Celsius <-> Fahrenheit. JEBAKAN: 9/5 di int = 1, pakai 9.0/5. */
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1) C->F  2) F->C : "); int p = in.nextInt();
        if (p == 1) { System.out.print("Masukkan suhu dalam Celsius: "); double c = in.nextDouble();
            System.out.printf("%.1f C = %.1f F%n", c, c * 9.0 / 5 + 32); }
        else { System.out.print("Masukkan suhu dalam Fahrenheit: "); double f = in.nextDouble();
            System.out.printf("%.1f F = %.2f C%n", f, (f - 32) * 5.0 / 9); }
    }
}
