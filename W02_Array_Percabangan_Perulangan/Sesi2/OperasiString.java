import java.util.Scanner;
/* Sesi2 P4 - panjang, huruf pertama, ada spasi. nextLine() karena nama bisa berspasi. */
public class OperasiString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: "); String nama = in.nextLine();
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + (nama.isEmpty() ? "-" : nama.charAt(0)));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
        // spasi > 1: contains tetap true; hitung jumlah kata pakai nama.trim().split("\\s+").length
        System.out.println("Jumlah kata: " + nama.trim().split("\\s+").length);
    }
}
