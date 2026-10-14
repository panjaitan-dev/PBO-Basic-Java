/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 * @author 
 * Nama  : Ferdiyanto Michael Panjaitan
 * NIM   : 41425054
 * Prodi : D-IV TRPL
 */
// Kelas utama untuk pengujian kontrol Smart Home
public class SmartHomeApp {
    public static void main(String[] args) {
        // Simulasi perangkat Lampu Pintar
        SmartLamp lamp = new SmartLamp(80);
        lamp.turnOn();
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        // Simulasi perangkat AC Pintar
        SmartAC ac = new SmartAC(22);
        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff();
    }
}
