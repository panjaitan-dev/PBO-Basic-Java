/*
 Array diibaratkan wadah (container) untuk
menyimpan sekumpulan nilai bertipe sama.
Ukuran array ditentukan saat dibuat dan
tidak bisa diubah.
Elemen array diakses dengan indeks yang
dimulai dari 0.

Deklarasi Array
// deklarasi array integerint[] anArray;
Bentuk umum: tipe[] namaArray;
Bracket [] sebaiknya ditulis setelah tipe data
(standar Java).
 */

public class ArrayDemo {
    public static void main(String[] args) {
        // Deklarasi & Inisialisasi 
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;

        // Shortcut Inisialisasi & Akses Elemen 
        int[] anArrayShortcut = {100, 200, 300, 400};
        // Akses Elemen Array
            -Gunakan loop (for/for-each) untuk
            mengakses semua elemen.
           - Gunakan .length untuk mengetahui
            ukuran array.
        System.out.println(anArrayShortcut[0]); // 100
        System.out.println(anArrayShortcut[1]); // 200

        // Array Multidimensi 
        - Array di dalam array (String[][]).
        -Setiap baris bisa memiliki panjang berbeda.
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names[0][2] + names[1][1]); // Ms. Jones
    }
}