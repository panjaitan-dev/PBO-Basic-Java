/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Single Inheritance ===");
        CarSingle cSingle = new CarSingle();

        System.out.println("\n=== 2. Multilevel Inheritance ===");
        CarMultiLevel cMulti = new CarMultiLevel();

        System.out.println("\n=== 3. Hierarchical Inheritance ===");
        CarHierarchical cHier = new CarHierarchical();
        BusHierarchical bHier = new BusHierarchical();

        System.out.println("\n=== 4. Multiple Inheritance via Interface ===");
        AmphibiousVehicle amph = new AmphibiousVehicle();
        amph.waterInfo();
        amph.landInfo();

        System.out.println("\n=== 5. Hybrid Inheritance ===");
        BusHybrid bus = new BusHybrid();
        bus.displayVehicle();
        bus.displayFare();
        bus.displayBus();
    }
}