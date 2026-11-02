/* W01 - Non-primitive: class, interface, array, String.
   KAPAN: array untuk banyak data bertipe sama (ukuran tetap). */
public class S03_NonPrimitive {
    interface Hewan { void suara(); }                 // interface = kontrak
    static class Kucing implements Hewan {            // class implementasi
        public void suara() { System.out.println("Meow"); }
    }
    public static void main(String[] args) {
        Hewan h = new Kucing(); h.suara();
        int[] angka = {10, 20, 30};                   // array 1D
        int[] kosong = new int[3];                    // default 0
        int[][] matriks = {{1, 2}, {3, 4}};           // array 2D
        System.out.println("panjang=" + angka.length + " elemen[1]=" + angka[1] + " kosong[0]=" + kosong[0]);
        for (int[] baris : matriks) {                 // for-each
            for (int x : baris) System.out.print(x + " ");
            System.out.println();
        }
        String s = "Java";                            // String = objek (immutable)
        System.out.println(s.length() + " " + s.toUpperCase() + " " + s.charAt(0) + " " + s.contains("av")
                + " " + s.equals("java") + " " + s.equalsIgnoreCase("java") + " " + s.substring(1, 3));
        // PENTING: bandingkan String pakai equals(), BUKAN ==
    }
}
