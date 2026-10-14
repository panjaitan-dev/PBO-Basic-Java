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

public class CekGanjilGenap {
    public static void main(String[] args) {
        // Objek Scanner untuk membaca masukan pengguna
        Scanner input = new Scanner(System.in);

        // Membaca masukan bilangan bulat
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan habis dibagi 2 menggunakan operator modulus (%)
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }

        // Menutup objek scanner
        input.close();
    }
}
