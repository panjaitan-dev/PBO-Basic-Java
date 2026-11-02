/* W01 - if / else if / else / switch.
   KAPAN: if untuk rentang/kondisi kompleks; switch untuk pilihan nilai tetap (menu, hari). */
public class S06_Percabangan {
    public static void main(String[] args) {
        int nilai = 78;
        if (nilai >= 85) System.out.println("A");
        else if (nilai >= 70) System.out.println("B");   // urutan kondisi penting!
        else if (nilai >= 60) System.out.println("C");
        else System.out.println("D/E");

        int hari = 3;
        switch (hari) {
            case 1: System.out.println("Senin"); break;  // tanpa break -> jatuh ke case berikut
            case 2: System.out.println("Selasa"); break;
            case 3: System.out.println("Rabu"); break;
            default: System.out.println("Lainnya");
        }
        String h = switch (hari) { case 6, 7 -> "Libur"; default -> "Kerja"; }; // switch expression
        System.out.println(h);
    }
}
