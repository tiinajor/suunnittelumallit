
package decorator;

/**
 *
 * @author Tiina
 */
public class Kinkku extends PizzaOsa {
    
    private double hinta = 1;
    
    public Kinkku (Pizza lisattavaTayte){
        super(lisattavaTayte);
    }
    
    @Override
    public double getHinta(){
        hinta += super.getHinta();
        return hinta;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription()+"- Kinkkua \n";
    }
    
}
