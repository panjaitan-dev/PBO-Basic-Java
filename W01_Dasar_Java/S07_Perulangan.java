/* W01 - Loop. KAPAN: for = jumlah ulang diketahui; while = sampai kondisi salah;
   do-while = minimal 1x (menu); break = keluar loop; continue = lewati iterasi; return = keluar method. */
public class S07_Perulangan {
    static int cariPertama(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) return i; // return keluar method
        return -1;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        System.out.println();
        int n = 3; while (n > 0) { System.out.print(n-- + " "); }
        System.out.println();
        int k = 0; do { System.out.print("sekali "); k++; } while (k < 0); // tetap jalan 1x
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;   // lewati genap
            if (i > 7) break;           // stop
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("index 30 = " + cariPertama(new int[]{10, 20, 30}, 30));
        for (int i = 1; i <= 3; i++) { for (int j = 1; j <= i; j++) System.out.print("*"); System.out.println(); } // nested
    }
}
