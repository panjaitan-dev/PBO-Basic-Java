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

public class DataDiri {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dinamis dari pengguna
        Scanner input = new Scanner(System.in);
        // Membaca masukan nama, umur, tinggi badan, dan status mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();
        System.out.print("Status Mahasiswa (true/false): ");
        boolean isMahasiswa = input.nextBoolean();
        // Menampilkan data yang telah diinput pengguna
        System.out.println("\n--- Data Diri ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        // Melakukan explicit casting dari tipe double ke int untuk pembulatan
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
        // Menutup objek scanner
        input.close();
    }
}