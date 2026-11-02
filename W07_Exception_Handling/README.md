# W07 - Exception Handling
| Keyword | Fungsi | KAPAN |
|---|---|---|
| try | blok kode berisiko | bungkus kode yang bisa error (input, file, bagi, index) |
| catch | tangani exception cocok; URUT spesifik -> umum | pulihkan / beri pesan |
| finally | SELALU jalan (kecuali System.exit) | tutup resource, log selesai |
| throw | lempar manual `throw new X("pesan")` | aturan bisnis dilanggar (umur<0, kursi penuh) |
| throws | deklarasi method: "bisa melempar X" (checked) | method tidak menangani, oper ke pemanggil |
| custom exception | `class X extends Exception` + `super(msg)` | error khusus domain; checked. extends RuntimeException = unchecked |

Hierarki: Throwable -> Error (JVM, jangan ditangani) | Exception -> checked (IOException, wajib try/throws) & RuntimeException (unchecked: NPE, Arithmetic, IllegalArgument...)

## S2_Praktikum (PBO_w7s02_NIM.zip) - 9 percobaan, jawaban di komentar tiap file
Jalankan: `cd S2_Praktikum && java UncaughtException.java` (percobaan lain sama).
## S3_Tugas_Bioskop (PBO_W7S3_NIM.zip) - tugas: try, catch, finally, throw, throws + 1 custom exception + driver
Domain: tiket bioskop (BEDA dari bank/perpustakaan agar tidak sama dengan contoh kuliah & teman). Exception yang dipakai:
DateTimeParseException, IllegalStateException (bukan yang ada di slide/praktikum) + KursiTidakTersediaException (custom).
Jalankan: `cd S3_Tugas_Bioskop && javac *.java && java Driver`
Zip: `PBO_W7S3_NIM.zip` lalu upload ke ecourse.del.ac.id.
