/* W01 - Variabel & tipe data primitive.
   KAPAN: pilih tipe sesuai data: int (bulat), double (desimal), boolean (benar/salah),
   char (1 huruf), String (teks - bukan primitive). */
public class S02_VariabelTipeData {
    static int counter = 0;      // variabel static (milik class)
    int instanceVar = 10;        // variabel instance (milik objek)

    public static void main(String[] args) {
        int lokal = 5;                         // variabel lokal (hidup di dalam method)
        byte b = 127; short s = 32000; long besar = 10000000000L; // L wajib utk long
        float f = 3.5f; double d = 3.14159;    // f wajib utk float
        char huruf = 'A'; boolean aktif = true;
        String nama = "Andi";
        final double PI = 3.14;                // final = konstanta, tidak bisa diubah
        // Penamaan: camelCase utk variabel, PascalCase utk class, UPPER_CASE utk konstanta
        System.out.println(lokal + " " + b + " " + s + " " + besar + " " + f + " " + d);
        System.out.println(huruf + " " + aktif + " " + nama + " " + PI);
        counter++;
        System.out.println("static counter=" + counter + ", instance=" + new S02_VariabelTipeData().instanceVar);
        System.out.println("Max int = " + Integer.MAX_VALUE);
    }
}
