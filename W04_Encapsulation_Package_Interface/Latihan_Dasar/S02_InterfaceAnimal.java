/* W04 slide - Interface: kontrak "apa", bukan "bagaimana". Satu perintah, perilaku tergantung objek (cikal polymorphism). */
public class S02_InterfaceAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cat(), a2 = new Dog();      // referensi bertipe interface
        for (Animal a : new Animal[]{a1, a2}) { a.makeSound(); a.move(); } // kode pemanggil sama
        System.out.println(Animal.LEGS_MAX);        // konstanta interface: public static final
    }
}
interface Animal { int LEGS_MAX = 4; void makeSound(); void move(); }
class Cat implements Animal {
    public void makeSound() { System.out.println("Meow... Meow..."); }
    public void move() { System.out.println("Cat walks silently."); }
}
class Dog implements Animal {                      // class boleh implements BANYAK interface
    public void makeSound() { System.out.println("Woof!"); }
    public void move() { System.out.println("Dog runs."); }
}
