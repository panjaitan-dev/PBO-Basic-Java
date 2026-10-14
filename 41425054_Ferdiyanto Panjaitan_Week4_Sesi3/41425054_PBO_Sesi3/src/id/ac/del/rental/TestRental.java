/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;
package id.ac.del.test;

import id.ac.del.rental.Discountable;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.VehicleRental;

/*
===================================================================================
                     JAWABAN ANALISIS DISKUSI BAGIAN C
===================================================================================

1. Analisis Kompilasi dan Hak Akses (Access Modifiers)
   Saat TestRental.java dikompilasi, Baris B dan Baris C akan menyebabkan compile-time 
   error karena TestRental dan VehicleRental berada pada package yang berbeda. 
   - Baris A tidak menyebabkan error karena plateNumber menggunakan access modifier public, 
     sehingga dapat diakses dari class mana pun. 
   - Baris B menyebabkan error karena rentalRatePerDay menggunakan modifier protected. 
     Akses protected dari package yang berbeda tidak dapat dilakukan secara langsung 
     oleh class biasa seperti TestRental. 
   - Baris C juga menyebabkan error karena discountRate tidak memiliki access modifier 
     sehingga bersifat default atau package-private dan hanya dapat diakses oleh class 
     yang berada dalam package yang sama. 
   - Baris D tidak menyebabkan compile-time error karena setRentalDays() merupakan 
     method public, sehingga dapat dipanggil dari package berbeda. Atribut private 
     sendiri hanya dapat diakses dari dalam class tempat atribut tersebut didefinisikan.

2. Kelemahan Integritas Data (Data Hiding & Validation)
   i)  Walaupun Baris D menggunakan method setter, yaitu setRentalDays(-7), masih terdapat 
       cacat logika karena method tersebut tidak melakukan validasi terhadap nilai yang 
       diberikan. Method pada modul awal hanya berisi "this.rentalDays = days;", sehingga 
       nilai negatif seperti -7 tetap diterima dan disimpan ke dalam atribut rentalDays. 
       Seharusnya setter tidak hanya digunakan untuk mengubah nilai, tetapi juga melakukan 
       validasi agar jumlah hari sewa tidak boleh kurang dari nol. Dengan demikian, 
       encapsulation akan lebih baik karena data tidak dapat diubah ke kondisi yang tidak 
       valid melalui method tersebut.
   ii) Nilai total biaya dapat menjadi negatif karena program menerima rentalDays dengan 
       nilai negatif. Rumus pada getTotalCost() menggunakan perkalian rentalRatePerDay * rentalDays, 
       sehingga apabila jumlah hari bernilai negatif, hasil perhitungannya juga dapat menjadi 
       negatif. Selain itu, rentalRatePerDay dan discountRate pada kode awal masih dapat 
       berpotensi digunakan dengan nilai yang tidak sesuai. Untuk menjaga keamanan data keuangan, 
       class VehicleRental sebaiknya direfaktor dengan menjadikan atribut-atribut penting seperti 
       rentalRatePerDay, rentalDays, dan discountRate sebagai private, kemudian menyediakan 
       setter yang melakukan validasi. Misalnya, rentalRatePerDay harus lebih besar atau sama 
       dengan nol, rentalDays tidak boleh negatif, dan discountRate harus berada pada rentang 
       yang sesuai. Dengan cara tersebut, perubahan data harus melewati method yang memiliki 
       aturan validasi sehingga kemungkinan terjadinya data corruption dapat dikurangi.

3. Penerapan Interface (Dependency Injection)
   i)  Untuk mendukung berbagai skema diskon seperti MemberDiscount, FlashSaleDiscount, dan 
       CorporateDiscount, dibuat interface Discountable sebagai kontrak bersama. Interface 
       tersebut memiliki method calculateDiscount(double amount). Setiap class diskon kemudian 
       mengimplementasikan interface tersebut dengan aturan perhitungan diskonnya masing-masing. 
       Dengan demikian, VehicleRental tidak perlu mengetahui secara langsung jenis diskon 
       yang digunakan.
   ii) Method getTotalCost() pada VehicleRental kemudian direfaktor agar menerima parameter 
       bertipe Discountable. Dengan bentuk tersebut, VehicleRental tidak bergantung langsung pada 
       MemberDiscount, FlashSaleDiscount, atau CorporateDiscount. Object diskon dapat dikirim 
       dari TestRental saat program dijalankan. Method calculateDiscount() yang dijalankan akan 
       mengikuti object yang dikirimkan. Inilah penerapan polymorphism pada runtime dan 
       dependency injection yang diminta pada modul.
===================================================================================
*/

public class TestRental {

    public static void main(String[] args) {
        // Inisialisasi objek VehicleRental dengan data valid
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        // Pengujian 1: Memanggil setRentalDays dengan nilai negatif (Akan ditolak oleh sistem validasi)
        System.out.println("--- Pengujian Validasi Input Negatif ---");
        v.setRentalDays(-7);

        // Pengujian 2: Mengisi hari sewa dengan nilai valid
        v.setRentalDays(3);

        // Pengujian 3: Membuat objek diskon member (Diskon 20%) via interface Discountable
        Discountable memberDiscount = new MemberDiscount(0.20);

        // Memanggil getTotalCost dengan menyuntikkan objek diskon (Dependency Injection & Polymorphism)
        double totalCost = v.getTotalCost(memberDiscount);

        // Menampilkan hasil transaksi akhir
        System.out.println("\n--- Rincian Transaksi Sewa ---");
        System.out.println("Plat Nomor  : " + v.getPlateNumber());
        System.out.println("Hari Sewa   : " + v.getRentalDays() + " hari");
        System.out.println("Total Biaya : Rp" + totalCost);
    }
}