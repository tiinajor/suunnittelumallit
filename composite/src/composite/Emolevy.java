
package composite;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiina
 */
public class Emolevy extends AbstractLaiteOsa {
    
    List<Laiteosa> childList = new ArrayList<Laiteosa>();
    
    public Emolevy(int hinta){
        this.hinta = hinta;
    }
    
    @Override
    public int getHinta(){
        int kokoHinta = hinta;
        if (!childList.isEmpty()){
            for (Laiteosa o : childList){
                kokoHinta += o.getHinta();
            }
        }
        return kokoHinta;
    }
    
    public void addOsa (Laiteosa osa){
        childList.add(osa);
    }
    
    public String toString(){
        String kokoString = " ";
        if (childList.isEmpty()){
            kokoString = "emolevy";
        }else{
            kokoString = "emolevy";
            kokoString += ", johon on kiinnitetty: [";
            for (Laiteosa o : childList){
                kokoString += " "+o.toString();
            }
            kokoString += "]";
        }
        return kokoString;
    }
    
}
