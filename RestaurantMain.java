

package PBO;

/**
 *
 * @author ASUS PRO
 */
import java.util.Scanner;
public class RestaurantMain {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String jajan= "";
        int banyak=0;
        Order menu = new Order();
		
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
                menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
                
                menu.tampilMenuMakanan();
                
                System.out.println("===============JAJAN APA================");
                jajan = read.nextLine();
                System.out.println("===============BERAPA BIJI================");
                banyak = read.nextInt();

        
        
        

        if(jajan.equals("Gehu")){
        menu.pemesanan("Gehu", banyak);
        System.out.println("===============AYO BAYAR================");
        System.out.println(banyak*1000);
        System.out.println("===============STOK TERSISA================");
        menu.tampilMenuMakanan();
        }
        if(jajan.equals("Bala-Bala")){
        System.out.println("===============AYO BAYAR================");
        System.out.println(banyak*1000);
        menu.pemesanan("Bala-Bala", banyak);
        System.out.println("===============STOK TERSISA================");
        menu.tampilMenuMakanan();
        }
        if(jajan.equals("Tahu")){
        System.out.println("===============AYO BAYAR================");
        System.out.println(banyak*1000);
        menu.pemesanan("Tahu", banyak);
        System.out.println("===============STOK TERSISA================");
        menu.tampilMenuMakanan();
        }
        if(jajan.equals("Molen")){
        System.out.println("===============AYO BAYAR================");
        System.out.println(banyak*1000);
        menu.pemesanan("Molen", banyak);
        System.out.println("===============STOK TERSISA================");
        menu.tampilMenuMakanan();
        }
       
    }
}
