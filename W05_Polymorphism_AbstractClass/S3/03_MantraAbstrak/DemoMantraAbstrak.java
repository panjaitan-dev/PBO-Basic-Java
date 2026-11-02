/* W5S3 2.1 - abstract class MantraAbstrak + abstract efek(); Lumos ditambahkan. */
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // MantraAbstrak x = new MantraAbstrak("x");  // ERROR: MantraAbstrak is abstract; cannot be instantiated
        MantraAbstrak[] daftar = { new Expelliarmus(), new ExpectoPatronum(), new Lumos() };
        for (MantraAbstrak m : daftar) { m.ucapkan(); m.efek(); }
    }
}
abstract class MantraAbstrak {
    private String nama;
    public MantraAbstrak(String nama) { this.nama = nama; }
    public abstract void efek();                                   // wajib di-override anak
    public void ucapkan() { System.out.println("Mengucapkan mantra: " + nama); } // konkret
}
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() { super("Expelliarmus"); }
    @Override public void efek() { System.out.println("Efek: Melucuti senjata lawan."); }
}
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() { super("Expecto Patronum"); }
    @Override public void efek() { System.out.println("Efek: Memanggil Patronus untuk melawan Dementor."); }
}
class Lumos extends MantraAbstrak {
    public Lumos() { super("Lumos"); }
    @Override public void efek() { System.out.println("Efek: Menerangi ujung tongkat."); }
}
