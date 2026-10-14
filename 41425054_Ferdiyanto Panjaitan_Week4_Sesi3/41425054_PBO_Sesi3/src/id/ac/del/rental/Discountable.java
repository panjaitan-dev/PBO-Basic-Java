/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 * @author ferdi
 */
// Kontrak interface untuk mendukung berbagai strategi diskon
public interface Discountable {
    double calculateDiscount(double amount);
}