- Contoh program menghitung nilai rata-rata dari array. 
-  Menggabungkan penggunaan Enhanced For Loop untuk menghitung total dan Explicit Casting ((double)) agar pembagian nilai desimalnya akurat.

public class SimpleImplementation {
    public static void main(String[] args) {
        int[] nilai = {80, 90, 75, 88};
        int total = 0;
        
        for(int n : nilai) { // enhanced for loop
            total += n;
        }
        
        double rata = (double)total / nilai.length;
        System.out.println("Rata-rata = " + rata);
    }
}