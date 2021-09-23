
package oop;
import java.util.Scanner;
public class P2_Soal5 {
    public static void main(String[] args){
        String A,B,upA,upB,charA1,charB1,charA2,charB2;
        int length;
            Scanner scan = new Scanner(System.in);
            A = scan.nextLine();
            B = scan.nextLine();
            System.out.println("===========");
            length= A.length()+ B.length();
            System.out.println(length);
            
            charA1 = A.substring(0,1);
            charB1 = B.substring(0,1);
            int hasil = charA1.compareTo(charB1);
            if(hasil>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
            upA = charA1.toUpperCase();
            upB = charB1.toUpperCase();
            charA2 = A.substring(1,A.length());
            charB2 = B.substring(1,B.length());
            System.out.println(upA+charA2+" "+upB+charB2);
    }
}
