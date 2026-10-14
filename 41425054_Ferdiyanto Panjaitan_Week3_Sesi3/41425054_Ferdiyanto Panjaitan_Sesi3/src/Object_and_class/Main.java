/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_and_class;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Basic Class & Object ---");
        Student s1 = new Student(10, "Alice");
        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.n);

        System.out.println("\n--- 2. Dog Object State & Behavior ---");
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());

        System.out.println("\n--- 3. Inisialisasi via Method ---");
        GeeksInit.set("Visual studio", 0.0f);
        GeeksInit.get();
    }
}
