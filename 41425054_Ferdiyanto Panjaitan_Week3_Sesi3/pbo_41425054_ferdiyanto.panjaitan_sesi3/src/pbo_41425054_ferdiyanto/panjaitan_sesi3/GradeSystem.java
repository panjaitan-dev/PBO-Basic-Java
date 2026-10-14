/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * NIM: 41425054
 * Nama: Ferdiyanto Panjaitan
 * Prodi: DIV TRPL
  */

package pbo_41425054_ferdiyanto.panjaitan_sesi3;
import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) { // Method main, (Method akan menyimpan parameter args[])
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double total = 0;

        // Input nilai 5 mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

        // Hitung rata-rata
        double average = total / 5;
        System.out.println("Rata-rata nilai: " + average);

        // Kategorikan nilai berdasarkan grade huruf
        char grade;
        if (average >= 85) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'E';

        System.out.println("Grade: " + grade);

        // Tampilkan nilai tertinggi dan terendah
        double max = grades[0];
        double min = grades[0];

        for (int i = 1; i < 5; i++) {
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);

        scanner.close();
    }
}

/* Pertanyaan Pemantik :
 * 1. Apa yang terjadi jika ada nilai yang diinput di luar rentang 0-100?
 * JAWABAN:
 * Program tetap akan memproses nilai tersebut tanpa melempar error, namun perhitungan 
 * statistik (rata-rata, min, max) dan penentuan grade menjadi tidak valid secara logika. 
 * Misalnya jika menginput 150, program akan menghitung rata-rata melebihi 100 dan mengkategorikannya sebagai grade 'A'.
 *
 * 2. Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis?
 * JAWABAN:
 * Kita bisa meminta input jumlah mahasiswa (n) terlebih dahulu dari pengguna via Scanner, 
 * lalu mendeklarasikan array dengan ukuran dinamis: 
 * System.out.print("Masukkan jumlah mahasiswa: ");
 * int n = scanner.nextInt();
 * double[] grades = new double[n];
 * Kemudian ubah perulangan for agar menggunakan n sebagai batas (i < n).
 */