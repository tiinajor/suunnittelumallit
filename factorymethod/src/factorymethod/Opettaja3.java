/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Tiina
 */
public class Opettaja3 extends AterioivaOtus{
    
    public Juoma createJuoma() {
        return new Olut();
    }
}
