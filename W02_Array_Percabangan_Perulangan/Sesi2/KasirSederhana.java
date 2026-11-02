import java.util.Scanner;
/* Latihan 6 - total belanja, diskon 10% jika total >= 100000. */
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama barang: "); String nama = in.nextLine();
        System.out.print("Masukkan harga barang: "); double harga = in.nextDouble();
        System.out.print("Masukkan jumlah beli: "); int jml = in.nextInt();
        double total = harga * jml, diskon = total >= 100000 ? total * 0.10 : 0;
        System.out.printf("Total sebelum diskon: %.0f%nDiskon: %.0f%nTotal bayar: %.0f%n", total, diskon, total - diskon);
    }
}
