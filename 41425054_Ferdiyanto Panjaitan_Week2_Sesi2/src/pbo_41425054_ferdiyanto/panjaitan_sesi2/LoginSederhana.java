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

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membaca masukan username dan password
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        // Validasi: username "admin", password minimal 6 karakter & mengandung angka
        boolean isValidUsername = username.equals("admin");
        boolean isValidPassword = password.length() >= 6 && password.matches(".*\\d.*");
        if (isValidUsername && isValidPassword) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }
        input.close();
    }
}