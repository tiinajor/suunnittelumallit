package strategy;

import java.util.List;

/**
 *
 * @author Tiina
 */
public class StrategyB implements ListConverter {
    
    public String listToString(List lista){
        String merkkijono = "";
        String[] taulukko = (String[]) lista.toArray(new String[0]);
        for (int i =0; i < taulukko.length; i+=2){
            merkkijono += taulukko[i];
            merkkijono += " ";
            merkkijono += taulukko[i+1];
            merkkijono += "\n";
        }
        
        return merkkijono;
    }
    
}
