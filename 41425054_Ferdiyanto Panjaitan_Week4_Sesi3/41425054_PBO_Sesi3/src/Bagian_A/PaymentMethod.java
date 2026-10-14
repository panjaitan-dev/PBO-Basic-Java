/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/**
 * @author 
 * Nama  : Ferdiyanto Michael Panjaitan
 * NIM   : 41425054
 * Prodi : D-IV TRPL
 */

public interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0;

    void pay(double amount);
    String getPaymentDetails();
}