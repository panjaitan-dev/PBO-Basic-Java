/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object_Methods;

// Demonstrasi finalize() dari Class Object
public class GeeksFinalize {
    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}