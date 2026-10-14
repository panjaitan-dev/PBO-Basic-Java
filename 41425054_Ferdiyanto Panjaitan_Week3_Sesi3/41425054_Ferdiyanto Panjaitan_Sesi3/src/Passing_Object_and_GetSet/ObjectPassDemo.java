/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Passing_Object_and_GetSet;

// Kelas demonstrasi passing object ke dalam method
public class ObjectPassDemo {
    int a, b;

    public ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method menerima objek bertipe sama sebagai parameter
    public boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}
