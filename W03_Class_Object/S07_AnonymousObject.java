/* W03 - Anonymous object & anonymous class. KAPAN: dipakai sekali saja, tidak perlu variabel. */
public class S07_AnonymousObject {
    public static void main(String[] args) {
        new Salam().sapa("Ani");                          // objek anonim: langsung dipakai
        Runnable r = new Runnable() {                     // anonymous class (implementasi interface sekali pakai)
            @Override public void run() { System.out.println("Jalan dari anonymous class"); }
        };
        r.run();
        Runnable lambda = () -> System.out.println("Versi lambda"); lambda.run();
    }
}
class Salam { void sapa(String n) { System.out.println("Halo " + n); } }
