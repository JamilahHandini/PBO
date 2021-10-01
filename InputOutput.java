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
public class InputOutput {
    public static void main(String[] args){
        String kata;    //inisialisasi var kata
        Scanner read = new Scanner(System.in); //untuk reader
        kata = read.nextLine(); //membaca inputan
        int jmlKata=1;  //inisiasi jumlah kata (mengapa 1 tidak nol? karena saat satu kata di tik dan apabila belum ada spasi maka akan terhitung 1)
        String temp=""; //inisiasi var temp untuk penampung sementara dari var kata
        for(int i=0; i< kata.length();i++){ //looping for untuk mengamnil semua kata sampai dengan karakter terakhir dalam inputan
            if((kata.charAt(i)==' ' || kata.charAt(i)==33 || kata.charAt(i)==44 || kata.charAt(i)==63 || kata.charAt(i)==47 || kata.charAt(i)==95 || kata.charAt(i)==39 || kata.charAt(i)==64)){
               //kata bertambah saat ditemukan simbol berikut ini , simbol diwakilkan dengan kode ascii
                jmlKata += 1;
            }
        }
       
        System.out.println(jmlKata); //menampilkan jumlah kata pada layar

        for(int i=0; i< kata.length();i++){ //looping for
            if((kata.charAt(i)==' ' || kata.charAt(i)==33 || kata.charAt(i)==44 || kata.charAt(i)==63 || kata.charAt(i)==47 || kata.charAt(i)==95 || kata.charAt(i)==39 || kata.charAt(i)==64 ) && temp.length()>0){
               //jika karakter yang diambil dari charAt adalah  simbol dan jika temp penampung tidak kosong
                System.out.println(temp); //menampilkan temp pada layar
                temp=""; //temp dikosongkan kembali
            }
            else if(kata.charAt(i)!=' ' || kata.charAt(i)!=33 || kata.charAt(i)!=44 || kata.charAt(i)!=63 || kata.charAt(i)!=47 || kata.charAt(i)!=95 || kata.charAt(i)!=39 || kata.charAt(i)!=64){
                //jika karakter yang diambil dari charAt bukan simbol maka akan dilakukan assigment pada temp dari karakter yang diambil dari var kata
                temp= temp+kata.charAt(i);
            }
        }
        System.out.println(temp); //menampilkan temp pada layar
    }
    

}
