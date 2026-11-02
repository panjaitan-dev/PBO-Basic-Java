/* W5S2 1.2 - Overriding: satu perintah kirimBarang(), beda perilaku per objek (runtime polymorphism). */
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");   // tipe variabel Reguler, objek asli Drone
        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");                  // JVM pilih versi Drone saat runtime
    }
}
class KurirReguler {
    protected String nama;
    public KurirReguler(String nama) { this.nama = nama; }
    public void kirimBarang(String alamat) { System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan."); }
}
class KurirDrone extends KurirReguler {
    private String idDrone;
    public KurirDrone(String nama, String idDrone) { super(nama); this.idDrone = idDrone; }
    @Override   // Eksperimen: hapus ini + ubah nama jadi kirimbarang -> jadi method baru, output "jalur darat"
    public void kirimBarang(String alamat) { System.out.println("Unit Drone [" + idDrone + "] operator " + nama + " terbang mengantar paket langsung ke koordinat: " + alamat); }
}
