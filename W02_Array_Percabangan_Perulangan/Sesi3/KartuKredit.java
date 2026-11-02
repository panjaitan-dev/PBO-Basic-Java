import java.util.Scanner;
/* Sesi3 Challenge - validasi kartu: 16 digit, awal 4/5/6, tanda hubung tiap 4 digit boleh. */
public class KartuKredit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor kartu: "); String k = sc.nextLine().trim();
        if (!k.matches("[456]\\d{3}(-?\\d{4}){3}")) {
            System.out.println("Nomor kartu tidak valid!");
            if (!k.matches("[456].*")) System.out.println("Harus dimulai dengan 4, 5, atau 6.");
            else System.out.println("Harus 16 digit (boleh tanda hubung tiap 4 digit).");
        } else System.out.println("Nomor kartu valid.");
    }
}
