import java.util.Scanner;
/* Sesi2 P2 - Kalkulator + modulus & pangkat. */
public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: "); int a = in.nextInt();
        System.out.print("Masukkan angka kedua: "); int b = in.nextInt();
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        if (b == 0) System.out.println("Bagi: tidak bisa dibagi 0"); // cegah ArithmeticException
        else {
            System.out.println("Bagi: " + ((double) a / b));          // cast agar desimal tidak hilang
            System.out.println("Modulus: " + (a % b));
        }
        System.out.println("Pangkat: " + Math.pow(a, b));
    }
}
