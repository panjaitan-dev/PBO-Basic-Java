/* W4S3 Latihan 2 - dua interface (Switchable, Connectable) diimplementasi sekaligus + state management:
   connectToWifi() ditolak jika perangkat masih mati. */
public class SmartHome {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp(80); SmartAC ac = new SmartAC(22);
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");   // ERROR state: masih mati
        lampu.turnOn(); lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");
        ac.turnOn(); ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff(); lampu.turnOff();
    }
}
interface Switchable { void turnOn(); void turnOff(); }
interface Connectable { void connectToWifi(String ssid, String ipAddress); }
abstract class SmartDevice implements Switchable, Connectable {   // kode ganda dipusatkan di sini
    protected boolean isOn = false; protected final String nama;
    SmartDevice(String nama) { this.nama = nama; }
    @Override public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) { System.out.println("[Error] " + nama + " harus dinyalakan dulu sebelum terhubung ke WiFi!"); return; }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}
class SmartLamp extends SmartDevice {
    private int kecerahan;                                        // atribut internal dibungkus private
    SmartLamp(int kecerahan) { super("Lampu Pintar"); this.kecerahan = kecerahan; }
    @Override public void turnOn() { isOn = true; System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + kecerahan + "%"); }
    @Override public void turnOff() { isOn = false; System.out.println("[Lampu Pintar] Dimatikan."); }
}
class SmartAC extends SmartDevice {
    private int suhu;
    SmartAC(int suhu) { super("AC Pintar"); this.suhu = suhu; }
    @Override public void turnOn() { isOn = true; System.out.println("[AC Pintar] Dinyalakan pada suhu " + suhu + " C"); }
    @Override public void turnOff() { isOn = false; System.out.println("[AC Pintar] Dimatikan."); }
}
