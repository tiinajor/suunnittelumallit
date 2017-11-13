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
public class Bulbasaur implements Tila {
    
    private static Bulbasaur INSTANCE = null;
    
    private Bulbasaur(){}
    
    public static Bulbasaur getInstance(){
        if (INSTANCE == null){
                INSTANCE = new Bulbasaur();
        }
        return INSTANCE;
    }

    @Override
    public int taistele() {
        
        System.out.println("Bulba riehuu");
        
        return 10;
    }

    @Override
    public void tanssi() {
        System.out.println("Bulba tanssii kuin gopnik konsanaan");
    }

    @Override
    public void jumppaa() {
        System.out.println("Bulba jumppaa koska on jumppamaisteri");
    }

    
}
