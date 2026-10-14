/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Passing_Object_and_GetSet;

// Kelas demonstrasi Encapsulation (Getter dan Setter)
public class GetSet {
    private String name;
    private int num;

    // Getter & Setter String
    public String getName() {
        return name;
    }

    public void setName(String N) {
        this.name = N;
    }

    // Getter & Setter dengan Validasi Nilai
    public int getNumber() {
        return num;
    }

    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException("Nilai harus antara 1 sampai 10!");
        }
        this.num = number;
    }
}
