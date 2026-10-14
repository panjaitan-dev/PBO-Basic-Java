/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian3_Kombinasi;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 */ 

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equalsIgnoreCase(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Modifikasi Instruksi 2: Method ucapkanSemuaMantra()
    public void ucapkanSemuaMantra() {
        System.out.println("\n--- " + nama + " Mengucapkan Semua Mantra ---");
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apapun.");
            return;
        }
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        System.out.println();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Memanggil method ucapkanSemuaMantra()
        harry.ucapkanSemuaMantra();
    }
}

 /* JAWABAN PERTANYAAN BAGIAN 3.1:
 * 1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
 *    Jawab: Abstract class Mantra mendefinisikan interface umum (efek()), sedangkan 
 *           polymorphism memungkinkan List<Mantra> menyimpan berbagai jenis subclass 
 *           Mantra. Saat method efek() dipanggil, Java mengeksekusi implementasi spesifik 
 *           sesuai jenis objek aslinya secara dinamis.
 * 
 * 2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? 
 *    Apakah mudah? Mengapa?
 *    Jawab: Sangat mudah. Kita hanya perlu membuat subclass baru dari Mantra. Kelas Penyihir 
 *           tidak perlu diubah sama sekali karena Penyihir bergantung pada bentuk abstrak (Mantra), 
 *           bukan pada kelas konkret spesifiknya.
 */