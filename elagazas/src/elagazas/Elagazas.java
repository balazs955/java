/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

/**
 *
 * @author diak
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //egyágú elágazás
        int szam = 20;
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája:" + szam*2);
        }
        //kétágú elágazás
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája:" + szam*2);
        }
        else{
            System.out.println("Nem nagyobb");
        }
        
        //többágú elágazás
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája:" + szam*2);
        }
        else if (szam < 20){
            System.out.println("Kisebb");
        }
        else{
            System.out.println("Egyenlő");
        }
        
        //sok ágú
        int honap = 10;
        switch( honap ) {
            case 1: System.out.println("Január"); break;
            
            case 10: System.out.println("Október"); break;
            
            case 11: System.out.println("November"); break;
            
            default: System.out.println("Nem meghatározható");
        }
        
        //random generáltassunk egy karaktert
        int randomChar = (char) (Math.random() * 26) + 97;//97-122
        System.out.println(randomChar);
        System.out.println((char)randomChar);
        
    }
    
}
