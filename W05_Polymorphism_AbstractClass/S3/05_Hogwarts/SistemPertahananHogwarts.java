import java.util.ArrayList;
import java.util.List;
/* W5S3 Tantangan - hierarki MantraPerlindungan (abstract) + SistemPertahanan menampung banyak mantra. */
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan();
        hogwarts.tambahMantra(new Protego());
        hogwarts.tambahMantra(new Fidelius("Peter Pettigrew"));
        hogwarts.tambahMantra(new MantraAntiApparition("Seluruh Area Hogwarts"));
        hogwarts.aktifkanSemuaMantra();
        System.out.println("-------");
        hogwarts.nonaktifkanSemuaMantra();
    }
}
abstract class MantraPerlindungan {
    protected boolean aktif = false;
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}
class Protego extends MantraPerlindungan {
    @Override public void aktifkan() { aktif = true; System.out.println("Perisai Protego terbentuk!"); }
    @Override public void nonaktifkan() { aktif = false; System.out.println("Perisai Protego menghilang."); }
}
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;
    Fidelius(String secretKeeper) { this.secretKeeper = secretKeeper; }          // butuh penyihir secret keeper
    @Override public void aktifkan() { aktif = true; System.out.println("Fidelius aktif. Secret keeper: " + secretKeeper); }
    @Override public void nonaktifkan() { aktif = false; System.out.println("Fidelius dicabut oleh " + secretKeeper); }
}
class MantraAntiApparition extends MantraPerlindungan {
    private String area;
    MantraAntiApparition(String area) { this.area = area; }
    @Override public void aktifkan() { aktif = true; System.out.println("Anti-Apparition aktif di: " + area); }
    @Override public void nonaktifkan() { aktif = false; System.out.println("Anti-Apparition nonaktif di: " + area); }
}
class SistemPertahanan {
    private List<MantraPerlindungan> daftar = new ArrayList<>();
    public void tambahMantra(MantraPerlindungan m) { daftar.add(m); }
    public void aktifkanSemuaMantra() { for (MantraPerlindungan m : daftar) m.aktifkan(); }
    public void nonaktifkanSemuaMantra() { for (MantraPerlindungan m : daftar) m.nonaktifkan(); }
}
