/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statment;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Statment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai ;
        String nama;
        
        Scanner kelulusan = new Scanner(System.in);
        System.out.println("Masukkan nama anda : ");
        nama = kelulusan.nextLine();
        
        System.out.println("Berapa nilai anda : ");
        nilai = kelulusan.nextInt();
        
        if(nilai >= 0 && nilai <= 60){
            System.out.println("Selamat nilai anda adalah E");
            System.out.println("Maaf " +nama + " Anda Tidak Lulus");
        } else if(nilai >= 61 && nilai <= 70){
            System.out.println("Selamat nilai anda adalah D");
            System.out.println("Maaf " +nama + " Anda Tidak Lulus");
        } else if(nilai >= 71 && nilai <= 80){
            System.out.println("Selamat nilai anda adalah C");
            System.out.println("Maaf " +nama + " Anda Lulus");
        } else if(nilai >= 81 && nilai <= 90){
            System.out.println("Selamat nilai anda adalah B");
            System.out.println("Maaf " +nama + " Anda Lulus");
        } else if(nilai >= 91 && nilai <= 100){
            System.out.println("Selamat nilai anda adalah A");
            System.out.println("Maaf " +nama + " Anda Lulus");
        }
    }
    
}
