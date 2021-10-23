/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package senyawahidrokarbon;

/**
 *
 * @author ASUS PRO
 */
import java.util.Scanner;
import java.io.*;
public class MainClass {
    public static void main(String[] args){
        
       
        
        
        
        System.out.println("           UNSUR & SENYAWA           ");
        System.out.println("=======================================");
        Unsur u1 = new Unsur("Hidrogen",1);
        Unsur u2 = new Unsur("Oksigen",8);
        Unsur u3 = new Unsur("Kalium",19);
        Unsur u4 = new Unsur("Natrium",11);
        Unsur u5 = new Unsur("Klor",17);
        Unsur u6 = new Unsur("Nitrogen",7);
        Senyawa s1 = new Senyawa("Air","Cair","Netral",u1,u2);
        s1.printSenyawa();
        Senyawa s2 = new Senyawa("Kalium Hidroksida","Padat","Basa",u1,u3);
        s2.printSenyawa();
        Senyawa s3 = new Senyawa("Natrium Klorida","Padat","Netral",u4,u5);
        s3.printSenyawa();
        Senyawa s4 = new Senyawa("Amonia","Gas","Asam",u1,u6);
        s4.printSenyawa();
        
        System.out.println("           CAMPURAN          ");
        System.out.println("==============================");
        Campuran camp1 = new Campuran("Larutan Garam","Homogen");
        camp1.addSenyawa(s1,s3);
        camp1.printCampuran();
        Campuran camp2 = new Campuran("Amonium Klorida","Heterogen");
        camp2.addSenyawa(s2,s4);
        camp2.printCampuran();
        
        
        int C, H, A, B, R;
        Scanner read = new Scanner(System.in);
        System.out.println("           TATA NAMA           ");
        System.out.println("Jumlah atom karbon: ");
        C = read.nextInt();
        System.out.println("Jumlah atom hidrogen: ");
        H = read.nextInt();
        GugusAlkil alkil = new GugusAlkil();
        alkil.printAlkil();
        A = read.nextInt();
        System.out.println("Banyak gugus alkil: ");
        B = read.nextInt();
        System.out.println("Nomor Cabang: ");
        int[] nocab = new int[10];
        for(int i=0; i<B ; i++){
            nocab[i]= read.nextInt();
        }
        
        System.out.println("Nomor Rangkap: ");
        R = read.nextInt();

        TataNama nama = new TataNama();
        nama.firstTataNama(H,C,A,B,R,nocab);
    }
}
