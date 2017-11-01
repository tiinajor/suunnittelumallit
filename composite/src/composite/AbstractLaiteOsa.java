
package composite;

/**
 *
 * @author Tiina
 */
public abstract class AbstractLaiteOsa implements Laiteosa {
    
    int hinta = 0;
    
    public void addOsa (Laiteosa osa){
        throw new RuntimeException
                ("Cannot add children to simple components");
    }
    
    public int getHinta (){
        return hinta;
    }
    
}
