/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A_Overloading;

/**
 *
 * @author ferdi
 */
// main buat nyoba overloading
public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        // 1 parameter -> versi biasa
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp " + tarif.hitungOngkir(2.0));
        // double, double -> versi asuransi
        System.out.println("Ongkir + Asuransi (Barang 5Jt) : Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        // double, boolean -> versi express
        System.out.println("Ongkir Express (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0, true));
    }
}
