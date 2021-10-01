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
public class GajiAgen {
public static void main(String[] args){
    int jmlItem=0; //jumlah item terjual
    int pokok=500000; //upah pokok
    int total=0;    //total gaji
    int item =50000;    //harga per item
    double persen;  //persenan bonus atau potongan
    Scanner read = new Scanner(System.in);
    jmlItem = read.nextInt();
    

if(jmlItem<15){
    persen = 0.15 * (double)item; 
    total = pokok - (int)persen;} //pemotongan 15 persen dari penjualan terakhir
else if(jmlItem>40){
    persen = 0.25 * (double)item *jmlItem; 
    total = pokok + (int)persen;} //bonus 25 persen dari total penjualan
else if(jmlItem>80){
    persen = 0.35 * (double)item * jmlItem;
    total = pokok + (int)persen;} //bonud 35 persen dari total penjualan
else{
    persen = 0.10 * (double)item * jmlItem;
    total = pokok + (int)persen;}   //bonus 10 persen dari total penjualan

System.out.println(total);   
}
}
