package templatemethod;

import java.util.Scanner;

/**
 *
 * @author Tiina
 */

 class NoppaArvaus extends AbstraktiGame { 
     
     private int arvattuLuku;
     private int lukuMin;
     private int lukuMax;
     private Scanner scanner;
     private int kohde;
     
     void initializeGame() { 
         //alusta peli
       scanner = new Scanner(System.in);
       lukuMin = 1;
       
       System.out.println("Anna maksimi arvo");
       lukuMax = scanner.nextInt();
         
       kohde = (lukuMin + (int)(Math.random()*lukuMax));
         System.out.println("Peli alkaa");
         
     } 
     
     void makePlay(int player) { 
         System.out.println("Pelaaja "+(player+1)+" arvaa numero "+lukuMin+" ja "+lukuMax+" väliltä, kiitoooooos:");
         arvattuLuku = scanner.nextInt();
         
         if(arvattuLuku < kohde){
                System.out.println("Arvaa suurempi luku kiitoooooos");
         } else if (arvattuLuku > kohde){
             System.out.println("Arvaa pienempi luku");
             
         } else {
             System.out.println("Luvut täsmäävät");
         }
     } 
     boolean endOfGame() { 
         
         if (arvattuLuku == kohde){
             return true;
             
         } else {
             return false;
         }
     } 
     
     void printWinner() { 
         System.out.println("Voitit jee");
     } 
     /* Specific declarations for the Monopoly game. */ 
     // ... 
 } 
 
