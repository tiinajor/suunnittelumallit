
package templatemethod;

import java.util.Scanner;

/**
 *
 * @author Tiina
 */
public class Templatemethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AbstraktiGame pelinen = new NoppaArvaus();
    Scanner scanner = new Scanner(System.in);
    
        int pelaajalkm;
        System.out.println("Anna pelaajien lukumäärä");
        pelaajalkm = scanner.nextInt();
        
        pelinen.playOneGame(pelaajalkm);
    }
    
}
