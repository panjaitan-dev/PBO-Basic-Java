/* 9. Membuat exception sendiri (user-defined): extends Exception => CHECKED.
   Pengamatan: constructor meneruskan pesan via super(msg); method yang melempar wajib `throws MyException`;
   pemanggil wajib try-catch. e.getMessage() = pesan; printStackTrace() = jejak pemanggilan.
   Pemahaman: custom exception membuat error spesifik domain & mudah ditangkap terpisah dari exception lain. */
public class MyExceptionDemo {
    public static void foo() throws MyException {
        System.out.println("Throwing MyException from foo()");
        throw new MyException("Ini adalah eksepsi kustom dari foo()");
    }
    public static void main(String[] args) {
        try { foo(); }
        catch (MyException e) { System.out.println("Caught: " + e.getMessage()); e.printStackTrace(); }
        finally { System.out.println("Selesai."); }
    }
}
class MyException extends Exception { MyException(String msg) { super(msg); } }
