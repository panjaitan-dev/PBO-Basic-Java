/* W4S3 Latihan 1 - NIM & nama read-only (tanpa setter), nilai 0-100 divalidasi,
   gradeHuruf read-only dan dihitung otomatis oleh method PRIVATE tiap setter sukses. */
public class StudentGrade {
    private final String nim, nama;                  // final + tanpa setter = read-only
    private double nilaiKuis, nilaiUTS; private String gradeHuruf = "E";
    public StudentGrade(String nim, String nama) {
        this.nim = nim; this.nama = nama;
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public double getNilaiKuis() { return nilaiKuis; }
    public double getNilaiUTS() { return nilaiUTS; }
    public String getGradeHuruf() { return gradeHuruf; }          // hanya getter
    public void setNilaiKuis(double v) {
        if (v < 0.0 || v > 100.0) { System.out.println("[Error] Nilai kuis tidak valid: " + v + " (Harus antara 0 - 100)"); return; }
        nilaiKuis = v; System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + v); hitungGrade();
    }
    public void setNilaiUTS(double v) {
        if (v < 0.0 || v > 100.0) { System.out.println("[Error] Nilai UTS tidak valid: " + v + " (Harus antara 0 - 100)"); return; }
        nilaiUTS = v; System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + v); hitungGrade();
    }
    public double hitungNilaiAkhir() { return 0.4 * nilaiKuis + 0.6 * nilaiUTS; }
    private void hitungGrade() {                                   // private: tidak bisa dipanggil dari luar
        double n = hitungNilaiAkhir();
        gradeHuruf = n >= 85 ? "A" : n >= 70 ? "B" : n >= 60 ? "C" : n >= 50 ? "D" : "E";
    }
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===\nNIM        : " + nim + "\nNama       : " + nama +
            "\nNilai Kuis : " + nilaiKuis + "\nNilai UTS  : " + nilaiUTS + "\nNilai Akhir: " + hitungNilaiAkhir() + "\nGrade      : " + gradeHuruf);
    }
    public static void main(String[] args) {
        StudentGrade s = new StudentGrade("11425001", "Marsha");
        s.setNilaiKuis(110.0); s.setNilaiKuis(85.0); s.setNilaiUTS(90.0);
        s.cetakLaporan();
        // s.gradeHuruf = "A";  -> ERROR compile (private). s.setNim(...) tidak ada.
    }
}
