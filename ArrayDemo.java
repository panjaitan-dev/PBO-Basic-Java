public class ArrayDemo {
    public static void main(String[] args) {
        // Deklarasi & Inisialisasi (Slide 10)
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;

        // Shortcut Inisialisasi & Akses Elemen (Slide 11)
        int[] anArrayShortcut = {100, 200, 300, 400};
        System.out.println(anArrayShortcut[0]); // 100
        System.out.println(anArrayShortcut[1]); // 200

        // Array Multidimensi (Slide 11)
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names[0][2] + names[1][1]); // Ms. Jones
    }
}