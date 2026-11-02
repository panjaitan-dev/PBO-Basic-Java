package id.ac.del.test;
import id.ac.del.rental.*;
/** Driver: pakai versi aman + 3 skema diskon + validasi exception. */
public class TestRental {
    public static void main(String[] args) {
        VehicleRentalFixed v = new VehicleRentalFixed("BK 1234 DEL", 250000);
        v.setRentalDays(7);
        System.out.println("Tanpa diskon : Rp" + v.getTotalCost());
        System.out.println("Member       : Rp" + v.getTotalCost(new MemberDiscount()));
        System.out.println("Flash Sale   : Rp" + v.getTotalCost(new FlashSaleDiscount()));
        System.out.println("Corporate    : Rp" + v.getTotalCost(new CorporateDiscount()));
        Discountable anon = amount -> amount * 0.5;                    // lambda: skema diskon baru tanpa ubah VehicleRental
        System.out.println("Lambda 50%   : Rp" + v.getTotalCost(anon));
        try { v.setRentalDays(-7); } catch (IllegalArgumentException e) { System.out.println("Ditolak: " + e.getMessage()); }
        // VehicleRental bad = new VehicleRental("X", 1); bad.rentalRatePerDay = 5; // ERROR: protected, beda package
    }
}
