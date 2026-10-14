/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_Polymorphism;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 */ 

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Subclass tambahan RonWeasley (Sesuai Instruksi 2)
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan ragu-ragu karena tongkatnya patah!");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();

        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}

 /* JAWABAN PERTANYAAN BAGIAN 1.2:
 * 1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih berjalan?
 *    Jawab: Kode masih tetap berjalan normal. Annotation @Override bersifat opsional, tetapi 
 *           sangat berguna untuk membantu compiler memastikan bahwa method tersebut benar-benar 
 *           melakukan override terhadap method parent-nya (mencegah penulisan nama method yang salah).
 * 
 * 2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
 *    Jawab: Keuntungannya adalah fleksibilitas kode. Kita dapat memperlakukan objek turunan 
 *           (HarryPotter, Hermione, RonWeasley) menggunakan tipe acuan umum (Penyihir). 
 *           Sehingga panggilannya seragam via penyihir.ucapkanMantra() tanpa perlu membuat 
 *           method terpisah untuk setiap jenis penyihir.
 */