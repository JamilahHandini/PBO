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
public class GugusAlkil {

    private int alkil;
    private int banyakAlkil;
    
    public void setAlkil(int alkil){
        this.alkil=alkil;
    }
    public int getAlkil(){
        return alkil;
    }

    public void printAlkil(){
        System.out.println("Pilih gugus Alkil dibawah ini.");
        System.out.println(" [1] CH3");
        System.out.println(" [2] C2H5");
        System.out.println(" [3] C3H7");
    }

}
