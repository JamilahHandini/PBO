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
public class TataNama {
    
    
    int[] nocab = new int[10];
  
    
    public void firstTataNama(int H, int C, int A, int B, int R, int[] nocab){
        SenyawaHidrokarbon Hidrokarbon = new SenyawaHidrokarbon();
        Hidrokarbon.SenyawaHK(H,C,A);
     
        for(int i=0;i<B;i++){
            System.out.printf("%d,",nocab[i]);
        }
        Hidrokarbon.banyakGugus(B);
        Hidrokarbon.rangkap(R);
        int id;
        id=Hidrokarbon.getID();
        System.out.println(id);
        Hidrokarbon.printNama(id,C);
    }
    

}
