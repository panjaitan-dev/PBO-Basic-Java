/* W03 - Class & Object. Class = cetak biru, object = hasil new. */
public class S01_ClassDanObjek {
    public static void main(String[] args) {
        Mahasiswa a = new Mahasiswa("11425001", "Marsha", 3.8);
        Mahasiswa b = new Mahasiswa("11425002");     // constructor overload
        a.tampil(); b.tampil();
        System.out.println("Jumlah mahasiswa (static): " + Mahasiswa.jumlah); // dipanggil lewat NAMA CLASS
        Mahasiswa c = a;                              // c & a menunjuk objek SAMA (referensi)
        c.ipk = 4.0; System.out.println("a.ipk jadi " + a.ipk);
    }
}
class Mahasiswa {
    static int jumlah = 0;           // milik class, dibagi semua objek
    String nim, nama; double ipk;    // milik tiap objek
    Mahasiswa(String nim, String nama, double ipk) { this.nim = nim; this.nama = nama; this.ipk = ipk; jumlah++; } // this = objek ini
    Mahasiswa(String nim) { this(nim, "Tanpa Nama", 0.0); } // this(...) = panggil constructor lain
    void tampil() { System.out.println(nim + " | " + nama + " | " + ipk); }
}
