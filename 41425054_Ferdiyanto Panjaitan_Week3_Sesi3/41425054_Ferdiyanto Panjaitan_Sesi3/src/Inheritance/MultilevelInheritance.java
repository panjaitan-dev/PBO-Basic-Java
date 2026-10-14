/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

class VehicleMulti {
    VehicleMulti() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends VehicleMulti {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class CarMultiLevel extends FourWheeler {
    CarMultiLevel() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}