// Semua kode Bahasa Java ditulis dalam class
// Eksekusi disetiap Program Java ada dalam method main().
/* Nama file = nama class public (HelloWorld.java).
Nama class pakai PascalCase.
main() harus ditulis public static void main(String[ ] args). */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

/*
Gunakan IntelliJ IDEA, simpan file, misalnya HelloWorld.java
Tekan tombol 'Run'
, dan Ya! "Hello, World!" akan muncul pada konsol.
Penguraian eksekusi kode program :
class sebagai kelas yang akan dijalankan,
public static void main(String[] args) sebagai pintu masuk program,
System.out.println sebagai cara untuk mencetak ke konsol.
*/

/*
Variabel: Tempat penyimpanan nilai atau data di dalam memori komputer saat program berjalan. 
Tipe Data: Jenis nilai yang disimpannya. Terdiri dari tipe data primitive untuk penanganan nilai langsung (seperti int, double, boolean, char) dan non-primitive untuk data terstruktur/objek (seperti String, Array, Class, Interface)

Jenis Variabel
Dalam Java, istilah "field" sebagai object dan "variabel" sama-sama digunakan dan sering kali merujuk pada hal yang sama, sehingga membingungkan para pengembang baru. Java mendefinisikan jenis-jenis variabel berikut:
1.Instance Variables (Non-Static Fields) 
  - Milik setiap objek (unik di setiap instance). */
   contoh: int speed; -> tiap objek punya nilai sendiri.
2.Class Variables  (Static Fields)
    -Hanya 1 salinan untuk semua objek dari class tsb
    -Dideklarasikan dengan static */
    -contoh: static int jumlahMahasiswa;
3.Local Variables
    -Dideklarasikan didalam method
    -Hanya bisa diakses dalam method itu aja  */
    -contoh: void hitung() {
    int count = 0; // local variable
    }
4.Parameters
    -Variabel input untuk method/constructor  */
    -contoh:void setNama(String nama) {
    this.nama = nama;
}
