/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBO;
import java.util.Scanner;

/**
 *
 * @author ASUS PRO
 */
public class InputOutput2 {
    public static void main (String[] args){
        String s,t,u;
        int i,j,k;
        Scanner read = new Scanner(System.in);
        s = read.next();
        i = read.nextInt();
        t = read.next();
        j = read.nextInt();
        u = read.next();
        k = read.nextInt();
        System.out.println("====================================");
            System.out.printf("%-15s%03d%n",s,i); //%-15s untuk ratakiri 15 karakter
            System.out.printf("%-15s%03d%n",t,j);   //%03d untuk mengambil 3 digit angka
            System.out.printf("%-15s%03d%n",u,k);   //%n untuk membuat garis baru
        
        System.out.println("====================================");
    }
}
