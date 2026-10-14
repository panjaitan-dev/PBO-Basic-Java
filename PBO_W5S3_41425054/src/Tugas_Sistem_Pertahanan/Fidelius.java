package Tugas_SistemPertahanan;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 */
public class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        super("Fidelius Charm");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan! Rahasia disimpan oleh Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dicabut. Lokasi rahasia kembali terlihat.");
    }
}