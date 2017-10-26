/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmethod;

public class BossTehdas implements AbstraktiTehdas {
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