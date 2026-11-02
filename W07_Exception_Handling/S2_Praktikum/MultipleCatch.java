/* 5. Multiple Catch.
   a) Tanpa argument: n==0 -> a/(a-1) = 1/0 -> ArithmeticException -> catch ArithmeticException.
   b) Dengan 1 argument: c[21]=5 -> ArrayIndexOutOfBoundsException -> tidak cocok Arithmetic -> catch (Exception e).
   c) Jika catch(Exception) diletakkan SEBELUM catch(ArithmeticException): COMPILE ERROR
      "exception ArithmeticException has already been caught" -> catch kedua unreachable karena induk menangkap semuanya.
      Aturan: catch SPESIFIK dulu, UMUM belakangan. */
public class MultipleCatch {
    public static void main(String args[]) {
        int n = args.length; int a = 1; int c[] = new int[1];
        try {
            if (n == 0) a = a / (a - 1); else c[21] = 5;
        } catch (ArithmeticException e) { System.out.println("Ups, seem out we have an Arithmetic Exception here...");
        } catch (Exception e) { System.out.println("Let the other exception handler here..."); }
    }
}
