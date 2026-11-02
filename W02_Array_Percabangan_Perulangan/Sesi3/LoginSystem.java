import java.util.Scanner;
/* Sesi3 L1 - login berlapis: username 5-10 char, password >=8 + angka, maks 3 percobaan.
   Akun benar: admin / password123 */
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sistem Login ===");
        for (int t = 1; t <= 3; t++) {                       // loop percobaan
            System.out.println("Percobaan " + t + ":");
            System.out.print("Username: "); String u = sc.nextLine();
            System.out.print("Password: "); String p = sc.nextLine();
            if (u.length() < 5 || u.length() > 10) { System.out.println("Login gagal! Username harus 5-10 karakter."); }
            else if (p.length() < 8 || !p.matches(".*\\d.*")) { System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka."); }
            else if (u.equals("admin") && p.equals("password123")) { System.out.println("Login berhasil!"); return; }
            else System.out.println("Login gagal! Password salah.");
        }
        System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
    }
}
