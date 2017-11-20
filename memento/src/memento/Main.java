/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Tiina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Asiakas asiakas = new Asiakas("Seppo");
        Asiakas olavi = new Asiakas("Olavi");
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        asiakas.pelinAvaus(arvuuttaja.liityPeliin());
        olavi.pelinAvaus(arvuuttaja.liityPeliin());
        
        asiakas.arvaus(arvuuttaja);
        asiakas.arvaus(arvuuttaja);
        asiakas.arvaus(arvuuttaja);
        asiakas.arvaus(arvuuttaja);
        System.out.println("~*~*~*~");
        olavi.arvaus(arvuuttaja);
        olavi.arvaus(arvuuttaja);
        olavi.arvaus(arvuuttaja);
        olavi.arvaus(arvuuttaja);
    }
    
}
