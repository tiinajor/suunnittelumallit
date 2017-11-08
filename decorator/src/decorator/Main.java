package decorator;

/**
 *
 * @author Tiina
 */
public class Main {
    
    
    public static void main(String[] args) {
        Pizza pizza1 = new Kinkku(new Salami(new Tomaattikastike(new Pohja())));
        Pizza pizza2 = new Aurajuusto(new Herkkusieni (new Valkosipuli(new Tomaattikastike(new Pohja()))));
        Pizza pizza3 = new Valkosipuli(new Salami(new Tomaattikastike(new Pohja())));
        
        System.out.println("Pizza, jossa on: \n"+pizza1.getDescription()+"Hinta: "+pizza1.getHinta());
        System.out.println("Pizza, jossa on: \n"+pizza2.getDescription()+"Hinta: "+pizza2.getHinta());
        System.out.println("Pizza, jossa on: \n"+pizza3.getDescription()+"Hinta: "+pizza3.getHinta());
        //System.out.println("Ja jonka hinta on: " +pizza1.getHinta());
    }
}
