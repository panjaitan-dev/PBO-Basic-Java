/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

// Kelas sistem rental kendaraan yang telah direfaktor
public class VehicleRental {
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        setRentalRatePerDay(rate);
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        if (plateNumber != null && !plateNumber.trim().isEmpty()) {
            this.plateNumber = plateNumber;
        } else {
            System.out.println("[Error] Plat nomor tidak boleh kosong!");
        }
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rate) {
        if (rate >= 0) {
            this.rentalRatePerDay = rate;
        } else {
            System.out.println("[Error] Tarif sewa per hari tidak boleh negatif!");
        }
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int days) {
        if (days > 0) {
            this.rentalDays = days;
        } else {
            System.out.println("[Error] Jumlah hari sewa harus lebih besar dari 0!");
        }
    }

    public double getTotalCost(Discountable discount) {
        double subtotal = rentalRatePerDay * rentalDays;
        if (discount != null) {
            double discountAmount = discount.calculateDiscount(subtotal);
            return subtotal - discountAmount;
        }
        return subtotal;
    }
}