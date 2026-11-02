import java.util.Scanner;
/* W01 - Gabungan: input angka, tentukan ganjil/genap dan jumlah 1..n. Pola soal dasar ujian. */
public class S09_MiniImplementasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: "); int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) total += i;
        System.out.println("Jumlah 1.." + n + " = " + total);
        System.out.println(n + (n % 2 == 0 ? " genap" : " ganjil"));
    }
}
