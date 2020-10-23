/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6.Bintang;

/**
 *
 * @author Setiadi
 */
import java.util.Scanner;
public class bintang {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka :");
        int a=input.nextInt();
        int x,y;
        
        System.out.println("Hasil");
        for (x=1;x<=a;x++){
            for (y=x;y<=a;y++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
