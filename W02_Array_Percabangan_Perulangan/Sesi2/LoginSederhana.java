import java.util.Scanner;
/* Latihan 5 - username "admin", password min 6 karakter dan mengandung angka. */
public class LoginSederhana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan username: "); String u = in.nextLine();
        System.out.print("Masukkan password: "); String p = in.nextLine();
        boolean adaAngka = p.matches(".*\\d.*");          // regex: ada digit di mana saja
        if (u.equals("admin") && p.length() >= 6 && adaAngka) System.out.println("Login berhasil!");
        else System.out.println("Login gagal! Password tidak valid.");
    }
}
