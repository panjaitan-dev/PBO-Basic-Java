/** Exception BUATAN SENDIRI: kursi sudah terisi / nomor kursi di luar studio.
    extends Exception => checked: pemanggil WAJIB try-catch atau throws. */
public class KursiTidakTersediaException extends Exception {
    private final int nomorKursi;                       // info tambahan khusus domain
    public KursiTidakTersediaException(String pesan, int nomorKursi) {
        super(pesan);                                   // teruskan pesan ke Exception
        this.nomorKursi = nomorKursi;
    }
    public int getNomorKursi() { return nomorKursi; }
}
