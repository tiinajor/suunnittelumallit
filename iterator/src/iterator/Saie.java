package iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Tiina
 */
public class Saie extends Thread {

    Iterator itr;
    List list;

    public Saie(Iterator itr, List list) {
        this.itr = itr;
        this.list = list;
    }

    
    @Override
    public void run() {
        while(itr.hasNext()) {
   // Statements
   System.out.print(itr.next());
}
    }

}
