package singleton;

public class AdidasTehdas implements AbstraktiTehdas {
    
    
    private static AdidasTehdas INSTANCE = null;
    
    private AdidasTehdas(){}
    
    public static AdidasTehdas getInstance(){
        if (INSTANCE == null){
                INSTANCE = new AdidasTehdas();
        }
        return INSTANCE;
    }
    
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
