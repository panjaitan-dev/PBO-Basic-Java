 // Interface adalah kontak yang berisi method tanpa Implementasi.Merupakan class yang meng-implement
    wajib semua isi method.
    interface Operasi {
        int tambah (int a,  int b);
    }
     class Kalkulator implements Operasi {
        public int tambah(int a, int b){ return a+b;}
     }

