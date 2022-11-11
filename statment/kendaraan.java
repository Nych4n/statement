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
public class kendaraan {
     public static void main(String[] args){
        int penumpang;
        Scanner kendaraan = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah penumpang: ");
        penumpang = kendaraan.nextInt();
        
        switch(penumpang){
            case 1:
            System.out.println("sepeda");
            break;
            case 2:
            System.out.println("motor");
            break;
            case 4:
            System.out.println("mobil");
            break;
            case 60:
            System.out.println("pemumpang jalan kaki");
            break;
            default:
            System.out.println("tidak ada penumpang");
        }
    }
}
