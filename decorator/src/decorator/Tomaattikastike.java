package decorator;

/**
 *
 * @author Tiina
 */
public class Tomaattikastike extends PizzaOsa {
    
    private double hinta = 0.40;
    
    public Tomaattikastike(Pizza lisattavaTayte){
        super(lisattavaTayte);
    }
    
    @Override
    public double getHinta(){
        hinta += super.getHinta();
        return hinta;
    }
    
    @Override
    public String getDescription(){
        return super.getDescription()+"- Tomaattikastiketta \n";
    }
    
}
