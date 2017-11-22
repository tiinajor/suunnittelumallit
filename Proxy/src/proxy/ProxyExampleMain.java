package proxy;

/**
 *
 * @author Tiina
 */
public class ProxyExampleMain {
    
    
   /**
    * Test method
    */
   public static void main(final String[] arguments) {
        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        final Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        final Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        final Image image5 = new ProxyImage("HiRes_10MB_Photo5");
        
        Image[] images = new Image[5];
        
        images[0] = image1;
        images[1] = image2;
        images[2] = image3;
        images[3] = image4;
        images[4] = image5;
        
        images[0].showData();
        images[1].showData();
        images[2].showData();
        images[3].showData();
        images[4].showData();
       

        
    }
    
}
