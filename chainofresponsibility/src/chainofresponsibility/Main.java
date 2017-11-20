/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Tiina
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pomo esimies = new Pomo();
        SuperPomo superEsimies = new SuperPomo();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        
        esimies.setSuccessor(superEsimies);
        superEsimies.setSuccessor(tj);
        
        int[] tyolaiset = new int[10];
        
        for (int i = 0; i < 9; i++) {
            tyolaiset[i] = 1 + (int)(Math.random() * 10);
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.println("~~~ TYÖNTEKIJÄ NRO." + (i+1)+"~~~");
            esimies.processRequest(new KorotusPyynto(tyolaiset[i]));
            System.out.println("");
        }
        
}
    
}
