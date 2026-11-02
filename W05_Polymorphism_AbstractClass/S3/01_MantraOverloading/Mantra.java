/* W5S3 1.1 - Overloading ucapkan(): 1, 2, 3 parameter + tambahan (nama,target) & urutan beda (int,String). */
public class Mantra {
    public void ucapkan(String namaMantra) { System.out.println("Mengucapkan mantra: " + namaMantra); }
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        System.out.println(kekuatan > 10 ? "Efek: Lawan terlempar!" : "Efek: Senjata terlepas.");
    }
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        System.out.println(kekuatan > 10 ? "Efek: " + target + " terlempar!" : "Efek: Senjata " + target + " terlepas.");
    }
    public void ucapkan(String namaMantra, String target) {          // TAMBAHAN soal: tanpa kekuatan
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: " + target + " terkena " + namaMantra + "!");
    }
    public void ucapkan(int kekuatan, String namaMantra) {           // urutan beda -> sah (signature beda)
        System.out.println("[urutan terbalik] " + namaMantra + " kekuatan " + kekuatan);
    }
    public static void main(String[] args) {
        Mantra m = new Mantra();
        m.ucapkan("Expelliarmus"); m.ucapkan("Expelliarmus", 5); m.ucapkan("Expelliarmus", 15, "Voldemort");
        m.ucapkan("Expelliarmus", "Draco"); m.ucapkan(20, "Stupefy");
    }
}
