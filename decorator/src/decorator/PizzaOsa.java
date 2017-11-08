
package decorator;

/**
 *
 * @author Tiina
 */
public abstract class PizzaOsa implements Pizza {
    
    protected Pizza lisattavaTayte; 
    double hinta = 0;

    public PizzaOsa (Pizza lisattavaTayte) {
        this.lisattavaTayte = lisattavaTayte;
    }
    
    
    public double getHinta() {
        return lisattavaTayte.getHinta(); 
    }
    
    
    public String getDescription() {
        return lisattavaTayte.getDescription();
    }
    
}
