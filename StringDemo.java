public class StringDemo {
    public static void main(String[] args) {
        // Contoh deklarasi non-primitive 
        String s1 = "Hello";
        String s2 = new String("Java");

        // Contoh manipulasi String 
        String nama = "Budi";
        System.out.println(nama.length()); // 4
        System.out.println(nama.toUpperCase()); // "BUDI"
        System.out.println(nama.equals("Budi")); // true
    }
}