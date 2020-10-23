/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6.nilaikuliah;

/**
 *
 * @author Setiadi
 */
import java.util.Scanner;
public class nilaikuliah {
    public static void main (String[] args){
        String opt2, nilai_mutu;
        final double absensi, tugas1, tugas2, htugas, uts, uas, akhir;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== Menghitung Nilai Mahasiswa ===");
        
        System.out.println("Masukan Absensi");
        absensi = input.nextInt();
        
        System.out.println("Masukan nilai tugas 1 :");
        tugas1 = input.nextInt();
        
        System.out.println("Masukan nilai tugas 2 :");
        tugas2 = input.nextInt();
        
        if (tugas2 == 0) {
            htugas = tugas1;  
        }
        else {
            htugas = (tugas1 + tugas2 / 2);
        }

        System.out.println("Masukan nilai UTS :");
        uts = input.nextInt();
        
        System.out.println("Masukan nilai UAS :");
        uas = input.nextInt();
        
        akhir = (0.25 * htugas + 0.35 * uts + 0.4 * uas);
        
        if (absensi < 75) {
            nilai_mutu = "E";
            System.out.println("Nilai mutu " + nilai_mutu);
        }
        else if (absensi >= 75) {
            if (akhir >= 80) {
                nilai_mutu = "A";
            }
            else if (akhir >= 68 && akhir <= 79) {
                nilai_mutu = "B";
            }
            else if (akhir >=60 && akhir <=68 ) {
                nilai_mutu = "C";
            }
            else if (akhir >=50 && akhir <= 59) {
                nilai_mutu = "D";
            }
            else if (akhir >=0 && akhir <= 49) {
                nilai_mutu = "E";
            }
            else {
                nilai_mutu = "IDIOT";
            }
            System.out.println("Nilai akhirnya " + akhir + " dengan nilai mutu " + nilai_mutu);
        }
        
        
    }
}
