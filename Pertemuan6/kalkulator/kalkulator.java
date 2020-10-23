/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6.kalkulator;

/**
 *
 * @author Setiadi
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class kalkulator {
  
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;
        
        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        System.out.println("==========KALKULAOTR==========");
        System.out.println("+ = Tambah");
        System.out.println("- = Kurang");
        System.out.println("* = Kali");
        System.out.println("/ = Bagi");
        System.out.println("v = Akar");
        System.out.println("==============================");
        System.out.println("Masukan Operasi yang ingin dilakukan");
        operation = op.next();
        
        if (operation.equals("+")) {
            System.out.println("Masukan angka pertama :");
            num1 = input.nextInt();
            System.out.println("Masukan angka kedua");
            num2 = input.nextInt();            
            System.out.println("Hasilnya adalah " + (num1 + num2));
        }
        if (operation.equals("-")) {
            System.out.println("Masukan angka pertama :");
            num1 = input.nextInt();
            System.out.println("Masukan angka kedua");
            num2 = input.nextInt();           
            System.out.println("Hasilnya adalah " + (num1 - num2));
        }
        if (operation.equals("*")) {
            System.out.println("Masukan angka pertama :");
            num1 = input.nextInt();
            System.out.println("Masukan angka kedua");
            num2 = input.nextInt();            
            System.out.println("Hasilnya adalah " + (num1 * num2));
        }
        if (operation .equals( "/")) {
            System.out.println("Masukan angka pertama :");
            num1 = input.nextInt();
            System.out.println("Masukan angka kedua");
            num2 = input.nextInt();            
            System.out.println("Hasilnya adalah " + (num1 / num2));
        }
        if (operation .equals( "v")) {
            System.out.println("Masukan akar :");
            num1 = input.nextInt();
            System.out.println("Akar dari " + num1 + " = " + Math.sqrt(num1));
        }
    }
    
}
