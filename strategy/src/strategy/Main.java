package strategy;

import java.util.*;

/**
 *
 * @author Tiina
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList();
        String changed = "";
        Converter changer = new Converter(new StrategyA());
        lista.add("Seppo1");
        lista.add("Seppo2");
        lista.add("Seppo3");
        lista.add("Seppo4");
        lista.add("Seppo5");
        lista.add("Seppo6");
        lista.add("Seppo7");
        lista.add("Seppo8");
        lista.add("Seppo9");
        lista.add("Seppo10");
        lista.add("Seppo11");
        lista.add("Seppo12");
        lista.add("Seppo13");
        lista.add("Seppo14");
        
        
        changed = changer.convert(lista);
        System.out.println(changed);
        
        changer.setStrategy(new StrategyB());
        changed = changer.convert(lista);
        System.out.println(changed);
        
        changer.setStrategy(new StrategyC());
        changed = changer.convert(lista);
        System.out.println(changed);
    }
    
}
