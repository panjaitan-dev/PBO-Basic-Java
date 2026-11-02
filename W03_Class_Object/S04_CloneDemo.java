import java.util.Arrays;
/* W03 - clone(). Shallow copy: field referensi (array) DIBAGI. Deep copy: salin juga isinya.
   KAPAN: perlu salinan independen dari objek. */
public class S04_CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException { // clone() checked exception
        Kotak k1 = new Kotak("A", new int[]{1, 2, 3});
        Kotak shallow = k1.clone();
        shallow.nama = "B"; shallow.data[0] = 99;          // nama terpisah, data TERBAGI
        System.out.println(k1.nama + " " + Arrays.toString(k1.data));   // A [99, 2, 3]
        Kotak deep = k1.deepCopy(); deep.data[1] = -1;
        System.out.println(k1.nama + " " + Arrays.toString(k1.data));   // data k1 aman
    }
}
class Kotak implements Cloneable {                         // wajib Cloneable, kalau tidak -> CloneNotSupportedException
    String nama; int[] data;
    Kotak(String n, int[] d) { nama = n; data = d; }
    @Override public Kotak clone() throws CloneNotSupportedException { return (Kotak) super.clone(); } // shallow
    Kotak deepCopy() { return new Kotak(nama, data.clone()); }
}
