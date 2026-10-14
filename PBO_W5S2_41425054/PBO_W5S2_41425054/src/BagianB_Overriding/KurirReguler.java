/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB_Overriding;

/**
 *
 * @author ferdi
 */
// parent class: kurir motor biasa
public class KurirReguler {
    protected String nama; // protected biar bisa dipakai anaknya

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // method yang nanti di-override sama child
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}
