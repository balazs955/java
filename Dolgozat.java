/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat;

/**
 *
 * @author user3
 */
public class Dolgozat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String szoveg = "Sok Lúd disznót győz";
        
        System.out.println(szoveg.length());
        System.out.println(szoveg.compareTo("Sok Lúd disznót győz"));
        System.out.println(szoveg.compareToIgnoreCase("Sok Lúd disznót győz"));
        System.out.println(szoveg.contains("lúd"));
        System.out.println(szoveg.indexOf("lúd"));
        System.out.println(szoveg.replace("lúd", "veréb"));
        
    }
    
}
