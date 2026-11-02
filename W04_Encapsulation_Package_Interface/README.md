# W04 - Encapsulation, Access Modifier, Package, Interface

| Folder/File | Materi | KAPAN dipakai |
|---|---|---|
| Latihan_Dasar/S01_EncapsulationDasar | private + getter/setter + validasi (Account, Employee, Element read-only) | selalu: field private, validasi di setter; tanpa setter = read-only (NIM, nomor akun) |
| Latihan_Dasar/S02_InterfaceAnimal | interface + implements + referensi interface | beda class tapi satu "kemampuan" (Robot & Bird sama2 bisa move) |
| percobaan_packages | package induk/anakan/main, interface IKendaraan, extends, override | praktikum W04S3 (modul RCH) |
| S3_Latihan | BankAccount, PaymentSystem, StudentGrade, SmartHome | tugas PBO_W4S3 |
| S3_Latihan/vehicle | VehicleRental + Discountable (kelas interaktif) | analisis access modifier & DI |

## Access modifier (hafal!)
| | Sama class | Sama package | Subclass beda package | Dunia |
|---|---|---|---|---|
| public | Y | Y | Y | Y |
| protected | Y | Y | Y | N |
| (default) | Y | Y | N | N |
| private | Y | N | N | N |

## Cara jalankan percobaan_packages
```
cd percobaan_packages/src
javac del/ac/id/induk/*.java del/ac/id/anakan/*.java del/ac/id/main/*.java
java del.ac.id.main.Percobaan_packages
```
Aturan package: baris `package` paling atas; struktur folder = nama package; hanya class public bisa di-import dari package lain.

## Jawaban TUGAS modul (laporan)
1. Kenapa jlhTorsi, faktorPembagi, panjangGagang, rasioGigi + setter/getter tidak ada di IKendaraan?
   Interface = kontrak atribut/perilaku UMUM semua kendaraan (roda, dimensi, spion, warna). Keempat atribut itu khusus Motor & Mobil (Sepeda tidak punya torsi/gigi motor). Kalau dimasukkan ke interface, Sepeda dan semua implementor wajib mengimplementasikannya (melanggar prinsip: interface minimal & kohesif / Interface Segregation) dan perubahan interface memecah semua class. Maka atribut khusus ditaruh di subclass.
2. Semua method Kendaraan jadi protected -> ERROR karena (a) Kendaraan implements IKendaraan: method interface otomatis public, override tidak boleh memperkecil akses ("attempting to assign weaker access privileges; was public"); (b) kalaupun lolos, Percobaan_packages (package del.ac.id.main, bukan subclass) tidak bisa memanggil setDimensiKendaraan() dst karena protected hanya untuk package sama + subclass.
4. Sama untuk Mobil: override method public (kalkulasiPercepatan, cetakInformasi dari IKendaraan) menjadi protected -> weaker access -> compile error; dan dipanggil dari main (package lain) -> tidak terlihat.
5/6. Terapkan inheritance (extends), encapsulation (private + getter/setter), interface (implements) di proyek week 2; tulis rincian di laporan: class mana extends apa, field private mana, interface apa dan alasan.

## Jawaban Kelas Interaktif VehicleRental (S3_Latihan/vehicle)
1.i Baris yang error (TestRental beda package): B `rentalRatePerDay` (protected: TestRental bukan subclass) dan C `discountRate` (default/package-private). Baris A (public field) dan D (public setter) compile OK.
2.i Baris D setRentalDays(-7): setter tidak memvalidasi -> hari negatif diterima. Baris A: public field bisa diisi kosong "".
2.ii Total negatif karena hari/tarif negatif atau diskon > 1. Refactor: semua field private, validasi di constructor & setter (throw IllegalArgumentException), diskon dibatasi 0..1 -> lihat VehicleRentalFixed.
3. Lihat Discountable + getTotalCost(Discountable d) (polimorfisme: objek diskon dikirim saat runtime).
