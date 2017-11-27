/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Tiina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Waiter waiter = new Waiter();

        BurgeriBuilder md = new McDonalds();
        BurgeriBuilder hese = new Hesburger();
        
        waiter.setBurgerBuilder(md);
        waiter.constructBurger();
        
        Burgeri burger = waiter.getBurger();
        
        System.out.println("~*~*~*~McDonalds~*~*~*~");
        System.out.println(burger.getBurger());
        
        System.out.println("~*~*~*~Hesburger~*~*~*~");
        waiter.setBurgerBuilder(hese);
        waiter.constructBurger();
        burger = waiter.getBurger();
        System.out.println(burger.getBurger());
    }
    
}
