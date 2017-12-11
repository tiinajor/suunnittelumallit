package facade;

/**
 *
 * @author Tiina
 */
public class ComputerFacade {
    
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(3, hd.read(2, 1));
        processor.jump(4);
        processor.execute();
    }
    
}
