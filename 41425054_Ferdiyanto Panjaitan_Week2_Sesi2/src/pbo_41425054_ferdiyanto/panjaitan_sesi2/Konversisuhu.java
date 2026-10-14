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

public class Konversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Konversi Celsius ke Fahrenheit
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitHasil = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f C = %.1f F\n\n", celsius, fahrenheitHasil);
        // 2. Konversi Fahrenheit ke Celsius
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsiusHasil = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f F = %.2f C\n", fahrenheit, celsiusHasil);
        input.close();
    }
}