/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

import java.util.Arrays;

/**
 *
 * @author user3
 */
public class Stringmetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String szoveg = "Ez egy tetszőleges szöveg";
        
        System.out.println(szoveg.length());
        
        System.out.println(szoveg.toLowerCase());
        
        System.out.println(szoveg.toUpperCase());
        
        System.out.println(szoveg.trim().length());
        
        System.out.println(szoveg.compareTo("Ez egy szöveg"));
        
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        System.out.println(szoveg.split(" "));
        
        Integer szam = 512;
        System.out.println(szam.toString());
        
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3, 6));
        
        
    }
    
}
