/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Tiina
 */
public class Venusaur implements Tila {
    
    private static Venusaur INSTANCE = null;
    
    private Venusaur (){}
    
    public static Venusaur  getInstance(){
        if (INSTANCE == null){
                INSTANCE = new Venusaur ();
        }
        return INSTANCE;
    }

    @Override
    public int taistele() {
        System.out.println("Venusaur venyttelee viinikumeja");
        return 20;
    }

    @Override
    public void tanssi() {
        System.out.println("Venusaur bailaa");
    }

    @Override
    public void jumppaa() {
        System.out.println("Venusaur lähti hiihtoretkelle jumppaamaan jumppa-asun kera");
    }
    
}
