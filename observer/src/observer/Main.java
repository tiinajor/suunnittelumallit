/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Tiina
 */
public class Main {
    
    public static void main(String[] args){
        ClockTimer timer = new ClockTimer();
        DigitalClock digi = new DigitalClock(timer);
        
        timer.tick();
        timer.tick();
        timer.tick();
        timer.tick();
    }
    
}
