package strategy;

import java.util.*;

/**
 *
 * @author Tiina
 */
public class StrategyC implements ListConverter{
    
    private int x = 1;
    
    public String listToString(List lista){
        String merkkijono = "";
        ListIterator listItr = lista.listIterator();
        while(listItr.hasNext()){
            if (x >= 3){
                merkkijono += listItr.next()+ "\n";
                x=0;
            }else{
                merkkijono += listItr.next()+ " ";
            }
            x++;
        }
        return merkkijono;
    }
    
}
