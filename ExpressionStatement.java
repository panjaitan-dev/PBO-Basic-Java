// Expression: Gabungan variabel, operator, dan pemanggilan method yang menghasilkan satu nilai. 
//  Statement: Satu perintah/kalimat lengkap yang dijalankan oleh Java (diakhiri tanda titik koma ;). 
//  Block: Sekumpulan statement yang dikelompokkan dan diapit oleh tanda kurung kurawal 
public class ExpressionStatement {
    public static void main(String[] args) {
       
        int result = 1 + 2; // menghasilkan int
        if (a == b) System.out.println("Sama"); // 

        // Statement 
        double aValue = 8933.234; // assignment & declaration
        aValue++;                 // increment
        System.out.println(aValue); // method call
        // new Bicycle();         // object creation 

        // Block 
        boolean condition = true;
        if (condition) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}