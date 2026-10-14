/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object_Methods;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. toString(), hashCode(), equals() ===");
        StudentDemo s1 = new StudentDemo();
        s1.roll = 101;
        StudentDemo s2 = new StudentDemo();
        s2.roll = 101;
        StudentDemo s3 = new StudentDemo();
        s3.roll = 102;

        System.out.println(s1.toString());
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("\n=== 2. getClass() Method ===");
        Object obj = new String("GeeksForGeeks");
        Class<?> c = obj.getClass();
        System.out.println("Class of Object obj is: " + c.getName());

        System.out.println("\n=== 3. clone() Method ===");
        try {
            Book b1 = new Book("Java Basics");
            Book b2 = (Book) b1.clone();
            System.out.println("Judul buku b1: " + b1.getTitle());
            System.out.println("Judul buku b2: " + b2.getTitle());
            System.out.println("Apakah b1 dan b2 objek yang sama? " + (b1 == b2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== 4. finalize() Method ===");
        GeeksFinalize gf = new GeeksFinalize();
        System.out.println("HashCode GF: " + gf.hashCode());
        gf = null;
        System.gc(); // Memicu Garbage Collector
        System.out.println("end");
    }
}
