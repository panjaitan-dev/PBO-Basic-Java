# W03 - Class, Object & kelas java.lang.Object
(Isi PDF W3S2/W3S3 tidak terbaca di konteks saya; file ini mengikuti struktur source temanmu: Class, clone, Deserialization, equals, finalize, getClass, hashCode, toString, anonymous, reflection, inisiasi.)
Jalankan: `java S02_ToStringEqualsHashCode.java`

| File | Materi | KAPAN dipakai |
|---|---|---|
| S01_ClassDanObjek | class, field, constructor, this, static, overloading constructor | modelkan benda nyata (Mahasiswa, Akun) |
| S02_ToStringEqualsHashCode | override toString/equals/hashCode | cetak objek rapi; bandingkan ISI objek (bukan alamat); wajib berpasangan equals+hashCode (HashMap/HashSet) |
| S03_GetClassDemo | getClass(), getName() | tahu tipe asli objek saat runtime |
| S04_CloneDemo | Cloneable, clone() shallow vs deep | salin objek tanpa berbagi referensi |
| S05_SerializationDemo | Serializable, transient | simpan objek ke file/byte, kirim lewat jaringan |
| S06_ReflectionDemo | Class, getDeclaredFields/Methods | inspeksi class saat runtime (framework) |
| S07_AnonymousObject | new X().method() tanpa variabel | objek dipakai sekali |
| S08_Inisiasi | urutan: static block, field, init block, constructor | soal tebak output urutan eksekusi |
| S09_FinalizeDemo | finalize() (deprecated) vs close() | bersihkan resource: pakai try-with-resources |
