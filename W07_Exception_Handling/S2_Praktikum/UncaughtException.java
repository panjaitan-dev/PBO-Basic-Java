/* 1. Uncaught Exception.
   a) 3/0 pada int -> JVM melempar ArithmeticException, tidak ada catch -> JVM default handler menghentikan program.
   b) Output (stderr): Exception in thread "main" java.lang.ArithmeticException: / by zero
                           at UncaughtException.main(UncaughtException.java:N)
   Kesimpulan: tanpa handling program crash. (Catatan: 3.0/0 double -> Infinity, bukan exception.) */
class UncaughtException {
    public static void main(String args[]) { System.out.println(3 / 0); }
}
