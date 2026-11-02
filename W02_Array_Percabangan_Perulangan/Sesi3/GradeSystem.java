import java.util.Scanner;
/* Sesi3 P1 - input nilai (jumlah dinamis + validasi 0-100), rata-rata, grade, max, min. */
public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah nilai: "); int n = sc.nextInt();
        double[] grades = new double[n]; double total = 0;       // array ukuran dinamis
        for (int i = 0; i < n; i++) {
            double v;
            do { System.out.print("Masukkan nilai ke-" + (i + 1) + ": "); v = sc.nextDouble();
                 if (v < 0 || v > 100) System.out.println("Nilai harus 0-100!");
            } while (v < 0 || v > 100);                           // ulang sampai valid
            grades[i] = v; total += v;
        }
        double avg = total / n; char grade;
        if (avg >= 85) grade = 'A'; else if (avg >= 70) grade = 'B'; else if (avg >= 60) grade = 'C';
        else if (avg >= 50) grade = 'D'; else grade = 'E';
        double max = grades[0], min = grades[0];
        for (int i = 1; i < n; i++) { if (grades[i] > max) max = grades[i]; if (grades[i] < min) min = grades[i]; }
        System.out.println("Rata-rata nilai: " + avg + "\nGrade: " + grade + "\nNilai tertinggi: " + max + "\nNilai terendah: " + min);
    }
}
