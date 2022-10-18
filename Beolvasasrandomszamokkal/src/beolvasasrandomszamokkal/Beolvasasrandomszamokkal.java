/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomszamokkal;

/**
 *
 * @author user3
 */
public class Beolvasasrandomszamokkal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    int randomSzam = (int) (Math.random() * 21) + 10; // 10-30 közötti szám
    System.out.println(randomSzam);
    randomSzam = (int)(Math.random() * 71) - 55; // -55-15 között
    System.out.println(randomSzam);
    randomSzam = (int)(Math.random() * 46) - 40; // -45-5 között
    System.out.println(randomSzam);
    randomSzam = (int)(Math.random() * 46) + 60; // 60-105 között
    System.out.println(randomSzam);
    randomSzam = (int)(Math.random() * 26) - 45; // -45-(-20) között
    System.out.println(randomSzam);
    }
    
     
}
