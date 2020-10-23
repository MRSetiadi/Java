/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6.Pertukaran;

/**
 *
 * @author Setiadi
 */
import java.util.Scanner;
public class pertukaran {
    public static void main (String[] args){
        int angka1,angka2,angka3,angka4;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan angka pertama :");
        angka1 = input.nextInt();       
        System.out.println("Masukan angka kedua :");
        angka2 = input.nextInt();       
        System.out.println("Masukan angka Ketiga :");
        angka3 = input.nextInt();        
        System.out.println("Masukan angka keempat :");
        angka4 = input.nextInt();
        
        System.out.println("=========Angka Masukan=========");
        System.out.println("Angka1 :" + angka1);
        System.out.println("Angka2 :" + angka2);
        System.out.println("Angka3 :" + angka3);
        System.out.println("Angka4 :" + angka4);
        
        int swap1,swap2,swap3,swap4;
        
        swap1 = angka1;
        swap2 = angka2;
        swap3 = angka3;
        swap4 = angka4;
        
        angka1 = swap4;
        angka2 = swap1;
        angka3 = swap2;
        angka4 = swap3;
        
        System.out.println("===========Pertukaran===========");
        System.out.println("Angka1 :" + angka1);
        System.out.println("Angka2 :" + angka2);
        System.out.println("Angka3 :" + angka3);
        System.out.println("Angka4 :" + angka4);
        
    }
}
