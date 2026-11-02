/* 6. Throwing an Exception: throw new X("pesan") melempar manual; kendali langsung loncat ke catch yang cocok. */
public class ThrowExc {
    public static void main(String args[]) {
        try {
            System.out.println("I'm throwing an exception from here...");
            throw new NullPointerException("throw demo");
        } catch (NullPointerException e) { System.out.println("I'm catching an exception: [" + e + "] from here..."); }
    }
}
