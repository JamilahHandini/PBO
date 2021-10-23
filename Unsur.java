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
public class Unsur {
    
    public String namaUnsur;
    public int nomorAtom;

    Unsur(String namaUnsur, int nomorAtom){
        this.namaUnsur=namaUnsur;
        this.nomorAtom=nomorAtom;
    }
    public String getNamaUnsur(){
        return namaUnsur;
    }

}
