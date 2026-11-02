/* W5S3 1.2 - Overriding hierarki penyihir + RonWeasley (tambahan). */
public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir[] tim = { new HarryPotter(), new Hermione(), new RonWeasley(), new Penyihir() };
        for (Penyihir p : tim) p.ucapkanMantra();     // satu loop, perilaku beda-beda
    }
}
class Penyihir { public void ucapkanMantra() { System.out.println("Mengucapkan mantra dengan cara biasa."); } }
class HarryPotter extends Penyihir { @Override public void ucapkanMantra() { System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik."); } }
class Hermione extends Penyihir { @Override public void ucapkanMantra() { System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri."); } }
class RonWeasley extends Penyihir { @Override public void ucapkanMantra() { System.out.println("Ron Weasley mengucapkan mantra dengan ragu, tongkatnya sedikit retak."); } }
