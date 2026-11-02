import java.lang.reflect.*;
/* W03 - Reflection: baca struktur class saat runtime. KAPAN: framework (Spring, JUnit), tools. Jarang di soal dasar. */
public class S06_ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Barang");
        System.out.println("Class: " + c.getName());
        for (Field f : c.getDeclaredFields()) System.out.println("Field : " + f.getType().getSimpleName() + " " + f.getName());
        for (Method m : c.getDeclaredMethods()) System.out.println("Method: " + m.getName());
        Object o = c.getDeclaredConstructor().newInstance();                 // buat objek lewat reflection
        c.getMethod("info").invoke(o);                                        // panggil method lewat nama
    }
}
class Barang { private String nama = "Pensil"; int harga = 2000; public void info() { System.out.println("Barang " + nama + " " + harga); } }
