/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Tiina
 */
public class FlipDownCommand implements CommandInterface {
    
    private Light light;
    
public FlipDownCommand(Light light) {
this.light = light;
}
@Override // Command
public void execute() {
light.turnOff();
}
    
}
