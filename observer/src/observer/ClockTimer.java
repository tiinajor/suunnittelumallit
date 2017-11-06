
package observer;

import java.util.Observable;

/**
 *
 * @author Tiina
 */
public class ClockTimer extends Observable {

 
    
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
       public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    public void tick(){
        second++;
        if (second >= 60){
            second = 0;
            minute++;
            if (minute >= 60){
                minute = 0;
                hour++;
                if (hour >= 24){
                    hour = 0;
                }
            }
        }
        setChanged();
        notifyObservers();
    }
    
    
    
}
