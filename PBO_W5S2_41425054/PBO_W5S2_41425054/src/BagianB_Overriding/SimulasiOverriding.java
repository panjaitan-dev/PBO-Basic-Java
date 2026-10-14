/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB_Overriding;

/**
 *
 * @author ferdi
 */
// main buat nyoba overriding
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // variabel tipe parent, objek aslinya beda
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");  // versi parent
        k2.kirimBarang("Gedung Graha Lt. 5");   // versi drone (runtime)
    }
}   