/* Penamaan Variabel 
- Case-sensitive (besar kecil huruf dari nama variabel → berbeda).
- Nama harus mulai dengan huruf (tidak boleh mulai dengan angka atau simbol).
- Hindari $ dan _, kecuali dalam kasus tertentu.
- Tidak boleh pakai keyword Java (class, int, if, dll.).
- Gunakan nama yang jelas & mudah dipahami (totalNilai, bukan tn).
- Gunakan final untuk konstanta.
    Konvensi: Contoh:
    Variabel → camelCase (totalGaji, rataNilai).
    Konstanta → UPPER_CASE dengan _ (MAX_SIZE, PI).
*/
contoh :int umur = 20;
        double gaji = 3500000.50
        boolean lulus = true;
        String nama = "Budi";

// Class adalah cetak biru (blueprint) untuk membuat objek
// Di dalamnya terdapat variabel(yang disebut atribut/field) dan fungsi yang disebut method        
// Tipe data class termasuk tipe data non-primitive (yang menyimpan alamat/memori)
class Demo {
    int a, b;
    Demo(int a, int b) { this.a = a; this.b = b; }
    int addition() { return a + b; }
}
// String adalah objek khusus untuk teks (bukan primitive).
 String s1 = "Hello";
 String s2 = new String("Java");

 // Array adalah koleksi elemen bertipe sama , diakses via indeks
 int[] arr = {1, 2, 3};
 double[] arr2 = {1.1, 2.2};