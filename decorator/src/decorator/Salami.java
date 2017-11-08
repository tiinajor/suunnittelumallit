
package decorator;

/**
 *
 * @author Tiina
 */
public class Salami extends PizzaOsa {
    
    private double hinta = 1.20;
    
    public Salami (Pizza lisattavaTayte){
        super(lisattavaTayte);
    }
    
    @Override
    public double getHinta(){
        hinta += super.getHinta();
        return hinta;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription()+"- Salamia \n";
    }
    
}
