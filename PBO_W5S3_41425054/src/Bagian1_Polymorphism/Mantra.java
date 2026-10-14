/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_Polymorphism;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 * 
*/
public class Mantra {

    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload 1: Dua parameter (String, int)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload 2 (Instruksi 2): Dua parameter (String, String)
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: " + target + " terkena dampak mantra.");
    }

    // Overload 3: Tiga parameter (String, int, String)
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Overload 4 (Jawaban Pertanyaan 2): Beda urutan parameter (int, String)
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan " + namaMantra + " dengan tingkat kekuatan " + kekuatan);
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", "Malfoy");
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
        mantra.ucapkan(20, "Stupefy");
    }
}

 /* JAWABAN PERTANYAAN BAGIAN 1.1:
 * 1. Apa yang terjadi jika kita menghapus salah satu method overloading?
 *    Jawab: Jika method yang dihapus sedang dipanggil di method main, compiler akan 
 *           menghasilkan error (compile-time error) karena Java tidak menemukan method 
 *           dengan signature/parameter yang sesuai. Namun jika tidak dipanggil, program 
 *           tetap berjalan normal.
 * 
 * 2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda?
 *    Jawab: Bisa. Java membedakan method overloading berdasarkan method signature 
 *           (tipe, jumlah, dan urutan parameter). Method ucapkan(int kekuatan, String namaMantra) 
 *           valid dan dapat dijalankan tanpa bentrok.
 */