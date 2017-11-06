
package observer;

import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author Tiina
 */
public class DigitalClock implements Observer {
    
    private ClockTimer timer;
    
    public DigitalClock(ClockTimer ct){
        timer = ct;
        ct.addObserver(this);
    }
    
    public void update (Observable timer, Object o){
        timer = (ClockTimer) timer;
        draw();
    }
    
    private void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("H: "+hour);
        System.out.println("M: "+minute);
        System.out.println("S: "+second);
        System.out.println(" ");
    }
    
}
