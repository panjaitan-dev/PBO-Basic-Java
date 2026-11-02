import java.time.LocalTime;
import java.time.format.DateTimeParseException;
/** Studio bioskop: encapsulation + validasi lewat exception. */
public class Studio {
    private final String nama;
    private final boolean[] kursiTerisi;                // true = sudah dipesan
    private boolean buka = false;
    private LocalTime jamTayang;

    public Studio(String nama, int jumlahKursi) { this.nama = nama; this.kursiTerisi = new boolean[jumlahKursi]; }

    public void bukaStudio() { buka = true; }
    public void tutupStudio() { buka = false; }
    public String getNama() { return nama; }

    /** Atur jam tayang dari teks "HH:mm". Format salah -> DateTimeParseException (unchecked) ditangani di sini. */
    public void aturJamTayang(String teks) {
        try {
            jamTayang = LocalTime.parse(teks);          // bisa melempar DateTimeParseException
            System.out.println("[INFO] Jam tayang " + nama + " = " + jamTayang);
        } catch (DateTimeParseException e) {
            System.out.println("[ERROR] Format jam salah '" + teks + "'. Gunakan HH:mm (contoh 19:30)");
        }
    }

    /** throws: method ini tidak menangani KursiTidakTersediaException, tapi meneruskannya ke pemanggil. */
    public void pesanKursi(int nomor) throws KursiTidakTersediaException {
        if (!buka) throw new IllegalStateException("Studio " + nama + " sedang tutup"); // throw manual (unchecked)
        if (nomor < 1 || nomor > kursiTerisi.length)
            throw new KursiTidakTersediaException("Kursi " + nomor + " tidak ada di " + nama, nomor);
        if (kursiTerisi[nomor - 1])
            throw new KursiTidakTersediaException("Kursi " + nomor + " sudah dipesan", nomor);
        kursiTerisi[nomor - 1] = true;                  // sukses: ubah state hanya setelah lolos validasi
        System.out.println("[OK] Kursi " + nomor + " berhasil dipesan di " + nama);
    }

    public int hitungKursiKosong() { int k = 0; for (boolean b : kursiTerisi) if (!b) k++; return k; }
}
