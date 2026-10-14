package Tugas_SistemPertahanan;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 * 
 * DESKRIPSI:
 * Class pengelola yang menampung daftar mantra perlindungan dan mengendalikan 
 * aktivasi/non-aktivasi seluruh perisai Hogwarts secara terpusat.
 */
public class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra [" + mantra.getNamaMantra() + "] berhasil ditambahkan ke Sistem Pertahanan.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println("\n=== MENGAKTIFKAN SISTEM PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== MENONAKTIFKAN SISTEM PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }

    public static void main(String[] args) {
        SistemPertahanan pertahananHogwarts = new SistemPertahanan();

        // Inisialisasi Objek Mantra Perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition();

        // Menambahkan Mantra ke Sistem
        pertahananHogwarts.tambahMantra(protego);
        pertahananHogwarts.tambahMantra(fidelius);
        pertahananHogwarts.tambahMantra(antiApparition);

        // Demonstrasi Aktivasi dan Non-Aktivasi
        pertahananHogwarts.aktifkanSemuaMantra();
        pertahananHogwarts.nonaktifkanSemuaMantra();
    }
}