/** Layanan pemesanan: memakai try-catch-finally untuk menangani exception dari Studio. */
public class LayananTiket {
    private int totalPercobaan = 0;

    /** Mengembalikan true bila pemesanan sukses. */
    public boolean pesan(Studio studio, int nomorKursi) {
        totalPercobaan++;
        try {
            studio.pesanKursi(nomorKursi);              // bisa lempar checked & unchecked exception
            return true;
        } catch (KursiTidakTersediaException e) {       // checked, spesifik dulu
            System.out.println("[GAGAL] " + e.getMessage() + " (kursi #" + e.getNomorKursi() + ")");
            return false;
        } catch (IllegalStateException e) {             // unchecked
            System.out.println("[GAGAL] " + e.getMessage());
            return false;
        } finally {                                     // selalu jalan, sukses atau gagal
            System.out.println("[LOG] Percobaan ke-" + totalPercobaan + " selesai. Kursi kosong: " + studio.hitungKursiKosong());
        }
    }
    public int getTotalPercobaan() { return totalPercobaan; }
}
