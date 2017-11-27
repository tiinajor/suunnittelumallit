/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Tiina
 */
public class Clothes extends ClothesStore implements ClothesInterface{

    public Clothes(String vaate1, String vaate2, String vaate3, String vaate4) {
        super(vaate1, vaate2, vaate3, vaate4);
    }

    public String[] listOfClothes() {
        String[] vaatteet = new String[4];
        vaatteet[0] = getVaate1();
        vaatteet[1] = getVaate2();
        vaatteet[2] = getVaate3();
        vaatteet[3] = getVaate4();
        return vaatteet;
    }

  
    
}
