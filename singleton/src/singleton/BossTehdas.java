package singleton;

public class BossTehdas implements AbstraktiTehdas {
    
    private static BossTehdas INSTANCE = null;
    
    private BossTehdas(){}
    
    public static BossTehdas getInstance(){
        if (INSTANCE == null){
                INSTANCE = new BossTehdas();
        }
        return INSTANCE;
    }
    
    @Override
    public Lippis createLippis() {
    return new BossLippis();
    }

    @Override
    public Paita createPaita() {
        return new BossPaita();
    }

    @Override
    public Housut createHousut() {
        return new BossHousut();
    }

    @Override
    public Kengat createKengat() {
        return new BossKengat();
    }
}