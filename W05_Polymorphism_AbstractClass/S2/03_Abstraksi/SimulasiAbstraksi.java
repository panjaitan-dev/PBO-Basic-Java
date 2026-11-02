/* W5S2 2.1 - Abstract class KendaraanEkspedisi. new KendaraanEkspedisi(..) = ERROR. */
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100); // ERROR: is abstract; cannot be instantiated
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000); fuso.infoKendaraan(); fuso.angkutBarang("20 Unit Kulkas");
        System.out.println("---------------------------------");
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800); grandmax.infoKendaraan(); grandmax.angkutBarang("50 Kotak Sepatu");
        System.out.println("---------------------------------");
        new MotorKurir("BK 5555 DEL", 50).angkutBarang("Dokumen");
    }
}
abstract class KendaraanEkspedisi {
    protected String noPolisi; protected int kapasitasKg;
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) { this.noPolisi = noPolisi; this.kapasitasKg = kapasitasKg; }
    public void infoKendaraan() { System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg"); } // method konkret
    public abstract void angkutBarang(String namaBarang);        // abstract: wajib diisi anak
}
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String n, int k) { super(n, k); }
    @Override public void angkutBarang(String b) { System.out.println("Truk [" + noPolisi + "] memuat '" + b + "' ke dalam kontainer tertutup pendingin."); }
}
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String n, int k) { super(n, k); }
    @Override public void angkutBarang(String b) { System.out.println("Mobil Van [" + noPolisi + "] memuat '" + b + "' di bagasi belakang untuk distribusi kota."); }
}
/* Eksperimen 2: kalau angkutBarang() tidak ditulis -> error "MotorKurir is not abstract and does not override abstract method".
   Opsi perbaikan IDE: (1) Implement all abstract methods  (2) Make class MotorKurir abstract. Di sini dipilih opsi 1. */
class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String n, int k) { super(n, k); }
    @Override public void angkutBarang(String b) { System.out.println("Motor [" + noPolisi + "] membawa '" + b + "' di box belakang."); }
}
