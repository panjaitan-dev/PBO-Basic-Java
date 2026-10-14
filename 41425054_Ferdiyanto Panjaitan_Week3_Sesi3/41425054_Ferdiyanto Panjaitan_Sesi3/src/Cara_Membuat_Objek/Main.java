/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cara_Membuat_Objek;

/**
 *
 * @author ferdi
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Menggunakan Keyword new ---");
        StudentReflect s1 = new StudentReflect("Alice");
        System.out.println(s1);

        System.out.println("\n--- 2. Menggunakan Reflection ---");
        try {
            Class<?> c = Class.forName("materi2_cara_membuat_objek.StudentReflect");
            StudentReflect s2 = (StudentReflect) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created via Reflection: " + s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n--- 3. Menggunakan clone() Method ---");
        GeeksClone o1 = new GeeksClone();
        try {
            GeeksClone o2 = (GeeksClone) o1.clone();
            System.out.println("Cloned Object Name: " + o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- 4. Serialization & Deserialization ---");
        String filename = "student.ser";
        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(new StudentReflect("Alice"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            StudentReflect s = (StudentReflect) in.readObject();
            System.out.println("Deserialized: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
