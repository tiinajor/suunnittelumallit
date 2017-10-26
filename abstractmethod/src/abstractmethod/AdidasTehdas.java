
package abstractmethod;

public class AdidasTehdas implements AbstraktiTehdas {
    
@Override
public Lippis createLippis() {
    return new AdduLippis();
    }

    @Override
    public Paita createPaita() {
        return new AdduPaita();
    }

    @Override
    public Housut createHousut() {
        return new AdduHousut();
    }

    @Override
    public Kengat createKengat() {
        return new AdduKengat();
    }
}
