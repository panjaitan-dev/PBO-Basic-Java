package id.ac.del.rental;
public class CorporateDiscount implements Discountable { public double calculateDiscount(double a) { return Math.min(a * 0.15, 500000); } }
