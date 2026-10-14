/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructors;

public class GeeksConstructor {
    String name;
    int id;

    // 1. Default Constructor
    public GeeksConstructor() {
        System.out.println("Default constructor dipanggil");
    }

    // 2. Parameterized Constructor
    public GeeksConstructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 3. Copy Constructor
    public GeeksConstructor(GeeksConstructor obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }

    // 4. Constructor Overloading (1 argumen String)
    public GeeksConstructor(String name) {
        System.out.println("Constructor dengan 1 argumen String: " + name);
    }

    // Constructor Overloading (2 argumen)
    public GeeksConstructor(String name, int age) {
        System.out.println("Constructor dengan 2 argumen: " + name + ", " + age);
    }

    // Constructor Overloading (1 argumen Long)
    public GeeksConstructor(long id) {
        System.out.println("Constructor dengan 1 argumen Long: " + id);
    }
}