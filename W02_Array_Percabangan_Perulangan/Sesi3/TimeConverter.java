import java.util.Scanner;
/* Sesi3 L3 - detik <-> HH:MM:SS. jam = d/3600, menit = (d%3600)/60, detik = d%60. */
public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Konverter Waktu ===\n1. Detik ke HH:MM:SS\n2. HH:MM:SS ke detik");
        System.out.print("Pilihan: "); int p = Integer.parseInt(sc.nextLine());
        if (p == 1) { System.out.print("Masukkan jumlah detik: "); int d = Integer.parseInt(sc.nextLine());
            System.out.printf("Hasil: %02d:%02d:%02d%n", d / 3600, (d % 3600) / 60, d % 60); }
        else { System.out.print("Masukkan waktu (HH:MM:SS): "); String[] t = sc.nextLine().split(":");
            System.out.println("Hasil: " + (Integer.parseInt(t[0]) * 3600 + Integer.parseInt(t[1]) * 60 + Integer.parseInt(t[2])) + " detik"); }
    }
}
