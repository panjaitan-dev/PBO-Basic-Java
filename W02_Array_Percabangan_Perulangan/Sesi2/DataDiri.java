import java.util.Scanner;
/* Sesi2 P1 - Data diri semua via Scanner + casting tinggi ke int. */
public class DataDiri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama: "); String nama = in.nextLine();
        System.out.print("Umur: "); int umur = in.nextInt();
        System.out.print("Tinggi (cm): "); double tinggi = in.nextDouble();
        System.out.print("Mahasiswa? (true/false): "); boolean isMhs = in.nextBoolean();
        System.out.println("Nama: " + nama + "\nUmur: " + umur + " tahun\nTinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMhs);
        int bulat = (int) tinggi; // casting: desimal DIPOTONG (165.8 -> 165), bukan dibulatkan
        System.out.println("Tinggi (dibulatkan): " + bulat + " cm");
    }
}
