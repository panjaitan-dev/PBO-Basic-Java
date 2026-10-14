package Tugas_SistemPertahanan;

/**
 * Author : Ferdiyanto Panjaitan
 * NIM    : 41425054
 * Prodi  : D-IV TRPL
 */
public class Protego extends MantraPerlindungan {

    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}