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
public class Waiter {
    private BurgeriBuilder bb;
    
    public void setBurgerBuilder(BurgeriBuilder bb) {
        this.bb = bb;
    }
    
    public Burgeri getBurger() {
        return bb.getBurger();
    }
    
    public void constructBurger() {
        bb.createNewBurger();
        bb.buildBurger();
    }
}
