/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC_Abstraksi;

/**
 *
 * @author ferdi
 */
// tantangan ekstra: array parent isinya objek child beda-beda
public class TantanganPolimorfisme {
    public static void main(String[] args) {
        System.out.println("=== TANTANGAN POLIMORFISME ===");

        // array bertipe parent, diisi macam-macam child
        KendaraanEkspedisi[] armada = {
            new TrukBox("B 9081 TXT", 5000),
            new MobilVan("B 1122 KAA", 800),
            new MotorKurir("BK 5566 DEL", 50)
        };

        // satu for-loop aja, nggak perlu cek jenis child satu-satu
        for (KendaraanEkspedisi k : armada) {
            k.infoKendaraan();
            k.angkutBarang("Paket Umum"); // JVM yang milih versi child-nya (runtime)
            System.out.println("---");
        }
    }
}
