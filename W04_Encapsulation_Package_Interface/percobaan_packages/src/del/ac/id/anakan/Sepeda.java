package del.ac.id.anakan;
import del.ac.id.induk.Kendaraan;
/** Sepeda: tidak punya torsi/gigi motor, percepatan tetap 10 bila parameter 0. */
public class Sepeda extends Kendaraan {
    public Sepeda() {}
    @Override public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return (jlhTorsi == 0 || panjangGagang == 0 || rasioGigi == 0) ? (float) 10.0 : (jlhTorsi * panjangGagang * rasioGigi);
    }
    @Override public void cetakInformasi(Object o) {
        Sepeda x = (Sepeda) o;
        System.out.println("=====================================================");
        System.out.println(String.format("Sepeda saya berwarna %s.", x.getWarnaKendaraan()));
        System.out.println(String.format("Dimensi sepeda tersebut adalah %d meter persegi", x.getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.", kalkulasiPercepatan(0, 0, 0)));
        System.out.println(String.format("sepeda tersebut memiliki %d kaca spion dan %d roda. ", x.getJlhSpion(), x.getJlhRoda()));
        System.out.println("=====================================================");
    }
}
