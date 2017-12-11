package facade;

/**
 *
 * @author Tiina
 */
public class Memory {
    public void load(long position, byte[] data) { 
        String ret = "";
		for(int i = 0; i<data.length; i++) {
			ret += data[i];
		}
		System.out.println("Loading data from position: " +position+ " Data: "+ret);
    }
    
}
