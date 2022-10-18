/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author user3
 */
public class BeolvasasRandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Bill = new Scanner(System.in);
        
        // adat beolvasas billentyűzetről - egész szám
       
    "    
        System.out.print("Adj meg egy egész számot: ");
        
        int szam;
        szam = Bill.nextInt();
        System.out.println("A beolvasott érték: " + szam);
        
        
        System.out.println("Adj meg egy valós számot: ");
        float szam2;
        szam2 = Bill.nextFloat();
        System.out.println("A beolvasott érték: " + szam2);
        
        System.out.print("Adj meg egy mondatot: ");
        String szoveg;
        String Space = " ";
        
        szoveg = Bill.next(Space);
        System.out.print("A mondat: " + szoveg);   ""      
        
        int randomSzam = (int) (Math.random() * 21) + 10;
        
        System.out.println(randomSzam);
        
    }
    
}
