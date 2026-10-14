 * JAWABAN PERTANYAAN BAGIAN 3.1:
 * 1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
 *    Jawab: Abstract class Mantra mendefinisikan interface umum (efek()), sedangkan 
 *           polymorphism memungkinkan List<Mantra> menyimpan berbagai jenis subclass 
 *           Mantra. Saat method efek() dipanggil, Java mengeksekusi implementasi spesifik 
 *           sesuai jenis objek aslinya secara dinamis.
 * 
 * 2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? 
 *    Apakah mudah? Mengapa?
 *    Jawab: Sangat mudah. Kita hanya perlu membuat subclass baru dari Mantra. Kelas Penyihir 
 *           tidak perlu diubah sama sekali karena Penyihir bergantung pada bentuk abstrak (Mantra), 
 *           bukan pada kelas konkret spesifiknya.
 */