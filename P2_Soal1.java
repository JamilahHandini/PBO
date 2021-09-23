
package oop;
import java.util.Iterator;
import java.util.Scanner;

public class P2_Soal1 {
    public static void main(String[] args){
    System.out.println("Welcome!");

    for(int i=0; i<=6;i++){
    System.out.println(" ");
    System.out.println("Input value: ");
        String nilai, angka;
        Scanner read = new Scanner (System.in);
        angka = read.nextLine();
        nilai = angka;
        Scanner scanner = new Scanner(nilai);
        System.out.println(" ");

        while (scanner.hasNext()) {
            if (scanner.hasNextByte()) {
                System.out.println(scanner.nextByte() + " Can be fitted in:");
                System.out.println(" * Byte");
                System.out.println(" * Short");
                System.out.println(" * Int");
                System.out.println(" * Long");
            } else if (scanner.hasNextShort()) {
                System.out.println(scanner.nextShort() + " Can be fitted in:");
                System.out.println(" * Short");
                System.out.println(" * Int");
                System.out.println(" * Long");
            } else if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt() + " Can be fitted in:");
                System.out.println(" * Int");
                System.out.println(" * Long");
            } else if (scanner.hasNextLong()) {
                System.out.println(scanner.nextLong() + " Can be fitted in:");
                System.out.println(" * Long");
            } else {
                System.out.println(scanner.next() + " Can't be fitted anywhere!");
            }
        }
        scanner.close();
        }
    }
}
