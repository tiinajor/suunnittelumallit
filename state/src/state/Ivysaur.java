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
public class Ivysaur implements Tila {
    
    private static Ivysaur INSTANCE = null;
    
    private Ivysaur(){}
    
    public static Ivysaur getInstance(){
        if (INSTANCE == null){
                INSTANCE = new Ivysaur();
        }
        return INSTANCE;
    }

    @Override
    public int taistele() {
        System.out.println("Ivysaur villiintyi");
        
        return 15;
    }

    @Override
    public void tanssi() {
        System.out.println("Ivysaur joraa");
    }

    @Override
    public void jumppaa() {
        System.out.println("Ivysaur meni zumbatunnille");
    }
    
}
