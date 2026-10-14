/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cara_Membuat_Objek;

/**
 *
 * @author ferdi
 */
   // Kelas yang mengimplementasikan Cloneable untuk pengujian clone()
public class GeeksClone implements Cloneable {
    String name = "GeeksForGeeks";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
} 

