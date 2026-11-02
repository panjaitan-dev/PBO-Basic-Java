import java.util.Scanner;
/* Sesi3 L2 - daftar belanja pakai ARRAY + loop. Hapus = geser elemen ke kiri. */
public class ShoppingCart {
    static String[] items = new String[10]; static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int pil;
        do {
            System.out.println("=== Daftar Belanja ===\n1. Tambah item\n2. Hapus item\n3. Tampilkan semua item\n4. Cari item\n5. Keluar");
            System.out.print("Pilihan: "); pil = Integer.parseInt(sc.nextLine());
            switch (pil) {
                case 1: if (count == items.length) { System.out.println("Daftar penuh!"); break; }
                        System.out.print("Masukkan item: "); items[count++] = sc.nextLine();
                        System.out.println(items[count - 1] + " berhasil ditambahkan!"); break;
                case 2: System.out.print("Hapus item pada posisi: "); int pos = Integer.parseInt(sc.nextLine());
                        if (pos < 1 || pos > count) { System.out.println("Posisi tidak valid!"); break; }
                        String del = items[pos - 1];
                        for (int i = pos - 1; i < count - 1; i++) items[i] = items[i + 1]; // geser
                        items[--count] = null; System.out.println(del + " berhasil dihapus!"); break;
                case 3: if (count == 0) System.out.println("Daftar kosong.");
                        else { System.out.println("Daftar belanja:"); for (int i = 0; i < count; i++) System.out.println((i + 1) + ". " + items[i]); } break;
                case 4: System.out.print("Cari item: "); String c = sc.nextLine(); int idx = -1;
                        for (int i = 0; i < count; i++) if (items[i].equalsIgnoreCase(c)) { idx = i; break; }
                        System.out.println(idx >= 0 ? c + " ditemukan pada posisi " + (idx + 1) : c + " tidak ditemukan"); break;
                case 5: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pil != 5);
    }
}
