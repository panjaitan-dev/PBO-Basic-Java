/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

class VehicleHierarchical {
    VehicleHierarchical() {
        System.out.println("This is a Vehicle");
    }
}

class CarHierarchical extends VehicleHierarchical {
    CarHierarchical() {
        System.out.println("This Vehicle is Car");
    }
}

class BusHierarchical extends VehicleHierarchical {
    BusHierarchical() {
        System.out.println("This Vehicle is Bus");
    }
}
