
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiina
 */
public class Tietokone {
    List<Laiteosa> osat = new ArrayList<Laiteosa>();
    
    public void rakenna(){
        Laiteosa kotelo = new Kotelo(50);
        Laiteosa emolevy = new Emolevy(100);
        Laiteosa muisti = new Muistipiiri(44);
        Laiteosa näyttis = new Naytonohjain(400);
        Laiteosa prossu = new Prosessori(356);
        Laiteosa verkkokortti = new Verkkokortti(35);
        Laiteosa varaprossu = new Prosessori(348);
        
        emolevy.addOsa(muisti);
        emolevy.addOsa(näyttis);
        emolevy.addOsa(prossu);
        emolevy.addOsa(verkkokortti);
        kotelo.addOsa(emolevy);
        osat.add(kotelo);
        osat.add(varaprossu);
        
    }
    
    public String getOsat(){
        String osaString = "";
        for(Laiteosa o : osat){
            osaString += o.toString() + " ";
        }
        return osaString;
    }
    
    public int kerroHinta(){
        int koneenHinta = 0;
        for (Laiteosa o : osat){
            koneenHinta += o.getHinta();
        }
        return koneenHinta;
    }
    
}
