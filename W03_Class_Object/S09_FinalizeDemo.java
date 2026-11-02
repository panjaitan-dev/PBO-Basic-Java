/* W03 - finalize(): DEPRECATED sejak Java 9, tidak dijamin dipanggil. Jangan dipakai di ujian modern.
   Gantinya: AutoCloseable + try-with-resources (close() selalu dipanggil). */
public class S09_FinalizeDemo {
    public static void main(String[] args) {
        try (Koneksi k = new Koneksi()) { k.kirim("data"); }   // close() otomatis, meski exception
        System.out.println("selesai");
    }
}
class Koneksi implements AutoCloseable {
    Koneksi() { System.out.println("buka koneksi"); }
    void kirim(String s) { System.out.println("kirim " + s); }
    @Override public void close() { System.out.println("tutup koneksi"); }
}
