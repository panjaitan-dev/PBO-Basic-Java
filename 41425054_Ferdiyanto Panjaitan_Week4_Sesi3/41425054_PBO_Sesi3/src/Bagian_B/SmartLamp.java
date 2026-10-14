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
// Kelas SmartLamp mengimplementasikan multiple interfaces: Switchable dan Connectable
public class SmartLamp implements Switchable, Connectable {
    private int brightness;
    private boolean isOn; // State management untuk status daya

    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Validasi State: Tidak diizinkan terkoneksi jika sakelar dalam keadaan mati
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar tidak dapat terhubung ke WiFi dalam keadaan mati!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}
