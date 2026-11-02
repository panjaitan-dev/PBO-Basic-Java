/* W5S2 1.1 - Overloading: hitungOngkir dengan 3 versi parameter. */
public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");
        System.out.println("=== INI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt) : Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0, true));
    }
}
class MesinTarif {
    private String kotaAsal;
    public MesinTarif(String kotaAsal) { this.kotaAsal = kotaAsal; }
    public double hitungOngkir(double beratKg) { return beratKg * 10000; }
    public double hitungOngkir(double beratKg, double nilaiBarang) { return beratKg * 10000 + nilaiBarang * 0.01; } // + asuransi 1%
    public double hitungOngkir(double beratKg, boolean isExpress) { double t = beratKg * 10000; if (isExpress) t += 20000; return t; }
    // public int hitungOngkir(double beratKg) {...}  -> ERROR: hanya beda return type, signature sama
}
