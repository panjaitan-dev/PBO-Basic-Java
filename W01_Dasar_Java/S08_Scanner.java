import java.util.Scanner;
/* W01 - Scanner. KAPAN: input user. JEBAKAN: setelah nextInt()/nextDouble() sisa Enter menggantung,
   panggil sc.nextLine() sekali sebelum membaca String dengan nextLine(). */
public class S08_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Umur: "); int umur = sc.nextInt();
        System.out.print("Tinggi: "); double tinggi = sc.nextDouble();
        sc.nextLine();                         // buang sisa Enter
        System.out.print("Nama lengkap: "); String nama = sc.nextLine();
        System.out.println(nama + ", " + umur + " th, " + tinggi + " cm");
        sc.close();
    }
}
