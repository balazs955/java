/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2022.pkg10.pkg18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Feladat20221018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /** 1. feladat */
    System.out.println("Kérem a nevedet: ");
    Scanner diak = new Scanner(System.in);
    String fullname = diak.nextLine();
    System.out.println("A neved: " + fullname);
    /** 2. feladat */
    String firstname = fullname.split(" ")[0];
    System.out.println("-----" + firstname);
    /** 3. feladat */
    String lastname = fullname.split(" ")[1];
    System.out.println("-----" + lastname);
    /** 4. feladat */
    /** 5. feladat */
    
    
    }
    
}
