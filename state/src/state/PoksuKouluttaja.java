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
public class PoksuKouluttaja {

    public PoksuKouluttaja() {
        this.pokemon = Bulbasaur.getInstance();
    }
    
    private int exp;
    private Tila pokemon;
    
    public void ottele(){
        exp += pokemon.taistele();
        
        muutaMuotoa();
        
    }
    
    public void teeVaikutus(){
        pokemon.jumppaa();
        pokemon.tanssi();
    }
    
    private void muutaMuotoa(){
        
        if (exp == 50){
            pokemon = Ivysaur.getInstance();
        } else if (exp == 100){
            pokemon = Venusaur.getInstance();
        } else {
            System.out.println("Expaa on: "+exp);
        }
    }
    
}
