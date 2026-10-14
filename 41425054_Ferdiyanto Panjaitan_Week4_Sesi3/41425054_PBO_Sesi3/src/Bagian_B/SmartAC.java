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
// Kelas SmartAC mengimplementasikan multiple interfaces: Switchable dan Connectable
public class SmartAC implements Switchable, Connectable {
    private int temperature;
    private boolean isOn; // State management untuk status daya

    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Validasi State: Tidak diizinkan terkoneksi jika sakelar dalam keadaan mati
        if (!isOn) {
            System.out.println("[Error] AC Pintar tidak dapat terhubung ke WiFi dalam keadaan mati!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}
