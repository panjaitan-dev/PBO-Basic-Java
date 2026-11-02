import java.io.*;
/* W03 - Serialization/Deserialization: objek <-> byte. transient = field tidak disimpan (mis. password).
   KAPAN: simpan state objek ke file, kirim lewat jaringan. Pakai ByteArray agar tidak butuh file. */
public class S05_SerializationDemo {
    public static void main(String[] args) throws Exception {
        Akun a = new Akun("budi", "rahasia123");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(bos)) { out.writeObject(a); } // serialize
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
            Akun b = (Akun) in.readObject();                                             // deserialize
            System.out.println(b.user + " / password=" + b.pass);                         // budi / null
        }
        // Untuk file: new FileOutputStream("akun.ser") / new FileInputStream("akun.ser")
    }
}
class Akun implements Serializable {
    private static final long serialVersionUID = 1L;
    String user; transient String pass;
    Akun(String u, String p) { user = u; pass = p; }
}
