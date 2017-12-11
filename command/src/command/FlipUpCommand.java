package command;

/**
 *
 * @author Tiina
 */
public class FlipUpCommand implements CommandInterface {
    
    private Light light;
    
public FlipUpCommand(Light light) {
this.light = light;
}
@Override // Command
public void execute() {
light.turnOn();
}
    
}
