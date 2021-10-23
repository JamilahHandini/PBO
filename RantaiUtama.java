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
public class RantaiUtama {
    
    private int karbon;
    private int hidrogen;
    
    public void setKarbon(int karbon){
        this.karbon=karbon;
    }
    public void setHidrogen(int hidrogen){
        this.hidrogen=hidrogen;
    }
    public int getKarbon(){
        return karbon;
    }
    public int getHidrogen(){
        return hidrogen;
    }

    public void namaRantai(int C){
      if(C==1){
                System.out.printf("Met");
            }
            else if(C==2){
                System.out.printf("Et");
            }
            else if(C==3){
                System.out.printf("Prop");
            }
            else if(C==4){
                System.out.printf("But");
            }
            else if(C==5){
                System.out.printf("Pent");
            }
            else if(C==6){
                System.out.printf("Heks");
            }
            else if(C==7){
                System.out.printf("Hept");
            }
            else if(C==8){
                System.out.printf("Okt");
            }
            else if(C==9){
                System.out.printf("Non");
            }
            else if(C==10){
                System.out.printf("Dek");
            }
    }
    
}
