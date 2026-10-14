/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2_AbstractClass;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 */ 
 
abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Subclass tambahan Lumos (Sesuai Instruksi 2)
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menyalahkan cahaya terang di ujung tongkat.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}

/* JAWABAN PERTANYAAN BAGIAN 2.1:
 * 1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
 *    Jawab: Compiler akan menampilkan error "MantraAbstrak is abstract; cannot be instantiated". 
 *           Abstract class tidak dapat diinstansiasi secara langsung dengan kata kunci 'new'.
 * 
 * 2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
 *    Jawab: Abstract class digunakan untuk membuat kerangka dasar (blueprint) yang mewajibkan 
 *           semua kelas turunan mengimplementasikan method abstrak tertentu. Keuntungannya 
 *           adalah mencegah duplikasi kode umum dan menjaga konsistensi struktur class.
 */