
package composite;

/**
 *
 * @author Tiina
 */
public class Main {
    
    public static void main(String[] args) {
        Tietokone tietsikka = new Tietokone();
        int hinta;
        tietsikka.rakenna();
        String osaString = tietsikka.getOsat();
        System.out.println(osaString);
        hinta = tietsikka.kerroHinta();
        System.out.println("Tietokoneen hinta onpi: "+hinta);
    }
    
}
