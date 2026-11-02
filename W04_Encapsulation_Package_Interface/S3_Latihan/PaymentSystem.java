/* W4S3 Praktek 2 - Interface PaymentMethod + 2 implementasi; main memakai referensi bertipe INTERFACE. */
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod p1 = new EWalletPayment("08123456789");
        PaymentMethod p2 = new CreditCardPayment("4111-XXXX-XXXX-1234");
        p1.pay(50000); p2.pay(150000);                 // perintah sama, proses beda (polymorphism)
        System.out.println(p1.getPaymentDetails() + " | " + p2.getPaymentDetails());
    }
}
interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0;                  // konstanta: otomatis public static final
    void pay(double amount);                          // abstract (tanpa body)
    String getPaymentDetails();
}
class EWalletPayment implements PaymentMethod {
    private String phoneNumber;
    EWalletPayment(String phoneNumber) { this.phoneNumber = phoneNumber; }
    @Override public void pay(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }
    @Override public String getPaymentDetails() { return "Metode: E-Wallet (" + phoneNumber + ")"; }
}
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    CreditCardPayment(String cardNumber) { this.cardNumber = cardNumber; }
    @Override public void pay(double amount) { System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount); }
    @Override public String getPaymentDetails() { return "Metode: Kartu Kredit (" + cardNumber + ")"; }
}
