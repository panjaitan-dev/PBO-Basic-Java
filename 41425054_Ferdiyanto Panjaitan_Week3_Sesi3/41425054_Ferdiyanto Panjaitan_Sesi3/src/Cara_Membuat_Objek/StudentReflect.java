/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cara_Membuat_Objek;

/**
 *
 * @author ferdi
 */
import java.io.Serializable;

// Kelas Student pendukung untuk Reflection dan Deserialization
public class StudentReflect implements Serializable {
    String name;

    public StudentReflect() {}

    public StudentReflect(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
