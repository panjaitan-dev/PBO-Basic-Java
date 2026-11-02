import java.util.*;
/* W03 - toString, equals, hashCode. Tanpa override: toString = Kelas@hash, equals = bandingkan alamat. */
public class S02_ToStringEqualsHashCode {
    public static void main(String[] args) {
        Siswa s1 = new Siswa("123", "Ani"), s2 = new Siswa("123", "Ani"), s3 = new Siswa("456", "Budi");
        System.out.println(s1);                                  // otomatis panggil toString()
        System.out.println("s1==s2 : " + (s1 == s2));            // false (alamat beda)
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  // true (isi sama)
        System.out.println("hash sama : " + (s1.hashCode() == s2.hashCode()));
        Set<Siswa> set = new HashSet<>(List.of(s1, s3)); set.add(s2);
        System.out.println("Ukuran set (duplikat dibuang) = " + set.size()); // 2
    }
}
class Siswa {
    private final String nim, nama;
    Siswa(String nim, String nama) { this.nim = nim; this.nama = nama; }
    @Override public String toString() { return "Siswa[nim=" + nim + ", nama=" + nama + "]"; }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  // cek null & tipe
        Siswa s = (Siswa) o; return nim.equals(s.nim) && nama.equals(s.nama);
    }
    @Override public int hashCode() { return Objects.hash(nim, nama); } // wajib konsisten dg equals
}
