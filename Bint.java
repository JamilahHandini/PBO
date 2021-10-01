/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBO;
import java.util.Scanner;
import java.math.BigInteger; //import class biginteger
/**
 *
 * @author ASUS PRO
 */
public class Bint {
    public static void main(String[] args){
    //inisialisasi
    BigInteger a = new BigInteger("0");
    BigInteger b = new BigInteger("0");
    BigInteger hasil1 = new BigInteger("0");
    BigInteger hasil2 = new BigInteger("0");
    Scanner read = new Scanner(System.in);
    //pembacaan inputan user
    a = read.nextBigInteger();
    b = read.nextBigInteger();
    System.out.println(" ");
    System.out.println(" ");
    
    hasil1 = a.add(b); //operasi penjumlahan
    System.out.println(hasil1); //menampilkan hasil jumlah
    hasil2 = a.multiply(b); //operasi perkalian
    System.out.println(hasil2); //menampilkan hasil kali
    }
}
