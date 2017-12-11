package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tiina
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList();
		for(int i = 0; i<100; i++) {
			list.add("Numero:"+i+"\n");
		}
        
        Saie saie = new Saie(list.iterator(), list);
        Saie saie2 = new Saie(list.iterator(), list);
        
        saie.start();
        saie2.start();
        
        while(saie.isAlive() || saie2.isAlive()) {
		}
		try {
			saie.join();
			saie2.join();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------");
                
                Iterator iterator = list.iterator();
                Saie saie3 = new Saie(iterator, list);
                
                saie3.start();
                
                
    }
    
}
