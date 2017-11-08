
package decorator;

/**
 *
 * @author Tiina
 */
public class Pohja implements Pizza {
    
    private double hinta = 5;

    public double getHinta() {
        return hinta;
    }
    
    public String getDescription() {
        return "- Pohja \n";
    }
    
}
