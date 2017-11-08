
package decorator;

/**
 *
 * @author Tiina
 */
public class Valkosipuli extends PizzaOsa {
    
    private double hinta = 0.70;
    
    public Valkosipuli (Pizza lisattavaTayte){
        super(lisattavaTayte);
    }
    
    @Override
    public double getHinta(){
        hinta += super.getHinta();
        return hinta;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription()+"- Valkosipulia \n";
    }
    
}