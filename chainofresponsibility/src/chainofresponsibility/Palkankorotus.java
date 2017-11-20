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
public abstract class Palkankorotus {
    
    protected static final int KOROTUS = 1;
    protected Palkankorotus successor;
    
    abstract protected double maxKorotus();
    abstract protected String getRooli();
    
    public void setSuccessor(Palkankorotus successor) {
        this.successor = successor;
    }
    
    public void processRequest(KorotusPyynto pyynto) {
        if (pyynto.getPyynto() <= this.maxKorotus()) {
            System.out.println(this.getRooli() + " hyväksyi " + pyynto.getPyynto() + "% palkankorotuksen");
        }else if (successor != null) {
            successor.processRequest(pyynto);
        }
    }
    
    
    
    
}
