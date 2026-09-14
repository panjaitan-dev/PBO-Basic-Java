# PBO-Basic-Java
Pengenalan Basis Objek,Program Basic Java

# Basic Java Programming (Week 2 Sesi 1)

Repositori ini berisi implementasi kode dan rangkuman materi dasar pemrograman Java berdasarkan modul perkuliahan **Basic Java Programming - Institut Teknologi Del**.

---

## Rangkuman Materi PDF

### 1. Struktur Program & Eksekusi Java
* Semua kode Java wajib ditulis di dalam sebuah `class`.
* Titik awal eksekusi program selalu dimulai dari method `main()` dengan format `public static void main(String[] args)`.
* Penamaan file Java harus sama dengan nama `public class` (menggunakan format PascalCase).
* Perintah `System.out.println()` digunakan untuk mencetak output ke konsol.

### 2. Variabel & Tipe Data
* **Variabel:** Tempat menyimpan data di dalam memori komputer.
* **Tipe Data Primitive:** Menampung nilai langsung. Terdiri dari 8 tipe:
  - Bilangan bulat: `byte` (8-bit), `short` (16-bit), `int` (32-bit), `long` (64-bit).
  - Pecahan/Desimal: `float` (32-bit), `double` (64-bit).
  - Karakter & Logika: `char` (16-bit Unicode), `boolean` (`true`/`false`).
* **Tipe Data Non-Primitive (Reference Types):** Menyimpan alamat memori/referensi. Contohnya `String`, `Array`, `Class`, dan `Interface`.

### 3. Jenis-Jenis Variabel
1. **Instance Variables (Non-Static Fields):** Variabel unik yang dimiliki oleh setiap objek.
2. **Class Variables (Static Fields):** Variabel yang hanya ada 1 salinan untuk seluruh objek dari class tersebut (menggunakan kata kunci `static`).
3. **Local Variables:** Variabel yang dideklarasikan di dalam suatu method dan hanya bisa diakses di dalam method tersebut.
4. **Parameters:** Variabel input yang dilewatkan ke dalam method atau konstruktor.

### 4. Penamaan Variabel (Konvensi & Aturan)
* Bersifat *case-sensitive* (huruf besar dan kecil dibedakan).
* Harus diawali huruf (tidak boleh diawali angka atau simbol).
* Tidak boleh menggunakan *keyword* bawaan Java (seperti `int`, `class`, `if`).
* **Variabel:** Menggunakan penulisan `camelCase` (contoh: `totalGaji`, `rataNilai`).
* **Konstanta:** Menggunakan kata kunci `final` dengan penulisan `UPPER_CASE` (contoh: `MAX_SIZE`, `PI`).

### 5. Array & String
* **Array:** Wadah penyimpanan sekumpulan nilai bertipe sama dengan ukuran tetap. Indeks elemen array dimulai dari `0`. Array multidimensi adalah array di dalam array.
* **String:** Objek khusus untuk mengelola teks yang bersifat *immutable* (nilainya tidak bisa diubah setelah dibuat). Pembandingan isi string wajib menggunakan `.equals()`, bukan `==`.

### 6. Konversi Tipe Data (Type Casting)
* **Implicit Casting (Widening):** Konversi otomatis dari tipe kecil ke besar (misal `int` ke `double`). Aman dan tanpa ada data hilang.
* **Explicit Casting (Narrowing):** Konversi manual dari tipe besar ke kecil (misal `double` ke `int`). Berisiko kehilangan data desimal.

### 7. Operator
* **Aritmatika:** `+`, `-`, `*`, `/`, `%` (sisa bagi).
* **Unary:** `++` (increment), `--` (decrement), `!` (logika complement).
* **Relasi & Logika:** `==`, `!=`, `>`, `<`, `>=`, `<=`, `&&` (AND), `||` (OR).
* **Bitwise:** Operasi bit angka seperti `&` (AND), `|` (OR), `^` (XOR).

### 8. Expression, Statement, & Blocks
* **Expression:** Kombinasi variabel dan operator yang menghasilkan satu nilai.
* **Statement:** Unit perintah lengkap yang diakhiri tanda titik koma `;`.
* **Blocks:** Sekumpulan statement yang dikelompokkan dalam kurung kurawal `{ ... }`.

### 9. Control Statements (Percabangan & Perulangan)
* **Percabangan:** `if`, `if-else`, `if-else-if`, dan `switch` untuk menentukan arah eksekusi logika.
* **Perulangan:** `for`, `enhanced for` (for-each), `while` (cek di awal), dan `do-while` (cek di akhir, minimal 1x eksekusi).
* **Branching:** `break` (keluar loop/switch), `continue` (lompat ke iterasi berikutnya), dan `return` (keluar dari method).

### 10. Input / Output (Scanner)
* Menggunakan `java.util.Scanner` untuk membaca input bertipe biner maupun teks dari konsol pengguna.

---

## Daftar File Program

1. `HelloWorld.java` - Implementasi struktur dasar program Java dan cetak output konsol.
2. `Demo.java` - Penerapan tipe data non-primitive berupa `class`.
3. `Kalkulator.java` - Penerapan tipe data non-primitive berupa `interface` dan implementasinya.
4. `ArrayDemo.java` - Contoh pendeklarasian array 1-dimensi, inisialisasi, dan array multidimensi.
5. `StringDemo.java` - Contoh penggunaan objek String dan method pembanding `.equals()`.
6. `CastingDemo.java` - Contoh konversi tipe data otomatis (implicit) dan manual (explicit).
7. `OperatorDemo.java` - Penggunaan berbagai jenis operator Java (Aritmatika, Logika, Bitwise, Math Utility).
8. `ExpressionStatement.java` - Contoh struktur expression, statement, dan code block.
9. `ControlStatements.java` - Contoh penggunaan struktur kontrol `if-else`, `switch`, loop (`for`, `while`, `do-while`), dan `break`/`continue`.
10. `InputOutputScanner.java` - Pembacaan input pengguna menggunakan `Scanner`.
11. `SimpleImplementation.java` - Studi kasus perhitungan nilai rata-rata array menggunakan *enhanced for loop* dan *type casting*.