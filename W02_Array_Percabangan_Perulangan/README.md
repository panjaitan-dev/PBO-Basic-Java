# W02 - Latihan Variabel/Operator (Sesi2) + Array/If/Loop (Sesi3)
Nama file = nama yang diminta soal (DataDiri.java, GradeSystem.java, dst) -> siap zip: NIM_Nama_Sesi2.zip / NIM_Nama_Sesi3.zip.
Jalankan: `cd Sesi2 && java Kalkulator.java`

## Sesi2 (Variabel, Tipe Data, Operator, Input/Output)
| File | Konsep | KAPAN |
|---|---|---|
| DataDiri | tipe data + casting double->int | simpan identitas |
| Kalkulator | (double) a / b, % , Math.pow, cek bagi 0 | int/int membuang desimal; bagi 0 int -> ArithmeticException |
| Lingkaran | final PI, validasi r<0 | validasi input sebelum hitung |
| OperasiString | length, charAt, contains | analisis teks |
| HitungRataNilai | rata-rata 3 nilai, format %.2f | |
| BagiPangkat | % dan Math.pow | |
| GanjilGenap | n % 2 | |
| KonversiSuhu | rumus C<->F, 9.0/5 (bukan 9/5!) | |
| LoginSederhana | equals, matches regex angka | |
| KasirSederhana | diskon 10% jika >= 100000 | |
| Palindrome | reverse + hitung vokal (challenge) | |

## Sesi3 (Array, Percabangan, Perulangan)
| File | Konsep | KAPAN |
|---|---|---|
| GradeSystem | array double[], max/min/rata, else-if grade | statistik array |
| NumberSeries | Fibonacci, bilangan prima (sampai sqrt) | loop + break |
| LoginSystem | max 3 percobaan, validasi panjang + angka | loop dengan counter |
| ShoppingCart | menu do-while + switch, array + hapus geser | CRUD sederhana pakai array |
| TimeConverter | detik<->HH:MM:SS, / dan %, split(":") | |
| KartuKredit | regex 16 digit, awal 4/5/6, tanda hubung | validasi pola |

Jawaban pertanyaan pemantik:
- Nilai di luar 0-100 pada GradeSystem asli: tetap diterima (tidak ada validasi) -> hasil salah; solusi: loop ulang sampai valid (lihat GradeSystem.java).
- Jumlah nilai dinamis: tanya n dulu lalu `new double[n]`, atau pakai ArrayList.
- Fibonacci besar: pakai long/BigInteger, iteratif (bukan rekursi), atau memoization.
- Bagi int perlu cast double agar 12/5 = 2.4 bukan 2. Pembagi 0: int -> ArithmeticException; double -> Infinity.
- Validasi r<0: jari-jari negatif tidak bermakna fisik.
