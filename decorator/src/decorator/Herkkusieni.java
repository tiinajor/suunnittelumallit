
package decorator;

/**
 *
 * @author Tiina
 */
public class Herkkusieni extends PizzaOsa {
    
    private double hinta = 1.30;
    
    public Herkkusieni (Pizza lisattavaTayte){
        super(lisattavaTayte);
    }
    
    @Override
    public double getHinta(){
        hinta += super.getHinta();
        return hinta;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription()+"- Herkkusieniä \n";
    }
    
}
