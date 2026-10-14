/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC_Abstraksi;

/**
 *
 * @author ferdi
 */
// subclass konkret: mobil van
public class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}