/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructors;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Default Constructor ===");
        GeeksConstructor gc1 = new GeeksConstructor();

        System.out.println("\n=== 2. Parameterized Constructor ===");
        GeeksConstructor geek1 = new GeeksConstructor("Sweta", 68);
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);

        System.out.println("\n=== 3. Copy Constructor ===");
        GeeksConstructor geek2 = new GeeksConstructor(geek1);
        System.out.println("Copy Constructor used Second Object:");
        System.out.println("GeekName: " + geek2.name + " and GeekId: " + geek2.id);

        System.out.println("\n=== 4. Constructor Overloading ===");
        GeeksConstructor geek3 = new GeeksConstructor("Sweta");
        GeeksConstructor geek4 = new GeeksConstructor("Amiya", 28);
        GeeksConstructor geek5 = new GeeksConstructor(325614567L);
    }
}