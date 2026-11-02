import java.util.Scanner;
/* Latihan 3 - ganjil/genap. */
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: "); int n = in.nextInt();
        System.out.println(n + " adalah bilangan " + (n % 2 == 0 ? "Genap" : "Ganjil")); // negatif: n%2 bisa -1, jadi bandingkan ==0
    }
}
