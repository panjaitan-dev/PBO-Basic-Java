import java.util.Scanner;
/* Sesi3 P2 - Fibonacci n suku & cek prima. Prima: cukup cek pembagi sampai akar n. */
public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret Fibonacci: "); int n = sc.nextInt();
        long a = 0, b = 1;                                   // long agar tahan angka besar
        System.out.println("Deret Fibonacci:");
        for (int i = 0; i < n; i++) { System.out.print(a + " "); long next = a + b; a = b; b = next; }
        System.out.println();
        System.out.print("Masukkan bilangan untuk dicek prima: "); int num = sc.nextInt();
        boolean prima = num > 1;
        for (int i = 2; i <= Math.sqrt(num) && prima; i++) if (num % i == 0) prima = false;
        System.out.println(num + (prima ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
}
