/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
 * NIM: 41425054
 * Nama: Ferdiyanto Panjaitan
 * Prodi: DIV TRPL
 * Motto: If at first you don't succeed, call it version 1.0.
 */
package pbo_41425054_ferdiyanto.panjaitan_sesi2;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        // Membaca dua bilangan bulat dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        // Operasi dasar (Tambah, Kurang, Kali, Bagi)
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
        // Tambahan Operasi Modifikasi (Bagian C): Sisa Bagi (%) & Perpangkatan (Math.pow)
        System.out.println("Modulus: " + (a % b));
        System.out.println("Pangkat: " + Math.pow(a, b));
        // Menutup objek scanner
        input.close();
    }
}

/* Pertanyaan Pemantik Praktek 2:
 * 1. Mengapa pembagian int perlu di-casting ke double?
 * JAWABAN:
 * Dalam Java, pembagian antar bilangan bulat (int / int) akan menghasilkan 
 * bilangan bulat juga (integer division), di mana bagian sisa pembagian/desimalnya 
 * akan dibuang begitu saja.
 * Agar hasil pembagian menghasilkan nilai riil/desimal yang presisi, setidaknya salah 
 * satu operan harus di-cast ke tipe 'double' sebelum operasi pembagian dilakukan.
 * Contoh: 
 * 12 / 5         = 2   (Integer division, desimal dibuang)
 * (double)12 / 5 = 2.4 (Double division, menghasilkan nilai desimal akurat)
 *
 * 2. Apa risiko jika pembagi = 0?
 * JAWABAN:
 * - Jika pembagian dilakukan dengan tipe data bulat (int / int dengan pembagi = 0), 
 *   Java akan melempar runtime exception: ArithmeticException (/ by zero) 
 *   yang menyebabkan program crash jika tidak ditangani dengan try-catch.
 * - Jika salah satu operan bernilai float/double, hasilnya adalah Infinity 
 *   atau NaN (Not a Number) dan tidak menyebabkan crash, namun menghasilkan 
 *   nilai logika matematika yang tidak valid untuk perhitungan selanjutnya.
 */