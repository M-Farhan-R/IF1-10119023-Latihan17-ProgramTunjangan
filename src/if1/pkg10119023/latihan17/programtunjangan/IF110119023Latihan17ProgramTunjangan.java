/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan17.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : membuat program menghitung tunjangan
 *
 */
public class IF110119023Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("=====Program Tunjangan====");
        System.out.print("Berapa gaji pokok anda perbulan?:");
        Scanner input1 = new Scanner(System.in);

        float gaji = input1.nextInt();

        System.out.print("Status anda? (Menikah/Belum): ");
        Scanner input2 = new Scanner(System.in);

        String status = input2.next();

        float tunjangan = 0f;

        if (status.equals("Menikah")||status.equals("menikah")) {
            tunjangan = 0.35f;
        }

        float tunjanganT = gaji * tunjangan;
        float total = tunjanganT + gaji;
        
        System.out.println("=========Hasil Perhitungan Anda=========");
        System.out.printf("Gaji Pokok      : %12.1f%n", gaji);
        System.out.printf("Tunjangan       : %12.1f%n", tunjanganT);
        System.out.printf("Tunjangan       : %12.1f%n", total);

    }
}
