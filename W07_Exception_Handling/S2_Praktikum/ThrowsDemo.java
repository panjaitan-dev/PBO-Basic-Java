/* 8. Throws Demo.
   a) Soal asli: `IllegalAccesException` (typo, kurang 's') -> compile error "cannot find symbol". Kalau ejaan benar
      (IllegalAccessException = CHECKED) tanpa throws/try -> error "unreported exception IllegalAccessException; must be caught or declared to be thrown".
   b) Diganti ArithmeticException (unchecked/RuntimeException) -> compile OK tanpa throws; saat jalan crash karena tidak ditangkap.
   Perbaikan di bawah: deklarasi `throws` + try-catch di pemanggil. */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("I'm throwing a non Runtime exception that I don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try { throwOne(); } catch (IllegalAccessException e) { System.out.println("Caught " + e); }
    }
}
