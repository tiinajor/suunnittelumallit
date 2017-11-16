package strategy;

import java.util.List;

/**
 *
 * @author Tiina
 */
public class Converter {
    
    private ListConverter strategy;
    
    public Converter(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public String convert(List lista){
        String merkkijono;
        merkkijono = strategy.listToString(lista);
        return merkkijono;
    }
    
    public void setStrategy(ListConverter strategy){
        this.strategy = strategy;
    }    
}
