/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC_Abstraksi;

/**
 *
 * @author ferdi
 */
// abstract class: cetak biru semua kendaraan, nggak boleh di-new
public abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    // constructor buat diwariskan lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // concrete method (ada body), langsung bisa dipakai anak
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // abstract method (tanpa body), wajib diisi sama subclass konkret
    public abstract void angkutBarang(String namaBarang);
}