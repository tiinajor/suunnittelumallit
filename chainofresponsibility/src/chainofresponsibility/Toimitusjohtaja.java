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
public class Toimitusjohtaja extends Palkankorotus{

    @Override
    protected double maxKorotus() {
        return KOROTUS * 20;
    }

    @Override
    protected String getRooli() {
        return "TJ";
    }
    
}
