package id.ac.del.rental;
/** Versi aman: semua field private, validasi di constructor & setter, total tidak pernah negatif,
    getTotalCost menerima Discountable (polimorfisme / dependency injection). */
public class VehicleRentalFixed {
    private final String plateNumber; private double rentalRatePerDay; private int rentalDays;
    public VehicleRentalFixed(String plateNumber, double rate) {
        if (plateNumber == null || plateNumber.isBlank()) throw new IllegalArgumentException("Plat tidak boleh kosong");
        this.plateNumber = plateNumber; setRentalRatePerDay(rate);
    }
    public String getPlateNumber() { return plateNumber; }
    public void setRentalRatePerDay(double r) { if (r <= 0) throw new IllegalArgumentException("Tarif harus > 0"); rentalRatePerDay = r; }
    public void setRentalDays(int days) { if (days <= 0) throw new IllegalArgumentException("Hari harus > 0"); rentalDays = days; }
    public double getTotalCost() { return getTotalCost(null); }
    public double getTotalCost(Discountable d) {                       // diskon dikirim saat runtime
        double gross = rentalRatePerDay * rentalDays;
        double potongan = (d == null) ? 0 : d.calculateDiscount(gross);
        return Math.max(0, gross - Math.min(potongan, gross));          // tidak boleh negatif
    }
}
