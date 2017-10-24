package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus opettaja2 = new Opettaja2();
        opettaja2.aterioi();
        
        AterioivaOtus opettaja3 = new Opettaja3();
        opettaja3.aterioi();
    }
}
