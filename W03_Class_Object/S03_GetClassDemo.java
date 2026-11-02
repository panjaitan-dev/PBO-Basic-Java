/* W03 - getClass(): tipe sebenarnya objek saat runtime (bukan tipe variabel). */
public class S03_GetClassDemo {
    public static void main(String[] args) {
        Object o = "teks";
        System.out.println(o.getClass().getName());        // java.lang.String
        Object p = new Anak(); Induk q = new Anak();
        System.out.println(p.getClass().getSimpleName() + " " + q.getClass().getSimpleName()); // Anak Anak
        System.out.println(q instanceof Induk);            // true
        System.out.println(q.getClass() == Induk.class);   // false (tipe asli Anak)
    }
}
class Induk {} class Anak extends Induk {}
