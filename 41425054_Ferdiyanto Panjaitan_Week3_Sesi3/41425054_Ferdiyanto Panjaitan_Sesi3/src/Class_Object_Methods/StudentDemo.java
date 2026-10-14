/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object_Methods;

// Demonstrasi method toString(), hashCode(), dan equals() dari Class Object
public class StudentDemo {
    int roll;

    @Override
    public String toString() {
        return "Student object with roll: " + roll;
    }

    @Override
    public int hashCode() {
        return roll;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof StudentDemo) {
            return this.roll == ((StudentDemo) o).roll;
        }
        return false;
    }
}
