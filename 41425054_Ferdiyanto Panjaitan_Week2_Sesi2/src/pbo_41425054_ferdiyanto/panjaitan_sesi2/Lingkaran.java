/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
 * NIM: 41425054
 * Nama: Ferdiyanto Panjaitan
 * Prodi: DIV TRPL
 */

package pbo_41425054_ferdiyanto.panjaitan_sesi2;
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk membaca masukan dari pengguna
        Scanner input = new Scanner(System.in);
        // Deklarasi konstanta PI
        final double PI = 3.14;
        // Membaca input nilai jari-jari dari pengguna
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        // Validasi input: memastikan nilai jari-jari tidak bernilai negatif
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");                            
        } else {
            // Perhitungan luas dan keliling lingkaran jika input valid
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            
            // Menampilkan hasil perhitungan
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
        
        // Menutup objek scanner
        input.close();
    }
}

/* Pertanyaan Pemantik Praktek 3:
 * 1. Mengapa kita perlu validasi r < 0?
 * JAWABAN:
 * Dalam konteks geometri nyata, jari-jari (r) sebuah lingkaran menyatakan ukuran jarak,
 * sehingga nilainya tidak mungkin negatif (r >= 0). Validasi ini penting untuk mencegah
 * perhitungan matematis yang salah secara logika dan memastikan data masukan pengguna valid
 * sebelum rumus luas maupun keliling diproses.
 *
 * 2. Dalam aplikasi nyata, di mana validasi input sangat penting?
 * JAWABAN:
 * Validasi input sangat penting pada berbagai modul aplikasi nyata, seperti:
 * - Sistem Keuangan & Perbankan: Memastikan jumlah transfer atau penarikan bernilai positif dan tidak melebihi saldo.
 * - Form Autentikasi & Pendaftaran: Memastikan format email, nomor telepon, dan kekuatan kata sandi sesuai kriteria keamanan.
 * - Sistem Inventaris & Transaksi Kasir: Mencegah input jumlah barang bernilai nol atau negatif yang dapat merusak perhitungan stok dan total bayar.
 * - Aplikasi Kesehatan & Medis: Memastikan input dosis obat, tinggi badan, atau berat badan berada dalam rentang wajar agar tidak terjadi kesalahan perhitungan medis.
 */