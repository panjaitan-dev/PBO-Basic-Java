/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

// Implementasi spesifik diskon member
public class MemberDiscount implements Discountable {
    private double discountRate;

    public MemberDiscount(double discountRate) {
        if (discountRate >= 0 && discountRate <= 1.0) {
            this.discountRate = discountRate;
        } else {
            this.discountRate = 0.0;
        }
    }

    @Override
    public double calculateDiscount(double amount) {
        return amount * discountRate;
    }
}