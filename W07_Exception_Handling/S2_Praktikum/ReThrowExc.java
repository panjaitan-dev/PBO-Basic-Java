/* 7. Re-throwing.
   a) Jika `throw e;` dihapus, exception sudah "dikonsumsi" di demoThrow -> main TIDAK menangkapnya (catch di main tidak jalan).
   b) Kesimpulan: re-throw dipakai bila ingin menangani sebagian (mis. log) lalu meneruskan ke pemanggil. */
public class ReThrowExc {
    static void demoThrow() {
        try { System.out.println("I'm throwing an exception from demoThrow method"); throw new NullPointerException("demo"); }
        catch (NullPointerException e) { System.out.println("I'm catching the exception [" + e + "]"); System.out.println("But I'll throw it again...\n"); throw e; }
    }
    public static void main(String args[]) {
        try { demoThrow(); }
        catch (NullPointerException e) { System.out.println("I'm catching the exception [" + e + "]\n thrown from demoThrow method"); }
    }
}
