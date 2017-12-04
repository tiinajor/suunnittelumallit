package prototype;

/**
 *
 * @author Tiina
 */
public class Clock implements Cloneable {
    
    Hand minutehand;
    Hand hourhand;
    
    public Clock(int hours, int minutes){
        hourhand = new Hand(hours);
        minutehand = new Hand(minutes);
    }
    
    public String toString(){
        return "Kello onpi "+hourhand.getValue()+":"+minutehand.getValue();
    }
    
    public void changeTime(int hours, int minutes){
        hourhand = new Hand(hours);
        minutehand = new Hand(minutes);
    }
    
    @Override
    public Clock clone(){
        Clock c =null;
        try{
            c =(Clock)super.clone();
            c.hourhand = (Hand)hourhand.clone();
            c.minutehand = (Hand)minutehand.clone();
        }catch (CloneNotSupportedException e){}
        
        return c;
    }
    
}
