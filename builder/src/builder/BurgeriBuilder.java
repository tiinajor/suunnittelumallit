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
public abstract class BurgeriBuilder {
    
    protected Burgeri burger;
    
    public Burgeri getBurger() {
        return burger;
    }
    
    public void createNewBurger() {
        burger = new Burgeri();
    }
    
    public abstract void buildBurger();
}
