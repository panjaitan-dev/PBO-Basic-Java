// -Type Casting adalah mengubah nilai dari satu tipe data ke tipe data lain. 
// - Implicit Casting (Otomatis): Konversi dari tipe kecil ke besar (misal int ke double). Sangat aman dan tidak ada data yang hilang.  Explicit Casting (Manual): Konversi dari tipe besar ke kecil (misal double ke int). 
// - Berisiko kehilangan angka di belakang koma (desimal hilang). 

public class CastingDemo {
    public static void main(String[] args) {
        // 1. Implicit (automatic / widening)
        int myInt = 9;
        double myDouble = myInt; // otomatis

        // 2. Explicit (manual / narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // hasil 9, .78 hilang
    }
}