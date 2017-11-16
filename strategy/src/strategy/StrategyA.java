package strategy;

import java.util.List;

/**
 *
 * @author Tiina
 */
public class StrategyA implements ListConverter {
    
    public String listToString(List lista){
        String merkkijono = "";
        for(int i = 0; i<lista.size(); i++){
            merkkijono += lista.get(i);
            merkkijono += "\n";
        }
        return merkkijono;
    }
    
}
