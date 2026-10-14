/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

class VehicleHybrid {
    void displayVehicle() {
        System.out.println("This is Vehicle");
    }
}

class CarHybrid extends VehicleHybrid {
    void displayCar() {
        System.out.println("This is Car");
    }
}

class Fare extends VehicleHybrid {
    void displayFare() {
        System.out.println("This is Fare");
    }
}

class BusHybrid extends Fare {
    void displayBus() {
        System.out.println("This is Bus");
    }
}
