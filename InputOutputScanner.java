 // Scanner adalah fitur bawaan Java (java.util.Scanner) untuk membaca input/ketikan pengguna dari konsol.
 import java.util.Scanner;

public class InputOutputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.println("Halo, " + nama);
    }
}