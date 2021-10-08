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
public class Barang {
    
    String kode_barang;
    String nama_barang;
    private int stok;

        public Barang(String kode, String nama, int stk){
            kode_barang=kode;
            nama_barang=nama;
            setStok(stk);
    }
    public int getStok(){
        return this.stok;
    }
    public void setStok(int stk){
        if(stk<0){
        stk*=-1;
        }
        this.stok += stk;
       
        //this.stok+=stk;
    }
}