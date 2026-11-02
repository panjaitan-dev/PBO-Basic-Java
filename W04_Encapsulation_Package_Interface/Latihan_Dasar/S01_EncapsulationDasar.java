/* W04 slide - Encapsulation: field private, akses lewat getter/setter dengan validasi. */
public class S01_EncapsulationDasar {
    public static void main(String[] args) {
        Account acc = new Account("Ani", 1000);
        acc.setBalance(-999999);                 // ditolak -> "Invalid amount!"
        acc.setBalance(2500); System.out.println(acc.getBalance());
        Employee e = new Employee(); e.setAge(-5); e.setAge(30); e.setName(""); e.setName("Budi");
        System.out.println(e.getName() + " " + e.getAge());
        Element h = new Element("Hydrogen", 1, "H", 1.008, 1, 1);   // tidak ada setter = tidak bisa diubah
        System.out.println(h.getName() + " " + h.getSymbol() + " " + h.getNumber() + " " + h.getMass());
    }
}
class Account {
    private String ownerName; private double balance;
    Account(String name, double startingBalance) { this.ownerName = name; this.balance = startingBalance; }
    public double getBalance() { return balance; }
    public void setBalance(double amount) { if (amount >= 0) balance = amount; else System.out.println("Invalid amount!"); }
}
class Employee {
    private String name; private int age;
    public String getName() { return name; }
    public void setName(String name) { if (name != null && !name.isEmpty()) this.name = name; else System.out.println("Name cannot be empty!"); }
    public int getAge() { return age; }
    public void setAge(int age) { if (age > 0) this.age = age; else System.out.println("Invalid age!"); }
}
class Element {                                  // immutable: private final + constructor + getter saja
    private final String name, symbol; private final int number, period, group; private final double mass;
    Element(String name, int number, String symbol, double mass, int period, int group) {
        this.name = name; this.number = number; this.symbol = symbol; this.mass = mass; this.period = period; this.group = group; }
    public String getName() { return name; } public int getNumber() { return number; }
    public String getSymbol() { return symbol; } public double getMass() { return mass; }
    public int getPeriod() { return period; } public int getGroup() { return group; }
}
