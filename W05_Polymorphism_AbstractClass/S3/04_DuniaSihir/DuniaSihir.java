import java.util.ArrayList;
import java.util.List;
/* W5S3 3.1 - Abstract class + polymorphism. Modifikasi: ucapkanSemuaMantra(). */
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        harry.belajarMantra(new Expelliarmus()); harry.belajarMantra(new ExpectoPatronum());
        harry.ucapkanMantra("Expelliarmus"); harry.ucapkanMantra("Lumos");   // belum belajar
        harry.belajarMantra(new Lumos()); harry.ucapkanMantra("Lumos");
        System.out.println("--- ucapkanSemuaMantra ---"); harry.ucapkanSemuaMantra();
    }
}
abstract class Mantra {
    private String nama;
    public Mantra(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    public abstract void efek();
}
class Expelliarmus extends Mantra { public Expelliarmus() { super("Expelliarmus"); } @Override public void efek() { System.out.println("Melucuti senjata lawan!"); } }
class ExpectoPatronum extends Mantra { public ExpectoPatronum() { super("Expecto Patronum"); } @Override public void efek() { System.out.println("Memanggil Patronus!"); } }
class Lumos extends Mantra { public Lumos() { super("Lumos"); } @Override public void efek() { System.out.println("Menerangi ujung tongkat!"); } }
class Penyihir {
    private String nama; private List<Mantra> mantraList = new ArrayList<>();   // tipe ABSTRAK -> bisa isi mantra apa pun
    public Penyihir(String nama) { this.nama = nama; }
    public void belajarMantra(Mantra m) { mantraList.add(m); System.out.println(nama + " belajar mantra: " + m.getNama()); }
    public void ucapkanMantra(String namaMantra) {
        for (Mantra m : mantraList) if (m.getNama().equals(namaMantra)) { System.out.println(nama + " mengucapkan: " + m.getNama()); m.efek(); return; }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
    public void ucapkanSemuaMantra() {
        if (mantraList.isEmpty()) { System.out.println(nama + " belum punya mantra."); return; }
        for (Mantra m : mantraList) { System.out.println(nama + " mengucapkan: " + m.getNama()); m.efek(); } // dynamic binding
    }
}
