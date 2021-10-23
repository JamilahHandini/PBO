/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBO;

/**
 *
 * @author ASUS PRO
 */
public class Itachi extends Rikudo{
    private String KekkeiGenKai = "Susanoo";
    private String Dojutsu = super.Dojutsu;

    void printKekkeiGenKai(){
        System.out.println(this.KekkeiGenKai);
        setDojutsu();
    }
    void printDojutsu(){
        System.out.println(this.Dojutsu);
        setDojutsu();
        System.out.println(this.Dojutsu);
        }
    private void setDojutsu(){
        this.Dojutsu = "Mangekyou Sharingan";
    }

}
