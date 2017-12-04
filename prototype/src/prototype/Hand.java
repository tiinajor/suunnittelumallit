package prototype;

/**
 *
 * @author Tiina
 */
public class Hand implements Cloneable{
    
    int value;
    
    public Hand(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    @Override
    public Object clone(){
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
