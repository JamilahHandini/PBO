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
public class SenyawaHidrokarbon {
    private RantaiUtama ru = new RantaiUtama();
    private GugusAlkil al = new GugusAlkil();
   
    private int ID;
    int alkana,alkena,alkuna;
    
    public void SenyawaHK(int H, int C, int A){
       
        ru.setKarbon(C);
        ru.setHidrogen(H);
        al.setAlkil(A);
        System.out.println("c"+C);
        System.out.println("Jenis Senyawa Hidrokarbon adalah:");
        alkana=C*2+2;
        alkena=C*2;
        alkuna=C*2-2;
        
        
        if(H == alkana){
            System.out.println("ALKANA");
            this.ID = 1;
        }else if(H == alkena){
            System.out.println("ALKENA");
            this.ID = 2;
        }else if(H == alkuna){
            System.out.println("ALKUNA");
            this.ID = 3;
        }
        
        System.out.println("Dengan Gugus Alkil:");
        if(al.getAlkil()==1){
            System.out.println("METIL");
        } else if(al.getAlkil()==2){
            System.out.println("ETIL");
        } else if(al.getAlkil()==3){
            System.out.println("PROPIL");
        }
    }
    
    public void printNama(int ID, int C){
            if(ID==1){
                ru.namaRantai(C);
                System.out.printf("ana");
            }

            else if(ID==2){
            ru.namaRantai(C);
            System.out.printf("ena");
            }
        else if(ID==3){
            ru.namaRantai(C);
            System.out.printf("una");
        }
    }



    public void banyakGugus(int G){
        if(G==1){
            if(al.getAlkil()==1){
                System.out.println("metil");
            } else if(al.getAlkil()==2){
                System.out.println("etil");
            } else if(al.getAlkil()==3){
                System.out.println("propil");
            }
        }
        else if(G==2){
            System.out.println("Di-");
            if(al.getAlkil()==1){
                System.out.println("metil");
            } else if(al.getAlkil()==2){
                System.out.println("etil");
            } else if(al.getAlkil()==3){
                System.out.println("propil");
            }
        }
        else if(G==3){
            System.out.println("Tri-");
            if(al.getAlkil()==1){
                System.out.println("metil");
            } else if(al.getAlkil()==2){
                System.out.println("etil");
            } else if(al.getAlkil()==3){
                System.out.println("propil");
            }
        }
    }
    public int getID(){
        return ID;
    }
    public void rangkap(int R){
        if(ID==2 || ID ==3){
            if(R<=ru.getKarbon()){
                System.out.printf("-%d",R);
            }
        }
    }
}
