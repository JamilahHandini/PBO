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
public class BukaTutupJalan {
    public static void main(String[] args){
        String s;
        String temp="";
        Scanner read = new Scanner(System.in);
        s = read.nextLine();
        //penggabungan karakter string
        for(int i=0; i< s.length();i++){
           if(s.charAt(i)!=' '){
                temp= temp+s.charAt(i);
            }
        }
        long varlong = Long.parseLong(temp);//casting string ke lonng
        long a = varlong - 999999; //varlong dikurangi 999999
        long hasil = a % 5; //menentukan sisa pembagian dengan kalkulus
        if(hasil == 0){
        System.out.println("Jalan"); //mempersilakan mobil lain jalan
        }else{
        System.out.println("Berhenti"); //mobil lain harus berhenti
        }
    }
}
