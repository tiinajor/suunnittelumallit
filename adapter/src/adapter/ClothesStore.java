package adapter;

/**
 *
 * @author Tiina
 */
public class ClothesStore {
    String vaate1;
    String vaate2;
    String vaate3;
    String vaate4;
    
    public ClothesStore(String vaate1, String vaate2, String vaate3, String vaate4) {
        this.vaate1 = vaate1;
        this.vaate2 = vaate2;
        this.vaate3 = vaate3;
        this.vaate4 = vaate4;
    }
    
    public String getVaate1() {
        return this.vaate1;
    }
 
    public String getVaate2() {
        return this.vaate2;
    }
    
    public String getVaate3() {
        return this.vaate3;
    }
    
    public String getVaate4() {
        return this.vaate4;
    }
    
}
