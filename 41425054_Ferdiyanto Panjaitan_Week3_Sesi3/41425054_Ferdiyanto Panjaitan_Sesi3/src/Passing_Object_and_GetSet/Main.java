/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Passing_Object_and_GetSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Passing Object in Method ===");
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        System.out.println("ob1 equal to ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 equal to ob3: " + ob1.equalTo(ob3));

        System.out.println("\n=== 2. Getter dan Setter (Contoh 1) ===");
        GetSet obj1 = new GetSet();
        obj1.setName("Geeks for Geeks");
        System.out.println("Name: " + obj1.getName());

        System.out.println("\n=== 3. Getter dan Setter dengan Validasi (Contoh 2) ===");
        GetSet obj2 = new GetSet();
        obj2.setNumber(5);
        System.out.println("Number: " + obj2.getNumber());
    }
}
