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
public class Berhitung {
    public static void main (String[] args){
        String s;
        int A,B,C=0;
        Scanner read = new Scanner(System.in);
        A = read.nextInt();
        s = read.next();
        B = read.nextInt();

        //validasi inputan
        if((A>=1&& A<=1000)&& (B>=1 && B<=1000)){
        if(s.charAt(0) == 43){ //jika operator adalah tambah
        C=A+B;
        }else if(s.charAt(0)== 45){ //jika operator adalah kurang
        C=A-B;
        }else if(s.charAt(0) == 42){ //jika operator adalah kali
        C=A*B;
        }else if(s.charAt(0) == 47){ //jika operator adalah bagi
        C=A/B;
        }else if(s.charAt(0) == 37){ //jika operator adalah modulus
        C=A%B;
        }
        System.out.println(C);
        }else{
            System.out.println("Input tidak valid"); //invalidasi data
        }

    }
}
