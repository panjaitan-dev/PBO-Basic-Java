/* 2. Handling the Exception.
   a) ex -> "Error java.lang.ArithmeticException: / by zero"; ex.getMessage() -> "/ by zero";
      ex.getStackTrace() -> alamat array objek (perlu loop untuk dicetak); ex.printStackTrace() -> stack trace ke stderr.
   b) Ganti ArithmeticException dengan Exception: tetap jalan, karena Exception = induk semua exception (polimorfisme),
      tapi kurang spesifik (menangkap terlalu banyak, menyembunyikan bug lain). */
public class HandlingException {
    public static void main(String[] args) {
        try { System.out.println(3 / 0); }
        catch (ArithmeticException ex) {
            System.out.println("Error " + ex);
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Stack trace elemen pertama: " + ex.getStackTrace()[0]);
            ex.printStackTrace();
        }
    }
}
