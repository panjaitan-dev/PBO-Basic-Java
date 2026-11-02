/* W03 - Urutan inisialisasi. Soal tebak output sering memakai ini.
   Urutan: static block (sekali, saat class dimuat) -> field -> instance init block -> constructor. */
public class S08_Inisiasi {
    public static void main(String[] args) {
        System.out.println("main mulai");
        new Dog(); System.out.println("---"); new Dog("Rex");
    }
}
class Hewan { Hewan() { System.out.println("1. constructor Hewan (induk dulu)"); } }
class Dog extends Hewan {
    static { System.out.println("0. static block Dog (sekali)"); }
    String nama = init("field nama");
    { System.out.println("2. init block Dog"); }
    Dog() { this("Tanpa Nama"); System.out.println("4. constructor Dog()"); }
    Dog(String n) { System.out.println("3. constructor Dog(String) " + n); }
    static String init(String s) { System.out.println("   inisialisasi " + s); return s; }
}
