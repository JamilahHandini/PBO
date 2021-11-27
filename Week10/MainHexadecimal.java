
package Week10;

import java.util.Scanner;

public class MainHexadecimal {
    public static void main(String[] args) throws ExceptionOfHexadecimal{

        int i;
        String s = new String();
        Scanner read = new Scanner(System.in);
        System.out.println(" enter the number ");

        try{
            s=read.nextLine();
            i=Integer.parseInt(s,16);
            System.out.println("entered number is hexaDecimal :   " + i);

        }  catch(NumberFormatException e)  {

            try{
            throw new ExceptionOfHexadecimal();
            }catch(ExceptionOfHexadecimal ex)
            {
                System.out.println("caught exception " + ex);
            }

        }  catch(Exception e)
        {
            System.out.println(" generic ");
        }
}
}
