package id.ac.del.rental;
/** VERSI SOAL (cacat desain, untuk dianalisis). Lihat VehicleRentalFixed untuk perbaikan. */
public class VehicleRental {
    public String plateNumber;            // public -> bisa dikosongkan
    protected double rentalRatePerDay;    // protected -> tidak terlihat dari package lain (non-subclass)
    private int rentalDays;
    double discountRate;                  // default -> hanya package sama
    public VehicleRental(String plateNumber, double rate) { this.plateNumber = plateNumber; this.rentalRatePerDay = rate; }
    public void setRentalDays(int days) { this.rentalDays = days; }   // tanpa validasi
    public double getTotalCost() { return (rentalRatePerDay * rentalDays) - (rentalRatePerDay * rentalDays * discountRate); }
}
