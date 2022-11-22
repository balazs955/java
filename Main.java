/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2022.pkg11.pkg22;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Main {
    public static int legkisebb(int szam, int szam2, int szam3){
        return Math.min(Math.min(szam, szam2), (szam3));
    }
    public static boolean novekvo(int szam1, int szam2, int szam3){
    if (szam1 < szam2 & szam2 < szam3) {
        return true;
    } else {
        return false;
    }
    }
    public static int osszeadas(int szam){
        
        return        
    }
    //public static String kozepso(String str)
    //{
        //int position;
       // int length;
       // if (str.length() % 2 == 0)
       // {
       // position = str.length() / 2 - 1;
        //length = 2;
        //}
        //else
        //{
        //position = str.length() / 2;
        //length = 1;
        //}
        //return str.substring(position, position + length);
    //}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);  
        System.out.println("1. szám: ");
        int sz1 = myObj.nextInt();
        System.out.println("2. szám: ");
        int sz2 = myObj.nextInt();
        System.out.println("3. szám: ");
        int sz3 = myObj.nextInt();
        System.out.println(legkisebb(sz1,sz2,sz3));
        System.out.println("-------------------");
        //System.out.print("kérek egy szót: ");
        //String str = myObj.nextLine();
        //System.out.print(kozepso(str));
        System.out.println("1. szám: ");
        int s1 = myObj.nextInt();
        System.out.println("2. szám: ");
        int s2 = myObj.nextInt();
        System.out.println("3. szám: ");
        int s3 = myObj.nextInt();
        System.out.println(novekvo(s1,s2,s3));
        System.out.println("-------------------");

        
        
    }
    
}
