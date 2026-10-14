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

public class OperasiString {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk membaca masukan string dari pengguna
        Scanner input = new Scanner(System.in);
        // Membaca input nama lengkap
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();
        // Menampilkan hasil analisis String[cite: 1]
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
        // Menutup objek scanner
        input.close();
    }
}

/* Pertanyaan Pemantik Praktek 4:
 * Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
 * JAWABAN:
 * 1. Method nama.length() akan menghitung seluruh karakter termasuk setiap spasi yang ada. 
 *    Jika terdapat spasi ganda (misal di antara kata atau di awal/akhir), spasi tersebut 
 *    tetap dihitung sebagai karakter individual sehingga panjang total string akan bertambah.
 * 2. Method nama.contains(" ") tetap akan mengembalikan nilai boolean true selama terdapat 
 *    minimal satu spasi di dalam string tersebut.
 * 3. Method nama.charAt(0) tidak terpengaruh oleh spasi di tengah kata. Namun, jika spasi 
 *    dimasukkan di paling depan (sebelum karakter huruf pertama), maka nama.charAt(0) 
 *    akan mengembalikan karakter spasi ' '.
 */