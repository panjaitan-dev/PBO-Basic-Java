/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A_Overloading;

/**
 *
 * @author ferdi
 */
// class buat ngitung tarif pengiriman
public class MesinTarif {
    private String kotaAsal; // kota asal pengiriman

    // constructor, isi kota asal
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // versi 1: ongkir biasa, cuma dari berat
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // versi 2: ongkir + asuransi (1% dari nilai barang)
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // versi 3: ongkir express, kalau true ditambah 20rb
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000; // biaya tambahan express
        }
        return total;
    }
}
