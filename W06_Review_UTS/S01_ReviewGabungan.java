/* Review W1-W5: Sistem Gaji Pegawai.
   Interface (Bonusable) + abstract class (Pegawai) + subclass (override) + encapsulation (validasi) + array polimorfik. */
public class S01_ReviewGabungan {
    public static void main(String[] args) {
        Pegawai[] daftar = { new Manajer("Ani", 10000000), new Staf("Budi", 5000000, 20), new Magang("Cici") };
        double total = 0;
        for (Pegawai p : daftar) {                    // polymorphism: 1 loop untuk semua jenis
            System.out.printf("%-6s | %-8s | gaji: %,.0f%n", p.getNama(), p.getClass().getSimpleName(), p.hitungGaji());
            if (p instanceof Bonusable) System.out.println("       bonus: " + ((Bonusable) p).hitungBonus()); // cek kemampuan interface
            total += p.hitungGaji();
        }
        System.out.printf("Total gaji: %,.0f%n", total);
        daftar[0].setGajiPokok(-5);                   // validasi: ditolak
    }
}
interface Bonusable { double hitungBonus(); }          // kemampuan: tidak semua pegawai dapat bonus
abstract class Pegawai {
    private final String nama; private double gajiPokok;
    Pegawai(String nama, double gajiPokok) { this.nama = nama; this.gajiPokok = gajiPokok; }
    public String getNama() { return nama; }
    public double getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(double g) { if (g > 0) gajiPokok = g; else System.out.println("Gaji harus > 0!"); }
    public abstract double hitungGaji();               // tiap jenis menghitung sendiri
}
class Manajer extends Pegawai implements Bonusable {
    Manajer(String n, double g) { super(n, g); }
    @Override public double hitungGaji() { return getGajiPokok() + hitungBonus(); }
    @Override public double hitungBonus() { return getGajiPokok() * 0.2; }
}
class Staf extends Pegawai implements Bonusable {
    private int jamLembur;
    Staf(String n, double g, int jamLembur) { super(n, g); this.jamLembur = jamLembur; }
    @Override public double hitungGaji() { return getGajiPokok() + jamLembur * 50000 + hitungBonus(); }
    @Override public double hitungBonus() { return 250000; }
}
class Magang extends Pegawai {
    Magang(String n) { super(n, 1500000); }
    @Override public double hitungGaji() { return getGajiPokok(); }
}
