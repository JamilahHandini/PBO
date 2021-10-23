
package PBO;

/**
 *
 * @author ASUS PRO
 */
public class OrderResto {
            MenuResto[] makanan = new MenuResto[10];
    

    private byte ID = 0;
    
    public  void setID(int id){
        this.ID=(byte)id;
    }
    public byte getID(){
        return ID;
    }
    
    public  void nextId(){
        ID++;
    }

    public void setMakanan(String nama, double harga, int stok){
        MenuResto[] food = new MenuResto[10];
        food[ID].setNama(nama);
        food[ID].setHarga(harga);
        food[ID].setStok(stok);
    }
    
    public  boolean isOutOfStok(int id){
        if(makanan[ID].getStok()==0){
            return true;
        }else{
            return false;
        }
    }
        
    public  void showMakanan(){
        for(int i=0; i<=ID ; i++){
            if(!isOutOfStok(i)){
                System.out.println(makanan[i].getNama()+ "[" + makanan[i].getStok() + "]" + "\tRp. " + makanan[i].getHarga());
            }
        }
    }


    public  void order(String nama, int terjual){
            for(int i=0; i<=ID ; i++){
            if(!isOutOfStok(i)){
                if(makanan[i].getNama() == nama){
                    if(terjual<=makanan[i].getStok()){
                        System.out.println("Maaf stok tersisa sebanyak" + makanan[i].getStok());
                        System.out.println(terjual);
                       // makanan[i].getStok() -= terjual;
                    }else{
                        System.out.println("Maaf stok tersisa sebanyak" + makanan[i].getStok());
                    }
                }else{
                    System.out.println("Makanan tidak tersedia");
                    }
            }else{
                    System.out.println("Stok kosong");
                    }
        }
    }

}
