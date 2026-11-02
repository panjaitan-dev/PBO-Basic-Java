import java.util.Scanner;
/* Latihan 2 - sisa bagi (%) dan pangkat (Math.pow). */
public class BagiPangkat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: "); int a = in.nextInt();
        System.out.print("Masukkan angka kedua: "); int b = in.nextInt();
        System.out.println("Sisa bagi: " + (b == 0 ? "tak terdefinisi" : String.valueOf(a % b)));
        System.out.println("Pangkat: " + (long) Math.pow(a, b)); // pow mengembalikan double -> cast
    }
}
