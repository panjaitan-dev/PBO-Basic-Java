/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC_Abstraksi;

/**
 *
 * @author ferdi
 */
// subclass konkret: motor kurir
public class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg); // kirim data ke parent
    }

    // wajib diisi karena parent punya abstract method
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor [" + noPolisi + "] membawa '" + namaBarang +
                "' di box belakang menembus gang sempit.");
    }
}