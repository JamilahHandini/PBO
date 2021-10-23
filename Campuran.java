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
public class Campuran {
    String namaCampuran;
    String jenis;
    Senyawa[] senyawa = new Senyawa[2];

    Campuran(String namaCampuran, String jenis){
        this.namaCampuran=namaCampuran;
        this.jenis=jenis;
    }
    public void addSenyawa(Senyawa senyawa1, Senyawa senyawa2){
        this.senyawa[0]=senyawa1;
        this.senyawa[1]=senyawa2; 
    }
    public void printCampuran(){
        System.out.println("Nama Campuran: " + this.namaCampuran);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Campuran dari Senyawa: "+senyawa[0].getNamaSenyawa()+" dan "+senyawa[1].getNamaSenyawa());
        System.out.println(" ");
       }
}
