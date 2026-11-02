/* W5S2 Tantangan - array bertipe PARENT berisi beragam anak, SATU for-loop, tanpa instanceof. */
public class TantanganArmada {
    public static void main(String[] args) {
        KendaraanEkspedisi[] armada = { new TrukBox("B 9081 TXT", 5000), new MobilVan("B 1122 KAA", 800), new MotorKurir("BK 5555 DEL", 50) };
        for (KendaraanEkspedisi k : armada) { k.infoKendaraan(); k.angkutBarang("Paket"); } // dynamic binding memilih versi anak
    }
}
abstract class KendaraanEkspedisi {
    protected String noPolisi; protected int kapasitasKg;
    KendaraanEkspedisi(String n, int k) { noPolisi = n; kapasitasKg = k; }
    void infoKendaraan() { System.out.println("Plat: " + noPolisi + " | " + kapasitasKg + " Kg"); }
    abstract void angkutBarang(String namaBarang);
}
class TrukBox extends KendaraanEkspedisi { TrukBox(String n, int k) { super(n, k); } void angkutBarang(String b) { System.out.println("Truk memuat " + b + " di kontainer"); } }
class MobilVan extends KendaraanEkspedisi { MobilVan(String n, int k) { super(n, k); } void angkutBarang(String b) { System.out.println("Van memuat " + b + " di bagasi"); } }
class MotorKurir extends KendaraanEkspedisi { MotorKurir(String n, int k) { super(n, k); } void angkutBarang(String b) { System.out.println("Motor membawa " + b + " di box"); } }
