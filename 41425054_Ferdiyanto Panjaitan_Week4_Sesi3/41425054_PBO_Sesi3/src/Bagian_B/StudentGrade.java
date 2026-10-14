/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 * @author 
 * Nama  : Ferdiyanto Michael Panjaitan
 * NIM   : 41425054
 * Prodi : D-IV TRPL
 */
// Kelas untuk mengelola data nilai mahasiswa dengan prinsip enkapsulasi
public class StudentGrade {
    // Attributes yang dikunci menggunakan hak akses private
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf; // Read-only attribute yang dikalkulasi secara internal

    // Constructor: Inisialisasi NIM dan Nama saat pembuatan objek
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        calculateGrade(); // Hitung grade awal
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // Getter untuk NIM (Read-Only)
    public String getNim() {
        return nim;
    }

    // Getter untuk Nama (Read-Only)
    public String getNama() {
        return nama;
    }

    // Getter untuk Nilai Kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Mutator/Setter untuk Nilai Kuis dengan validasi rentang 0.0 - 100.0
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            calculateGrade(); // Otomatis mengkalkulasi ulang grade huruf
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0-100)");
        }
    }

    // Getter untuk Nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Mutator/Setter untuk Nilai UTS dengan validasi rentang 0.0 - 100.0
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
            calculateGrade(); // Otomatis mengkalkulasi ulang grade huruf
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS + " (Harus antara 0-100)");
        }
    }

    // Getter untuk Grade Huruf (Read-Only)
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Method untuk menghitung Nilai Akhir (Bobot: 40% Kuis + 60% UTS)
    public double getNilaiAkhir() {
        return (0.40 * nilaiKuis) + (0.60 * nilaiUTS);
    }

    // Method internal private untuk mengkalkulasi grade huruf secara otomatis
    private void calculateGrade() {
        double akhir = getNilaiAkhir();
        if (akhir >= 85.0) {
            this.gradeHuruf = "A";
        } else if (akhir >= 75.0) {
            this.gradeHuruf = "B";
        } else if (akhir >= 65.0) {
            this.gradeHuruf = "C";
        } else if (akhir >= 50.0) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }

    // Method untuk mencetak laporan Kartu Hasil Studi (KHS)
    public void cetakKHS() {
        System.out.println("\n=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + getNilaiAkhir());
        System.out.println("Grade      : " + gradeHuruf);
    }

    public static void main(String[] args) {
        // Simulasi pendaftaran dan update nilai
        StudentGrade sg = new StudentGrade("11425001", "Marsha");
        sg.setNilaiKuis(110.0); // Ditolak karena nilai di luar rentang
        sg.setNilaiKuis(85.0);  // Berhasil
        sg.setNilaiUTS(90.0);   // Berhasil

        // Cetak KHS
        sg.cetakKHS();
    }
}