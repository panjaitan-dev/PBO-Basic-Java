import java.util.Scanner;
/* Challenge - palindrome + jumlah vokal. */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kata: "); String kata = in.nextLine().toLowerCase();
        String balik = new StringBuilder(kata).reverse().toString();
        System.out.println(kata.equals(balik) ? "Palindrome" : "Bukan palindrome");
        int vokal = 0;
        for (char c : kata.toCharArray()) if ("aiueo".indexOf(c) >= 0) vokal++;
        System.out.println("Jumlah vokal: " + vokal);
    }
}
