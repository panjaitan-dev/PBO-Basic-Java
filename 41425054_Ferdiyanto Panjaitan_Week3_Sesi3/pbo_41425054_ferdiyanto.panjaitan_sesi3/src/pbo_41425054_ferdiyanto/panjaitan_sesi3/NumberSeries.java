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

public class NumberSeries {
    public static void main(String[] args) {
        // Input dan cetak deret Fibonacci
        try (Scanner scanner = new Scanner(System.in)) {
            // Input dan cetak deret Fibonacci
            System.out.print("Masukkan jumlah deret Fibonacci: ");
            int n = scanner.nextInt(); // 
            System.out.println("Deret Fibonacci:"); // PrintLn akan memindahkan kursor pada teks kursol
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }   System.out.println();
            // Cek bilangan prima
            System.out.print("Masukkan bilangan untuk dicek prima: ");
            int num = scanner.nextInt();
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }   System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
        }
    }
}

/* Pertanyaan Pemantik 
 * Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar?
 * JAWABAN:
 * 1. Gunakan pendekatan Iteratif (seperti pada kode ini) atau Dynamic Programming / Memoization 
 *    agar kompleksitas waktu tetap O(n), hindari rekursif biasa yang memiliki kompleksitas O(2^n).
 * 2. Ganti tipe data variabel penampung dari int ke long atau BigInteger untuk mencegah 
 *    masalah integer overflow ketika nilai suku deret sudah melebihi rentang maksimum tipe data int.
 */