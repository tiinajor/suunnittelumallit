
package decorator;

/**
 *
 * @author Tiina
 */
public class Aurajuusto extends PizzaOsa {
    
    private double hinta = 2;
    
    public Aurajuusto (Pizza lisattavaTayte){
        super(lisattavaTayte);
    }
    
    @Override
    public double getHinta(){
        hinta += super.getHinta();
        return hinta;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription()+"- Aurajuustoa \n";
    }
    
}
