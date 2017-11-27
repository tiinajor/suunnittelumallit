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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClothesInterface listOfClothes = new Clothes("Paita", "Housut", "Hattu", "Takki");
        
        for (String vaate : listOfClothes.listOfClothes()) {
            System.out.println("Vaate: " + vaate);
        }
    }
    
}
