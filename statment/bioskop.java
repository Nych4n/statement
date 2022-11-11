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
public class bioskop {
    public static void main(String[] args) {
        int umur;
    Scanner Bioskop = new Scanner(System.in);
    
    System.out.println("masukkan umur: ");
    umur = Bioskop.nextInt();
        //membuat kondisi
        switch(umur){
            case 18:
                System.out.println("boleh");
                break;
            case 19:
                System.out.println("boleh");
                break;
            case 20:
                System.out.println("boleh");
                break;
            default:
                System.out.println("nikmati masa tua di rumah");
        }
    }
}
