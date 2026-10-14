package Tugas_SistemPertahanan;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 */
public class MantraAntiApparition extends MantraPerlindungan {

    public MantraAntiApparition() {
        super("Mantra Anti-Apparition");
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif! Penyihir tidak dapat melakukan Apparition di area ini.");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan. Apparition kembali diizinkan.");
    }
}