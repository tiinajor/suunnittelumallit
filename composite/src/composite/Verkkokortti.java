/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

public class Verkkokortti extends AbstractLaiteOsa {
    
    public Verkkokortti (int hinta){
        this.hinta = hinta;
    }
    
    public String toString(){
        return "verkkokortti";
    }
    
}
