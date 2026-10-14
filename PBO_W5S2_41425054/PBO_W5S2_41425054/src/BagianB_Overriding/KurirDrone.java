/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB_Overriding;

/**
 *
 * @author ferdi
 */
// child class: kurir drone, warisan dari KurirReguler
public class KurirDrone extends KurirReguler {
    private String idDrone; // id unik drone

    public KurirDrone(String nama, String idDrone) {
        super(nama); // panggil constructor parent
        this.idDrone = idDrone;
    }

    // override cara kirim barang jadi lewat udara
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}
