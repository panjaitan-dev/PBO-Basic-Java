# W05 - Polymorphism & Abstract Class
Tiap latihan di SUBFOLDER sendiri karena nama class bentrok (Mantra, Expelliarmus ada di beberapa latihan).
Jalankan: `cd S2/01_Overloading && java SimulasiOverloading.java`
Saat zip tugas (PBO_W5S2_NIM.zip / PBO_W5S3_NIM.zip) gabungkan file .java sesuai soal; kalau satu project IDE, pisahkan per package.

## Konsep & KAPAN dipakai
| Konsep | Ciri | KAPAN |
|---|---|---|
| Overloading (compile-time) | nama sama, PARAMETER beda (jumlah/tipe/urutan), satu class | satu aksi, beda input (hitungOngkir biasa/asuransi/express) |
| Overriding (runtime) | nama + parameter + return sama, beda class (parent-child), @Override | anak mengubah perilaku induk; dasar polymorphism |
| Abstract class | `abstract class`, boleh field/constructor/method konkret + abstract method (tanpa body) | induk yang tak boleh di-`new`, memaksa anak mengisi method tertentu, tapi berbagi kode |
| Interface | kontrak murni, implements banyak | kemampuan lintas hierarki |
| Polymorphism | `Parent p = new Child(); p.method()` -> versi Child jalan | array/list parent berisi beragam anak, 1 loop |

## Jawaban lembar analisis
S2 Overloading
- Compiler memilih method dari SIGNATURE: nama + jumlah + tipe + urutan parameter.
- `int hitungOngkir(double)` ditolak: return type BUKAN bagian signature -> duplikat method (already defined).
S2 Overriding
- @Override dihapus + nama diganti `kirimbarang`: bukan override, tapi method BARU. `k2.kirimBarang(...)` memanggil versi induk -> output "lewat jalur darat" (tidak ada error!).
- @Override dikembalikan: compile error `method does not override or implement a method from a supertype`.
- Fungsi @Override: minta compiler memastikan benar-benar meng-override; menangkap typo/salah signature saat compile, bukan diam-diam jadi method baru.
S2 Abstraksi
- `new KendaraanEkspedisi(...)` -> `KendaraanEkspedisi is abstract; cannot be instantiated`. Konsep belum nyata, hanya cetak biru.
- MotorKurir tanpa angkutBarang(): IDE menawarkan (1) "Implement all abstract methods" (2) "Make class MotorKurir abstract".
S3 Mantra Overloading
- Hapus salah satu overload: pemanggilan dengan jumlah/tipe argumen itu error "no suitable method". Urutan parameter berbeda `(int, String)` BOLEH (signature beda), asal tidak ambigu.
S3 Penyihir: tanpa @Override tetap jalan (kalau signature benar); untungnya polymorphism = kode pemanggil sama, perilaku sesuai objek, mudah tambah penyihir baru.
S3 MantraAbstrak: `new MantraAbstrak("x")` error abstract. Keuntungan abstract: paksa semua mantra punya efek(), berbagi nama/ucapkan().
S3 DuniaSihir: Penyihir menyimpan List<Mantra> (tipe abstrak), memanggil efek() -> versi mantra asli (polymorphism). Mantra baru = class baru extends Mantra, Penyihir TIDAK diubah (Open-Closed Principle).
