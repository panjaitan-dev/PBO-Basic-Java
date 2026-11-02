package del.ac.id.anakan;
import del.ac.id.induk.Kendaraan;   // class beda package -> harus import (dan harus public)
/** Anak Kendaraan: mewarisi atribut umum, menambah atribut khusus (torsi, gagang, rasio gigi). */
public class Motor extends Kendaraan {
    private int jlhTorsi, faktorPembagi; private float panjangGagang, rasioGigi;
    public Motor() {}
    public void setJlhTorsi(int v) { jlhTorsi = v; }
    public void setPanjangGagang(float v) { panjangGagang = v; }
    public void setRasioGigi(float v) { rasioGigi = v; }
    public void setFaktorPembagi(int v) { faktorPembagi = v; }
    @Override public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return super.kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi) * faktorPembagi; // super = pakai logika induk
    }
    @Override public void cetakInformasi(Object o) {
        Motor x = (Motor) o;               // downcast agar bisa memakai getter
        System.out.println("=====================================================");
        System.out.println(String.format("Motor saya berwarna %s.", x.getWarnaKendaraan()));
        System.out.println(String.format("Dimensi motor tersebut adalah %d meter persegi", x.getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.", kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi)));
        System.out.println(String.format("Motor tersebut memiliki %d kaca spion dan %d roda. ", x.getJlhSpion(), x.getJlhRoda()));
        System.out.println("=====================================================");
    }
}
