/* 3. Using Finally.
   a) Tanpa argument (n==0): 3/n -> ArithmeticException -> catch -> "Catching exception: ..." -> finally "After trying or catching...".
      "This won't be executed" TIDAK tercetak (terlewat karena exception).
   b) Dengan argument (n>0): else jalan -> "This will be executed if arguments is not zero", tidak ada catch, finally TETAP jalan.
   c) Kesimpulan: finally selalu dieksekusi, ada exception atau tidak.
   4. Ganti catch (Exception e) jadi NullPointerException: tanpa argument ArithmeticException TIDAK cocok dengan catch ->
      finally tetap jalan, lalu exception naik ke JVM -> program crash (stack trace). Exception tak tertangkap = diteruskan ke pemanggil sampai JVM. */
public class CaughtExceptionFinally {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) { System.out.println(3 / n); System.out.println("This won't be executed"); }
            else System.out.println("This will be executed if arguments is not zero");
        } catch (Exception e) {            // Eksperimen 4: ganti ke NullPointerException
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}
