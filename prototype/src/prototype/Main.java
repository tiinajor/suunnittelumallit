package prototype;

/**
 *
 * @author Tiina
 */
public class Main {
    
    public static void main(String[] args) {
        
        Clock clock = new Clock(6,42);
        Clock clockclone = clock.clone();
        
        System.out.println("Alkuperäinen: "+clock);
        System.out.println("Klooni: "+clockclone);
        System.out.println("");
        
        clock.changeTime(5, 25);
        clockclone.changeTime(4, 12);
        
        System.out.println("Alkuperäinen: "+clock);
        System.out.println("Klooni: "+clockclone);
    }
    
}
