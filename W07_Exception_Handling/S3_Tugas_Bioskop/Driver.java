/** Driver: menginstansiasi semua kelas dan memanggil semua method. */
public class Driver {
    public static void main(String[] args) {
        Studio studio = new Studio("Studio 1", 3);
        LayananTiket layanan = new LayananTiket();

        System.out.println("--- 1. Studio masih tutup (IllegalStateException) ---");
        layanan.pesan(studio, 1);

        studio.bukaStudio();
        System.out.println("--- 2. Pesan normal ---");
        layanan.pesan(studio, 1);
        System.out.println("--- 3. Kursi sudah dipesan (custom exception) ---");
        layanan.pesan(studio, 1);
        System.out.println("--- 4. Nomor kursi tidak ada (custom exception) ---");
        layanan.pesan(studio, 9);

        System.out.println("--- 5. Jam tayang valid & tidak valid (DateTimeParseException) ---");
        studio.aturJamTayang("19:30");
        studio.aturJamTayang("sembilan malam");

        System.out.println("--- 6. Pemanggil langsung pesanKursi: wajib try-catch karena throws ---");
        try { studio.pesanKursi(2); studio.pesanKursi(2); }
        catch (KursiTidakTersediaException e) { System.out.println("[Driver] " + e.getMessage()); }
        finally { studio.tutupStudio(); System.out.println("[Driver] Studio " + studio.getNama() + " ditutup"); }
        System.out.println("Total percobaan lewat layanan: " + layanan.getTotalPercobaan());
    }
}
