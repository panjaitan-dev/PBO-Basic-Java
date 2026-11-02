/* W01 - Casting.
   KAPAN: int/int membuang desimal -> cast salah satu ke double. double->int = explicit & memotong. */
public class S04_KonversiTipe {
    public static void main(String[] args) {
        int i = 10; double d = i;                 // implicit (widening) otomatis
        double tinggi = 165.8; int bulat = (int) tinggi; // explicit (narrowing) -> 165 (dipotong)
        System.out.println(d + " " + bulat);
        System.out.println(7 / 2);                // 3  (integer division)
        System.out.println((double) 7 / 2);       // 3.5
        System.out.println(Integer.parseInt("123") + 1);   // String -> int
        System.out.println(String.valueOf(45) + "x");      // int -> String
        char c = 'A'; System.out.println((int) c + " " + (char) (c + 1)); // 65 B
    }
}
