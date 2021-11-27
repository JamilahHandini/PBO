
package Week10;
import java.util.Scanner;
import java.io.FileInputStream;

public class Percobaan {
    Scanner input = new Scanner(System.in);

    public void pembagian(){
        System.out.println("Angka 1: ");
        int angka1 = input.nextInt();
        System.out.println("Angka 2: ");
        int angka2 = input.nextInt();
        int hasil = angka1/angka2;
        System.out.println("Hasil: "+hasil);        
    }
    
    public void MelibatkanArray(){  
        int i=0;
            String greeting[]={"Politeknik", "Negeri", "Bandung"};
        while(i<4){
            System.out.println(greeting[i]);
        i++;
        }
    }
    
    public void MustInteger(){
        int a = input.nextInt();
    }
    
    /*public void File(){ 
        FileInputStream file = null;
        file = new FileInputStream ("file.txt");
    }*/
String a;
public static void main(String[] args){
    Percobaan p = new Percobaan();
    //p.pembagian();
    //p.MelibatkanArray();
    //p.MustInteger();
    //p.File();
    System.out.println(p.a);
}
}
