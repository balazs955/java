/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2022.pkg11.pkg08;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Main {
    public static int gula(int hossz , int magassag) {
        int terfogat = (((hossz * hossz) * magassag) / 3);
        return terfogat;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Kérem a gúlának a hosszát");
        int hossz = myObj.nextInt();
        System.out.println("Kérem a gúlának a magasságát");
        int magassag = myObj.nextInt();
        System.out.println("A gúla területe: " + gula(hossz,magassag));
    }
    
}
